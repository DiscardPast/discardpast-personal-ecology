package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.house.House;
import com.discardpast.louwailou.dao.user.User;
import com.discardpast.louwailou.dao.user.UserHouseList;
import com.discardpast.louwailou.dao.user.UserType;
import com.discardpast.louwailou.dao.user.client.Client;
import com.discardpast.louwailou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/list")
    private List<User> getUserList() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/client/list")
    private List<Client> getUserClientList(@RequestParam(value = "userKey")String userKey)
    {
        return userRepository.findUserByUserKey(userKey).getConsultantClientList().getClientList();
    }

    @PostMapping(value = "/add")
    private User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "/id")
    private Optional<User> getUserById(@RequestParam(value = "userId") Integer userId)
    {
        return userRepository.findById(userId);
    }

    @GetMapping(value = "/userKey")
    private User getUserById(@RequestParam(value = "userKey") String userKey)
    {
        return userRepository.findUserByUserKey(userKey);
    }

    @GetMapping(value = "/get/interesting")
    private List<House> getUserInterestingHouseList(@RequestParam(value = "userKey")String userKey)
    {
        return userRepository.findUserByUserKey(userKey).getUserHouseList().getHouseList();
    }

    @PostMapping(value = "/consultant")
    private User updateUserToConsultant(@RequestParam(value = "userKey") String userKey,@RequestBody User user)
    {
        User oldUser = userRepository.findUserByUserKey(userKey);
        oldUser.setUserName(user.getUserName());
        oldUser.setUserPhone(user.getUserPhone());
        oldUser.setIdCardPositive(user.getIdCardPositive());
        oldUser.setUserType(UserType.CONSYLTANT);
        oldUser.setUserBonus(0);
        oldUser.setStaffCode(user.getStaffCode());
        oldUser.setIdCardBack(user.getIdCardBack());
        oldUser.setPhoneCode(user.getPhoneCode());
        return userRepository.saveAndFlush(oldUser);
    }

    @PostMapping(value = "/add/interesting")
    private String addInterestingHouse(@RequestParam(value = "userKey") String userKey,@RequestBody House house)
    {
        User user = userRepository.findUserByUserKey(userKey);
        UserHouseList userHouseList = user.getUserHouseList();
        List<House> houseList = userHouseList.getHouseList();
        houseList.add(house);
        userHouseList.setHouseList(houseList);
        user.setUserHouseList(userHouseList);
        userRepository.saveAndFlush(user);
        return "ok";
    }

    @PostMapping(value = "/input")
    private String getInput(@RequestBody User user)
    {
        user = user;
        System.out.println(user.getUserName());
        System.out.println(user.getUserPhone());
        userRepository.save(user);
        return "ok";
    }
}

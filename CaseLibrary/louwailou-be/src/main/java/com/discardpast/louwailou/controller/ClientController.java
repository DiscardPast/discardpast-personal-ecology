package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.Util;
import com.discardpast.louwailou.dao.user.ConsultantClientList;
import com.discardpast.louwailou.dao.user.User;
import com.discardpast.louwailou.dao.user.admin.ClientList;
import com.discardpast.louwailou.dao.user.client.Client;
import com.discardpast.louwailou.repository.ClientRepository;
import com.discardpast.louwailou.repository.StaffRepository;
import com.discardpast.louwailou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    private List<Client> getClientList(){
        return clientRepository.findAll();
    }

    @GetMapping("/id")
    private Optional<Client> getClient(@RequestParam(value = "clientId") Integer clientId){
        return clientRepository.findById(clientId);
    }

    @PostMapping("/add")
    private String addClient(@RequestBody Client client,@RequestParam(value = "staffCode") String staffCode,
                             @RequestParam(value = "userKey") String userKey){
        client.setStaff(staffRepository.findByStaffCode(staffCode));

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        client.setStaffValidityStart(new Date(calendar.getTimeInMillis()));
        calendar.add(Calendar.MONTH,2);
        client.setStaffValidityStop(new Date(calendar.getTimeInMillis()));
        client.setStaffLastTime(new Date(calendar.getTimeInMillis()));
        clientRepository.save(client);

        User user = userRepository.findUserByUserKey(userKey);
        System.out.println("------------------" + user.getConsultantClientList());
        ConsultantClientList consultantClientList = user.getConsultantClientList();
        List clientList = consultantClientList.getClientList();
        clientList.add(client);
        consultantClientList.setClientList(clientList);
        user.setConsultantClientList(consultantClientList);
        userRepository.save(user);
        return "ok";
    }
}

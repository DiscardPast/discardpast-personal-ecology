package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.user.staff.Staff;
import com.discardpast.louwailou.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @GetMapping("/list")
    private List<Staff> getStaffList(){
        return staffRepository.findAll();
    }

    @GetMapping("/id")
    private Optional<Staff> getStaff(@RequestParam(value = "staffId") Integer staffId)
    {
        return staffRepository.findById(staffId);
    }

    @GetMapping("/code")
    private Staff getStaffByStaffCode(@RequestParam(value = "staffCode") String staffCode)
    {
        return staffRepository.findByStaffCode(staffCode);
    }

    @PostMapping("/add")
    private String addStaff(@RequestBody Staff staff){
        staffRepository.save(staff);
        return "ok";
    }
}

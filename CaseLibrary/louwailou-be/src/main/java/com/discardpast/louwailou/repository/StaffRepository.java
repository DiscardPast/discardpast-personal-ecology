package com.discardpast.louwailou.repository;

import com.discardpast.louwailou.dao.user.staff.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Integer> {

    Staff findByStaffCode(String code);
}

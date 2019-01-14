package com.discardpast.louwailou.repository;

import com.discardpast.louwailou.dao.house.House;
import com.discardpast.louwailou.dao.house.ProgramType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HouseRepository extends JpaRepository<House,Integer> {

    List<House> findAllByProgramTypeAndHouseUserTitleLikeOrHouseConsultantTitleLikeOrHouseContentLike(ProgramType programType,
                                                                                                      String searchValueUserTitle,
                                                                                                      String searchValueConsultantTitle,
                                                                                                      String searchValueHouseContent);
}

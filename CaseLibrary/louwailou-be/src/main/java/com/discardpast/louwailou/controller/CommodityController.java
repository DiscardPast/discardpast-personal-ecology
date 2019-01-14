package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.mall.Commodity;
import com.discardpast.louwailou.repository.CommodityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private CommodityRepository commodityRepository;

    @GetMapping(value = "/id")
    private Optional<Commodity> getCommodity(@RequestParam(value = "commodityId") Integer commodityId)
    {
        return commodityRepository.findById(commodityId);
    }
}

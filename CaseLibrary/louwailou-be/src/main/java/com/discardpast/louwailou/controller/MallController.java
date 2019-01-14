package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.mall.Commodity;
import com.discardpast.louwailou.dao.mall.CommodityList;
import com.discardpast.louwailou.dao.mall.Mall;
import com.discardpast.louwailou.dao.mall.MallImageList;
import com.discardpast.louwailou.repository.CommodityRepository;
import com.discardpast.louwailou.repository.MallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mall")
public class MallController {

    @Autowired
    private MallRepository mallRepository;

    @Autowired
    private CommodityRepository commodityRepository;

    @GetMapping(value = "/list")
    private List<Mall> getMallList(){
       Mall mall = new Mall();
        MallImageList mallImageList = new MallImageList();
        List<String> mallImageListArrayList = mallImageList.getMallImageListItemList();
        mallImageListArrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        mallImageListArrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        mallImageListArrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        mallImageListArrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/music.jpg?x-oss-process=style/yasuo");

        Commodity commodity = new Commodity();
        commodity.setCommodityPrice(68);
        commodity.setCommodityIntegral(1000);
        commodity.setCommodityTitle("茶杯");
        commodity.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodityRepository.save(commodity);

        Commodity commodity1 = new Commodity();
        commodity1.setCommodityPrice(70);
        commodity1.setCommodityIntegral(1000);
        commodity1.setCommodityTitle("暖水壶");
        commodity1.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity1.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity1.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity1.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodityRepository.save(commodity1);

        Commodity commodity2 = new Commodity();
        commodity2.setCommodityPrice(68);
        commodity2.setCommodityIntegral(1000);
        commodity2.setCommodityTitle("水杯");
        commodity2.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity2.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity2.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity2.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodityRepository.save(commodity2);

        Commodity commodity3 = new Commodity();
        commodity3.setCommodityPrice(68);
        commodity3.setCommodityIntegral(1000);
        commodity3.setCommodityTitle("茶杯");
        commodity3.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity3.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity3.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodity3.getCommodityImageList().getCommodityImageList().add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        commodityRepository.save(commodity3);

        CommodityList commodities = new CommodityList();
        List<Commodity> commodities1 = commodities.getCommodityList();
        commodities1.add(commodity);
        commodities1.add(commodity1);
        commodities1.add(commodity2);
        commodities1.add(commodity3);
        commodities.setCommodityList(commodities1);
        mall.setCommodityList(commodities);
        mallImageList.setMallImageListItemList(mallImageListArrayList);
        mall.setMallImageList(mallImageList);
        mallRepository.save(mall);
        return mallRepository.findAll();
    }

    @PostMapping(value = "/add")
    private String addMall(@RequestBody Mall mall) {
        mallRepository.save(mall);
        return "ok";
    }
}

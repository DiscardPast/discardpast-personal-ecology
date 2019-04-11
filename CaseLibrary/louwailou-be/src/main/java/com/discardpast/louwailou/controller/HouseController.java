package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.dao.comment.Comment;
import com.discardpast.louwailou.dao.house.*;
import com.discardpast.louwailou.dao.user.User;
import com.discardpast.louwailou.dao.user.UserType;
import com.discardpast.louwailou.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    @GetMapping(value = "/list")
    private List<House> getHouse()
    {
        return houseRepository.findAll();
    }

/*    @GetMapping(value = "/list/hot")
    private List<House> getHotHouse(){
        return ;
    }*/

    @GetMapping(value = "/id")
    private Optional<House> getHouseById(@RequestParam(value = "houseId") Integer houseId)
    {
        return houseRepository.findById(houseId);
    }

    @GetMapping(value = "/list/title")
    private List<House> getHousesByHouseTitle(@RequestParam(value = "programType") ProgramType programType,
                                              @RequestParam(value = "searchValueUserTitle") String searchValueUserTitle,
                                              @RequestParam(value = "searchValueConsultantTitle") String searchValueConsultantTitle,
                                              @RequestParam(value = "searchValueHouseContent") String searchValueHouseContent)
    {
        return houseRepository.
                findAllByProgramTypeAndHouseUserTitleLikeOrHouseConsultantTitleLikeOrHouseContentLike(programType,"%" + searchValueUserTitle + "%",
                        "%" + searchValueConsultantTitle + "%","%" + searchValueHouseContent + "%");
    }



    /*@PostMapping(value = "/add")
    private House addHouse() {
        House house = new House();
        HouseImageLinkList houseImageLinkList = new HouseImageLinkList();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        arrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        arrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        arrayList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        houseImageLinkList.setHouseImageLinkList(arrayList);
        house.setHouseImageLinkList(houseImageLinkList);
        house.setHouseConsultantTitle("asdasdadwddw");
        HousePoint housePoint = new HousePoint();
        house.setHousePoint(housePoint);
        HouseType houseType = new HouseType();
        HouseType houseType1 = new HouseType();
        houseType.setHouseTypeName("一居室");
        houseType1.setHouseTypeName("二居室");
        HouseTypeItem houseTypeItem1 = new HouseTypeItem();
        houseTypeItem1.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        HouseTypeItem houseTypeItem2 = new HouseTypeItem();
        houseTypeItem2.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        ArrayList<HouseTypeItem> houseTypeItems = new ArrayList<HouseTypeItem>();
        houseTypeItems.add(houseTypeItem1);
        houseTypeItems.add(houseTypeItem2);
        houseType.setHouseTypeList(houseTypeItems);
        houseType1.setHouseTypeList(houseTypeItems);
        ArrayList<HouseType> houseTypeList = new ArrayList<>();
        houseTypeList.add(houseType);
        houseTypeList.add(houseType1);
        HouseTypeList houseTypeList1 = new HouseTypeList();
        houseTypeList1.setHouseTypeList(houseTypeList);
        house.setHouseTypeList(houseTypeList1);
        ProgramDynamic programDynamic = new ProgramDynamic();
        ArrayList<ProgramDynamicItem> programDynamicItems = new ArrayList<>();
        ProgramDynamicItem programDynamicItem = new ProgramDynamicItem();
        ProgramDynamicItem programDynamicItem1 = new ProgramDynamicItem();
        ProgramDynamicTip programDynamicTip = new ProgramDynamicTip();
        ProgramDynamicTip programDynamicTip1 = new ProgramDynamicTip();
        programDynamicItem.setProgramDynamicTip(programDynamicTip);
        programDynamicItems.add(programDynamicItem);
        programDynamicItems.add(programDynamicItem1);
        ArrayList<ProgramDynamicTip> programDynamicTips = new ArrayList<>();
        programDynamicTips.add(programDynamicTip);
        programDynamicTips.add(programDynamicTip1);
        programDynamic.setProgramDynamicItemList(programDynamicItems);
        programDynamic.setProgramDynamicTipList(programDynamicTips);

        User user = new User();
        user.setUserType(UserType.CONSYLTANT);
        user.setUserAvatar("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        User user2 = new User();
        user.setUserType(UserType.USER);
        user2.setUserAvatar("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        ArrayList<Comment> commentArrayList = new ArrayList<>();
        Comment comment1 = new Comment();
        Comment comment2 = new Comment();
        comment1.setCommentUser(user);
        comment2.setCommentUser(user2);
        commentArrayList.add(comment1);
        commentArrayList.add(comment2);
        HouseCommentList houseCommentList = new HouseCommentList();
        houseCommentList.setCommentList(commentArrayList);
        house.setHouseCommentList(houseCommentList);
        house.setProgramDynamic(programDynamic);
        house.setProgramType(ProgramType.APARTMENT);
        return houseRepository.save(house);
    }*/

    @PostMapping(value = "/add")
    private House addHouse(@RequestBody House house)
    {
        return houseRepository.save(house);
    }

/*    @PatchMapping(value = "/update")
    private String updateHouse(){
        House existHouse = houseRepository.getOne(53);
        List<String> existHouseImageLinkList = existHouse.getHouseImageLinkList().getHouseImageLinkList();
        existHouseImageLinkList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/article.jpg?x-oss-process=style/yasuo");
        existHouseImageLinkList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/code.jpg?x-oss-process=style/yasuo");
        existHouseImageLinkList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/music.jpg?x-oss-process=style/yasuo");
        existHouseImageLinkList.add("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/personal.jpg?x-oss-process=style/yasuo");
        existHouse.getHouseImageLinkList().setHouseImageLinkList(existHouseImageLinkList);

        HousePoint housePoint = existHouse.getHousePoint();
        housePoint.setStay0(false);
        housePoint.setStay1(false);
        housePoint.setStay2(true);
        housePoint.setStay3(true);
        housePoint.setStay4(true);
        existHouse.setHousePoint(housePoint);

        HouseTypeList houseTypeList = existHouse.getHouseTypeList();
        List<HouseType> houseTypeList1 = houseTypeList.getHouseTypeList();
        HouseType houseType = new HouseType();
        List<HouseTypeItem> houseTypeItems = houseType.getHouseTypeList();
        HouseTypeItem houseTypeItem = new HouseTypeItem();
        houseTypeItem.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/1231.jpg?x-oss-process=style/yasuo");
        houseTypeItem.setHouseTypeContent("啊十大哇塞水水水水水水水水达瓦达瓦达瓦");
        HouseTypeItem houseTypeItem1 = new HouseTypeItem();
        houseTypeItem1.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/12.jpg?x-oss-process=style/yasuo");
        houseTypeItem1.setHouseTypeContent("啃了两口啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");
        HouseTypeItem houseTypeItem2 = new HouseTypeItem();
        houseTypeItem2.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/12.jpg?x-oss-process=style/yasuo");
        houseTypeItem2.setHouseTypeContent("啃撒大苏打娃娃啦啦啦啦啦啦啦啦啦啦啦啦");
        houseTypeItems.add(houseTypeItem);
        houseTypeItems.add(houseTypeItem1);
        houseTypeItems.add(houseTypeItem2);

        HouseType houseType1 = new HouseType();
        List<HouseTypeItem> houseTypeItems1 = houseType1.getHouseTypeList();
        HouseTypeItem houseTypeItem11 = new HouseTypeItem();
        houseTypeItem11.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/1231.jpg?x-oss-process=style/yasuo");
        houseTypeItem11.setHouseTypeContent("啊十大哇塞水水水水水水水水达瓦达瓦达瓦");
        HouseTypeItem houseTypeItem12 = new HouseTypeItem();
        houseTypeItem12.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/12.jpg?x-oss-process=style/yasuo");
        houseTypeItem12.setHouseTypeContent("啃了两口啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");
        HouseTypeItem houseTypeItem21 = new HouseTypeItem();
        houseTypeItem21.setHouseTypeImageLink("https://discardpast.oss-cn-hangzhou.aliyuncs.com/IndexResources/12.jpg?x-oss-process=style/yasuo");
        houseTypeItem21.setHouseTypeContent("啃撒大苏打娃娃啦啦啦啦啦啦啦啦啦啦啦啦");
        houseTypeItems1.add(houseTypeItem);
        houseTypeItems1.add(houseTypeItem1);
        houseTypeItems1.add(houseTypeItem2);
        houseTypeList1.add(houseType);
        houseTypeList1.add(houseType1);
        houseTypeList.setHouseTypeList(houseTypeList1);
        existHouse.setHouseTypeList(houseTypeList);

        ProgramDynamic programDynamic = existHouse.getProgramDynamic();
        List<ProgramDynamicTip> programDynamicTipList = programDynamic.getProgramDynamicTipList();
        ProgramDynamicTip programDynamicTip = new ProgramDynamicTip();
        programDynamicTip.setProgramDynamicTipTitle("项目动态一");
        programDynamicTip.setProgramDynamicTipCount(2);
        ProgramDynamicTip programDynamicTip1 = new ProgramDynamicTip();
        programDynamicTip1.setProgramDynamicTipTitle("项目动态二");
        programDynamicTip1.setProgramDynamicTipCount(21);
        programDynamicTipList.add(programDynamicTip);
        programDynamicTipList.add(programDynamicTip1);
        existHouse.setProgramDynamic(programDynamic);

        houseRepository.save(existHouse);

        return "ok";
    }*/
    @PostMapping(value = "/update")
    private String updateHouse(@RequestBody House house){
        houseRepository.save(house);
        return "ok";
    }
}

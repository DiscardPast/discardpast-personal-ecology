package com.discardpast.louwailou.dao.house;

import com.discardpast.louwailou.dao.comment.Comment;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class House implements Serializable {

    @Id
    @GeneratedValue
    //房源信息ID
    private Integer houseId;

    //房源轮播图
    @Lob
    private HouseImageLinkList houseImageLinkList;

    //用户房源名称
    private String houseUserTitle;

    //顾问房源名称
    private String houseConsultantTitle;

    //房源售价描述
    private String housePrice;

    //房源户型描述
    private String houseTypeText;

    //房源面积描述
    private String houseArea;

    //房源特点
    @Lob
    private HousePoint housePoint;

    //房源文案
    private String houseContent;

    //房源户型
    @Lob
    private HouseTypeList houseTypeList;

    //项目动态
    @Lob
    private ProgramDynamic programDynamic;

    //项目评论
    @Lob
    private HouseCommentList houseCommentList;

    //项目奖励金
    private String programBonus;

    //项目类型
    private ProgramType programType;

    //楼盘信息
    @Lob
    private PropertyInfo propertyInfo;

    public House(){
        this.houseImageLinkList = new HouseImageLinkList();
        this.housePoint = new HousePoint();
        this.houseTypeList = new HouseTypeList();
        this.programDynamic = new ProgramDynamic();
        this.houseCommentList = new HouseCommentList();
        this.programType = ProgramType.RESIDENCE;
        this.propertyInfo = new PropertyInfo();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public HouseImageLinkList getHouseImageLinkList() {
        return houseImageLinkList;
    }

    public void setHouseImageLinkList(HouseImageLinkList houseImageLinkList) {
        this.houseImageLinkList = houseImageLinkList;
    }

    public String getHouseUserTitle() {
        return houseUserTitle;
    }

    public void setHouseUserTitle(String houseUserTitle) {
        this.houseUserTitle = houseUserTitle;
    }

    public String getHouseConsultantTitle() {
        return houseConsultantTitle;
    }

    public void setHouseConsultantTitle(String houseConsultantTitle) {
        this.houseConsultantTitle = houseConsultantTitle;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }

    public String getHouseTypeText() {
        return houseTypeText;
    }

    public void setHouseTypeText(String houseTypeText) {
        this.houseTypeText = houseTypeText;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    public HousePoint getHousePoint() {
        return housePoint;
    }

    public void setHousePoint(HousePoint housePoint) {
        this.housePoint = housePoint;
    }

    public String getHouseContent() {
        return houseContent;
    }

    public void setHouseContent(String houseContent) {
        this.houseContent = houseContent;
    }

    public HouseTypeList getHouseTypeList() {
        return houseTypeList;
    }

    public void setHouseTypeList(HouseTypeList houseTypeList) {
        this.houseTypeList = houseTypeList;
    }

    public ProgramDynamic getProgramDynamic() {
        return programDynamic;
    }

    public void setProgramDynamic(ProgramDynamic programDynamic) {
        this.programDynamic = programDynamic;
    }

    public HouseCommentList getHouseCommentList() {
        return houseCommentList;
    }

    public void setHouseCommentList(HouseCommentList houseCommentList) {
        this.houseCommentList = houseCommentList;
    }

    public String getProgramBonus() {
        return programBonus;
    }

    public void setProgramBonus(String programBonus) {
        this.programBonus = programBonus;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    public PropertyInfo getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(PropertyInfo propertyInfo) {
        this.propertyInfo = propertyInfo;
    }
}

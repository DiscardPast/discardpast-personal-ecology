package com.discardpast.louwailou.action;

import com.discardpast.louwailou.domain.*;
import com.discardpast.louwailou.service.*;
import com.discardpast.louwailou.vo.HouseApartmentVo;
import com.discardpast.louwailou.vo.HouseVo;
import com.discardpast.louwailou.vo.ProjectTrendVo;
import com.discardpast.louwailou.vo.ProjectVo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @apiNote 房屋信息表(House)业务逻辑服务类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Component
public class HouseAction{

    @Autowired
    private HouseService houseService;

    @Autowired
    private HouseImageService houseImageService;

    @Autowired
    private HouseApartmentService houseApartmentService;

    @Autowired
    private HouseApartmentImageService houseApartmentImageService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectTrendService projectTrendService;

    public HouseVo getHouseVo(Long houseId)
    {
        House house = this.houseService.queryById(houseId);
        HouseVo houseVo = new HouseVo();
        houseVo.setArea(house.getArea());
        houseVo.setPrice(house.getPrice());
        houseVo.setTypes(house.getTypes());
        houseVo.setStructure(house.getStructure());
        houseVo.setAddress(house.getAddress());
        houseVo.setOpenTime(house.getOpenTime());
        houseVo.setBeat(house.getBeat());
        houseVo.setTitle(house.getTitle());
        houseVo.setConsultantTitle(house.getConsultantTitle());
        houseVo.setContent(house.getContent());
        houseVo.setBouns(house.getBouns());
        houseVo.setTips(house.getTips());
        List<HouseImage> houseImageList = this.houseImageService.queryHouseImageByHouseId(houseId);
        List<String> houseImageUrlList = Lists.newArrayList();
        for (HouseImage houseImage : houseImageList) {
            houseImageUrlList.add(houseImage.getImageUrl());
        }
        houseVo.setImageUrlList(houseImageUrlList);
        List<HouseApartmentVo> houseApartmentVoList = Lists.newArrayList();
        List<HouseApartment> houseApartmentList = this.houseApartmentService.queryHouseApartmentListByHouseId(houseId);
        List<Long> houseApartmentIdList = Lists.newArrayList();
        for (HouseApartment houseApartment : houseApartmentList) {
            houseApartmentIdList.add(houseApartment.getId());
        }
        List<HouseApartmentImage> houseApartmentImageList = this.houseApartmentImageService.queryHouseApartmentImageListByIdList(houseApartmentIdList);
        for (HouseApartment houseApartment : houseApartmentList) {

            HouseApartmentVo houseApartmentVo = new HouseApartmentVo();
            houseApartmentVo.setTitle(houseApartment.getTitle());
            houseApartmentVo.setText(houseApartment.getText());

            List<String> houseApartmentImageUrlList = Lists.newArrayList();
            for (HouseApartmentImage houseApartmentImage : houseApartmentImageList) {
                if(houseApartmentImage.getHouseApartmentId().equals(houseApartment.getId()))
                {
                    houseApartmentImageUrlList.add(houseApartmentImage.getImageUrl());
                }
            }
            houseApartmentVo.setImageUrlList(houseApartmentImageUrlList);
            houseApartmentVoList.add(houseApartmentVo);
        }
        houseVo.setHouseApartmentVoList(houseApartmentVoList);
        ProjectVo projectVo = new ProjectVo();
        Project project = this.projectService.queryById(house.getProjectId());
        projectVo.setDeveloper(project.getDeveloper());
        projectVo.setRegion(project.getRegion());
        projectVo.setSaleStatus(project.getSaleStatus());
        projectVo.setPropertyYears(project.getPropertyYears());
        projectVo.setPropertyType(project.getPropertyType());
        projectVo.setVolumeRate(project.getVolumeRate());
        projectVo.setGreeningRate(project.getGreeningRate());
        projectVo.setHouseholdsNum(project.getHouseholdsNum());
        projectVo.setPropertyCompany(project.getPropertyCompany());
        projectVo.setPropertyCosts(project.getPropertyCosts());
        projectVo.setDecorationStatus(project.getDecorationStatus());
        projectVo.setHandingHouseTime(project.getHandingHouseTime());
        projectVo.setParkingSpace(project.getParkingSpace());

        List<ProjectTrend> projectTrendList = this.projectTrendService.queryProjectTrendListByProjectId(house.getProjectId());
        List<ProjectTrendVo> projectTrendVoList = Lists.newArrayList();
        for (ProjectTrend projectTrend : projectTrendList) {
            ProjectTrendVo projectTrendVo = new ProjectTrendVo();
            projectTrendVo.setTip(projectTrend.getTip());
            projectTrendVo.setTitle(projectTrend.getTitle());
            projectTrendVo.setContent(projectTrend.getContent());
            projectTrendVoList.add(projectTrendVo);
        }
        projectVo.setProjectTrendVoList(projectTrendVoList);
        houseVo.setProjectVo(projectVo);
        return houseVo;
    }


}

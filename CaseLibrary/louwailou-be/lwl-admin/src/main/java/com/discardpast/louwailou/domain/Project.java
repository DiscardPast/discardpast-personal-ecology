package com.discardpast.louwailou.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 项目信息表(Project)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_project")
@ApiModel(value = "Project",description = "项目信息表")
public class Project extends DataEntity {

    /** 开发商 */
    @TableField(value="developer")
    @ApiModelProperty(name="developer",value = "开发商")
    private String developer;

    /** 区域 */
    @TableField(value="region")
    @ApiModelProperty(name="region",value = "区域")
    private String region;

    /** 售卖状态(0在售,1告罄,2未开盘) */
    @TableField(value="sale_status")
    @ApiModelProperty(name="saleStatus",value = "售卖状态(0在售,1告罄,2未开盘)")
    private Integer saleStatus;

    /** 产权年限 */
    @TableField(value="property_years")
    @ApiModelProperty(name="propertyYears",value = "产权年限")
    private Integer propertyYears;

    /** 物业类别(0住宅,1商铺,2公寓,3写字楼) */
    @TableField(value="property_type")
    @ApiModelProperty(name="propertyType",value = "物业类别(0住宅,1商铺,2公寓,3写字楼)")
    private Integer propertyType;

    /** 容积率 */
    @TableField(value="volume_rate")
    @ApiModelProperty(name="volumeRate",value = "容积率")
    private Integer volumeRate;

    /** 绿化率 */
    @TableField(value="greening_rate")
    @ApiModelProperty(name="greeningRate",value = "绿化率")
    private Integer greeningRate;

    /** 楼栋总户数 */
    @TableField(value="households_num")
    @ApiModelProperty(name="householdsNum",value = "楼栋总户数")
    private Integer householdsNum;

    /** 物业公司 */
    @TableField(value="property_company")
    @ApiModelProperty(name="propertyCompany",value = "物业公司")
    private String propertyCompany;

    /** 物业费 */
    @TableField(value="property_costs")
    @ApiModelProperty(name="propertyCosts",value = "物业费")
    private Integer propertyCosts;

    /** 装修状况(0毛坯,1精装,2豪装) */
    @TableField(value="decoration_status")
    @ApiModelProperty(name="decorationStatus",value = "装修状况(0毛坯,1精装,2豪装)")
    private Integer decorationStatus;

    /** 交房时间 */
    @TableField(value="handing_house_time")
    @ApiModelProperty(name="handingHouseTime",value = "交房时间")
    private Date handingHouseTime;

    /** 车位 */
    @TableField(value="parking_space")
    @ApiModelProperty(name="parkingSpace",value = "车位")
    private Long parkingSpace;

}

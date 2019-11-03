package com.discardpast.louwailou.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProjectVo {

    /** 开发商 */
    private String developer;

    /** 区域 */
    private String region;

    /** 售卖状态(0在售,1告罄,2未开盘) */
    private Integer saleStatus;

    /** 产权年限 */
    private Integer propertyYears;

    /** 物业类别(0住宅,1商铺,2公寓,3写字楼) */
    private Integer propertyType;

    /** 容积率 */
    private Integer volumeRate;

    /** 绿化率 */
    private Integer greeningRate;

    /** 楼栋总户数 */
    private Integer householdsNum;

    /** 物业公司 */
    private String propertyCompany;

    /** 物业费 */
    private Integer propertyCosts;

    /** 装修状况(0毛坯,1精装,2豪装) */
    private Integer decorationStatus;

    /** 交房时间 */
    private Date handingHouseTime;

    /** 车位 */
    private Long parkingSpace;

    /** 项目动态列表 */
    private List<ProjectTrendVo> projectTrendVoList;

}

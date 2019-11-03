package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 房屋户型信息表(HouseApartment)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_house_apartment")
@ApiModel(value = "HouseApartment",description = "房屋户型信息表")
public class HouseApartment extends DataEntity {

    /** 房屋id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋id")
    private Long houseId;

    /** 房屋标题 */
    @TableField(value="title")
    @ApiModelProperty(name="title",value = "房屋标题")
    private String title;

    /** 户型描述 */
    @TableField(value="text")
    @ApiModelProperty(name="text",value = "户型描述")
    private String text;

}

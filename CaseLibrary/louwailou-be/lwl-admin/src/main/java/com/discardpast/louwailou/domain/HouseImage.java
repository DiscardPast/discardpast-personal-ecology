package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 房屋信息图片表(HouseImage)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_house_image")
@ApiModel(value = "HouseImage",description = "房屋信息图片表")
public class HouseImage extends DataEntity {

    /** 房屋id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋id")
    private Long houseId;

    /** 房屋图片地址 */
    @TableField(value="image_url")
    @ApiModelProperty(name="imageUrl",value = "房屋图片地址")
    private String imageUrl;


}

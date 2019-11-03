package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 房屋信息图片表(HouseApartmentImage)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-31 11:59:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_house_apartment_image")
@ApiModel(value = "HouseApartmentImage",description = "房屋信息图片表")
public class HouseApartmentImage extends DataEntity{

    /** 房屋id */
    @TableField(value="house_apartment_id")
    @ApiModelProperty(name="houseApartmentId",value = "房屋id")
    private Long houseApartmentId;

    /** 房屋图片地址 */
    @TableField(value="image_url")
    @ApiModelProperty(name="imageUrl",value = "房屋图片地址")
    private String imageUrl;

}

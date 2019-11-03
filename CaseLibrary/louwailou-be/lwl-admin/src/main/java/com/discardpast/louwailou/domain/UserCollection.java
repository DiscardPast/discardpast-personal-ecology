package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 用户收藏表(UserCollection)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user_collection")
@ApiModel(value = "UserCollection",description = "用户收藏表")
public class UserCollection extends DataEntity {

    /** 用户id */
    @TableField(value="user_id")
    @ApiModelProperty(name="userId",value = "用户id")
    private Long userId;

    /** 房屋id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋id")
    private Long houseId;

    /** 收藏状态 */
    @TableField(value="collection_status")
    @ApiModelProperty(name="collectionStatus",value = "收藏状态")
    private Boolean collectionStatus;


}

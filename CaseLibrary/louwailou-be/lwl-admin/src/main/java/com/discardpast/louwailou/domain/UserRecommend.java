package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 用户推荐表(UserRecommend)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user_recommend")
@ApiModel(value = "UserRecommend",description = "用户推荐表")
public class UserRecommend extends DataEntity {

    /** 用户id */
    @TableField(value="user_id")
    @ApiModelProperty(name="userId",value = "用户id")
    private Long userId;

    /** 房屋id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋id")
    private Long houseId;

    /** 员工id */
    @TableField(value="staff_id")
    @ApiModelProperty(name="staffId",value = "员工id")
    private Long staffId;

    /** 跟进记录id */
    @TableField(value="follow_id")
    @ApiModelProperty(name="followId",value = "跟进记录id")
    private Long followId;

    /** 姓名 */
    @TableField(value="name")
    @ApiModelProperty(name="name",value = "姓名")
    private String name;

    /** 电话 */
    @TableField(value="phone")
    @ApiModelProperty(name="phone",value = "电话")
    private String phone;

    /** 性别(0未设置,1男,2女) */
    @TableField(value="gender")
    @ApiModelProperty(name="gender",value = "性别(0未设置,1男,2女)")
    private Integer gender;

    /** 备注 */
    @TableField(value="remark")
    @ApiModelProperty(name="remark",value = "备注")
    private String remark;


}

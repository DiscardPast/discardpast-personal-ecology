package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 用户表(User)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user")
@ApiModel(value = "User",description = "用户表")
public class User extends DataEntity {

    /** 员工id */
    @TableField(value="staff_id")
    @ApiModelProperty(name="staffId",value = "员工id")
    private Long staffId;

    /** 微信登录唯一key */
    @TableField(value="open_id")
    @ApiModelProperty(name="openId",value = "微信登录唯一key")
    private String openId;

    /** 昵称 */
    @TableField(value="nickname")
    @ApiModelProperty(name="nickname",value = "昵称")
    private String nickname;

    /** 性别(0未设置,1男,2女) */
    @TableField(value="gender")
    @ApiModelProperty(name="gender",value = "性别(0未设置,1男,2女)")
    private Integer gender;

    /** 头像 */
    @TableField(value="avatar")
    @ApiModelProperty(name="avatar",value = "头像")
    private String avatar;

    /** 用户类型(0普通用户,1置业顾问,2员工) */
    @TableField(value="user_type")
    @ApiModelProperty(name="userType",value = "用户类型(0普通用户,1置业顾问,2员工)")
    private Integer userType;

    /** 语言 */
    @TableField(value="language")
    @ApiModelProperty(name="language",value = "语言")
    private String language;

    /** 国家 */
    @TableField(value="country")
    @ApiModelProperty(name="country",value = "国家")
    private String country;

    /** 省份 */
    @TableField(value="province")
    @ApiModelProperty(name="province",value = "省份")
    private String province;

    /** 城市 */
    @TableField(value="city")
    @ApiModelProperty(name="city",value = "城市")
    private String city;

    /** 身份证正面 */
    @TableField(value="id_card_front")
    @ApiModelProperty(name="idCardFront",value = "身份证正面")
    private String idCardFront;

    /** 名片 */
    @TableField(value="visiting_card")
    @ApiModelProperty(name="visitingCard",value = "名片")
    private String visitingCard;

    /** 电话 */
    @TableField(value="phone")
    @ApiModelProperty(name="phone",value = "电话")
    private String phone;


}

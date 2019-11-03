package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 员工表(Staff)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_staff")
@ApiModel(value = "Staff",description = "员工表")
public class Staff extends DataEntity {

    /** 员工编码 */
    @TableField(value="code")
    @ApiModelProperty(name="code",value = "员工编码")
    private String code;

    /** 员工性别 */
    @TableField(value="gender")
    @ApiModelProperty(name="gender",value = "员工性别")
    private Integer gender;

    /** 员工姓名 */
    @TableField(value="name")
    @ApiModelProperty(name="name",value = "员工姓名")
    private String name;

    /** 员工电话 */
    @TableField(value="phone")
    @ApiModelProperty(name="phone",value = "员工电话")
    private String phone;

    /** 员工账号 */
    @TableField(value="username")
    @ApiModelProperty(name="username",value = "员工账号")
    private String username;

    /** 员工密码 */
    @TableField(value="password")
    @ApiModelProperty(name="password",value = "员工密码")
    private String password;


}

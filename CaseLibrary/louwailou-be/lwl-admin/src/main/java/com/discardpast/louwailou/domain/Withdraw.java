package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 用户提现表(Withdraw)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_withdraw")
@ApiModel(value = "Withdraw",description = "用户提现表")
public class Withdraw extends DataEntity {

    /** 用户id */
    @TableField(value="user_id")
    @ApiModelProperty(name="userId",value = "用户id")
    private Long userId;

    /** 管理员id */
    @TableField(value="admin_id")
    @ApiModelProperty(name="adminId",value = "管理员id")
    private Long adminId;

    /** 提现状态(0待提现，1已提现) */
    @TableField(value="status")
    @ApiModelProperty(name="status",value = "提现状态(0待提现，1已提现)")
    private Integer status;

    /** 金额 */
    @TableField(value="amount")
    @ApiModelProperty(name="amount",value = "金额")
    private Long amount;

    /** 票据存根 */
    @TableField(value="counterfoil")
    @ApiModelProperty(name="counterfoil",value = "票据存根")
    private String counterfoil;


}

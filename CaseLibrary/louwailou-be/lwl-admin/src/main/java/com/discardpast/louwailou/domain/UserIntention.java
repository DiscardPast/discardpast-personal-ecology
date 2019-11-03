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
 * @apiNote 用户意向表(UserIntention)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user_intention")
@ApiModel(value = "UserIntention",description = "用户意向表")
public class UserIntention extends DataEntity {

    /** 房屋id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋id")
    private Long houseId;

    /** 用户id */
    @TableField(value="user_id")
    @ApiModelProperty(name="userId",value = "用户id")
    private Long userId;

    /** 跟进记录id */
    @TableField(value="follow_id")
    @ApiModelProperty(name="followId",value = "跟进记录id")
    private Long followId;

    /** 备注 */
    @TableField(value="remark")
    @ApiModelProperty(name="remark",value = "备注")
    private String remark;

    /** 带看时间 */
    @TableField(value="take_time")
    @ApiModelProperty(name="takeTime",value = "带看时间")
    private Date takeTime;


}

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
 * @apiNote 跟进记录表(FollowRecord)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_follow_record")
@ApiModel(value = "FollowRecord",description = "跟进记录表")
public class FollowRecord extends DataEntity {

    /** 跟进时间 */
    @TableField(value="follow_time")
    @ApiModelProperty(name="followTime",value = "跟进时间")
    private Date followTime;

    /** 跟进记录 */
    @TableField(value="follow_content")
    @ApiModelProperty(name="followContent",value = "跟进记录")
    private String followContent;

    /** 跟进状态(0跟进中,1未开始,2已失效) */
    @TableField(value="follow_status")
    @ApiModelProperty(name="followStatus",value = "跟进状态(0跟进中,1未开始,2已失效)")
    private Integer followStatus;


}

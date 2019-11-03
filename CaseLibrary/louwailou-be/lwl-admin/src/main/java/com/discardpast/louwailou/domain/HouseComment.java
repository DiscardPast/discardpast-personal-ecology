package com.discardpast.louwailou.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.discardpast.louwailou.base.domain.DataEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @apiNote 房屋评论信息表(HouseComment)实体类
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_house_comment")
@ApiModel(value = "HouseComment",description = "房屋评论信息表")
public class HouseComment extends DataEntity {

    /** 房屋信息id */
    @TableField(value="house_id")
    @ApiModelProperty(name="houseId",value = "房屋信息id")
    private Long houseId;

    /** 评论用户id */
    @TableField(value="comment_member_id")
    @ApiModelProperty(name="commentUserId",value = "评论用户id")
    private Long commentUserId;

    /** 回复评论id */
    @TableField(value="reply_comment_id")
    @ApiModelProperty(name="replyCommentId",value = "回复评论id")
    private Long replyCommentId;

    /** 回复评论用户id */
    @TableField(value="reply_member_id")
    @ApiModelProperty(name="replyUserId",value = "回复评论用户id")
    private Long replyUserId;

    /** 评论类型（0信息评论 1回复评论） */
    @TableField(value="comment_type")
    @ApiModelProperty(name="commentType",value = "评论类型（0信息评论 1回复评论）")
    private Integer commentType;

    /** 评论内容 */
    @TableField(value="content")
    @ApiModelProperty(name="content",value = "评论内容")
    private String content;

    /** 是否已读 */
    @TableField(value="read_status")
    @ApiModelProperty(name="readStatus",value = "是否已读")
    private Boolean readStatus;

    /** 点赞数量 */
    @TableField(value="like")
    @ApiModelProperty(name="like",value = "点赞数量")
    private Integer like;


}

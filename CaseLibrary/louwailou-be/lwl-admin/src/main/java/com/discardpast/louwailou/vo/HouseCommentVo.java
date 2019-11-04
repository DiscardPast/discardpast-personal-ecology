package com.discardpast.louwailou.vo;

import lombok.Data;

/**
 * 房屋评论信息vo
 *
 * @author discardpast@yeah.net
 */

@Data
public class HouseCommentVo {

    /** 评论类型（0信息评论 1回复评论） */
    private Integer commentType;

    /** 评论内容 */
    private String content;

    /** 是否已读 */
    private Boolean readStatus;

    /** 点赞数量 */
    private Integer like;

}

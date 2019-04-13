package com.discardpast.louwailou.dao.comment;

import com.discardpast.louwailou.dao.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Comment implements Serializable {

    //评论Id
    @Id
    @GeneratedValue
    private Integer commentId;

    //所属用户
    @Lob
    private User commentUser;

    //评论内容
    private String commentContent;

    //评论日期
    private Date commentDate;

    //评论获赞数量
    private Integer commentZanCount;

    //评论踩人数
    private Integer commentDislikeCount;

    public Comment(){
        this.commentUser = new User();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public User getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(User commentUser) {
        this.commentUser = commentUser;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getCommentZanCount() {
        return commentZanCount;
    }

    public void setCommentZanCount(Integer commentZanCount) {
        this.commentZanCount = commentZanCount;
    }

    public Integer getCommentDislikeCount() {
        return commentDislikeCount;
    }

    public void setCommentDislikeCount(Integer commentDislikeCount) {
        this.commentDislikeCount = commentDislikeCount;
    }
}

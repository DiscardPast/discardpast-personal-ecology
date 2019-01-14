package com.discardpast.louwailou.dao.house;

import com.discardpast.louwailou.dao.comment.Comment;

import javax.persistence.Lob;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseCommentList implements Serializable {

    private List<Comment> commentList;

    public HouseCommentList()
    {
        this.commentList = new ArrayList<Comment>();
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}

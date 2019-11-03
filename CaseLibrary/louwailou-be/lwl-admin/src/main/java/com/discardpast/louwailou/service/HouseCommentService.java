package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.HouseComment;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋评论信息表(HouseComment)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface HouseCommentService {

    /**
     * 通过id查询一条房屋评论信息表数据
     * @param id
     * @return
     */
     HouseComment queryById(Long id);

    /**
     * 通过UserId查询一条房屋评论信息表数据
     *
     * @param userId
     * @return
     */
     List<HouseComment> queryHouseCommentByUserId(Long userId);


    /**
     * 插入一条房屋评论信息表数据
     * @param houseComment
     * @return
     */
     Integer addHouseComment(HouseComment houseComment);

    /**
     * 更新一条房屋评论信息表数据
     * @param houseComment
     * @return
     */
     Integer updateHouseComment(HouseComment houseComment);

    /**
     * 移除一条房屋评论信息表数据
     * @param id
     * @return
     */
     Integer deleteHouseCommentById(Long id);
}

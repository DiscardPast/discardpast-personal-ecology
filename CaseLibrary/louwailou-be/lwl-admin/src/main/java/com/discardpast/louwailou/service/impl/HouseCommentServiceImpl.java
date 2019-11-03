package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.HouseCommentService;
import com.discardpast.louwailou.mapper.HouseCommentMapper;
import com.discardpast.louwailou.domain.HouseComment;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 房屋评论信息表(HouseComment)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class HouseCommentServiceImpl implements HouseCommentService {

    @Autowired
    private HouseCommentMapper houseCommentMapper;

    @Override
    public HouseComment queryById(Long id) {
        return this.houseCommentMapper.selectById(id);
    }

    @Override
    public List<HouseComment> queryHouseCommentByUserId(Long userId) {
        return this.houseCommentMapper.selectHouseCommentByUserId(userId);
    }

    @Override
    public Integer addHouseComment(HouseComment houseComment) {
        return this.houseCommentMapper.insert(houseComment);
    }

    @Override
    public Integer updateHouseComment(HouseComment houseComment) {
        return this.houseCommentMapper.updateById(houseComment);
    }

    @Override
    public Integer deleteHouseCommentById(Long id) {
        return this.houseCommentMapper.deleteById(id);
    }
}

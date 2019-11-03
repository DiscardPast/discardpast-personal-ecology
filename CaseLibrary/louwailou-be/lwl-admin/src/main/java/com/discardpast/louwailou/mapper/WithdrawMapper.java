package com.discardpast.louwailou.mapper;

import com.discardpast.louwailou.domain.Withdraw;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author discardpast@yeah.net
 * @apiNote 用户提现表(Withdraw)表数据库访问层
 * @since  2019-10-15 12:41:26
 */
@Mapper
public interface WithdrawMapper extends BaseMapper<Withdraw> {


    /**
     * 通过UserId查询用户提现表
     *
     * @param userId
     * @return
     */
     List<Withdraw> selectWithdrawByUserId(Long userId);

}

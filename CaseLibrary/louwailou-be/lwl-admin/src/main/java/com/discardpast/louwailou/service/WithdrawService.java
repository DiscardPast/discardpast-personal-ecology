package com.discardpast.louwailou.service;

import com.discardpast.louwailou.domain.Withdraw;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户提现表(Withdraw)服务接口
 * @since 2019-10-15 12:41:26
 */
@Service
public interface WithdrawService {

    /**
     * 通过id查询一条用户提现表数据
     * @param id
     * @return
     */
     Withdraw queryById(Long id);

    /**
     * 通过UserId查询一条用户提现表数据
     *
     * @param userId
     * @return
     */
     List<Withdraw> queryWithdrawByUserId(Long userId);


    /**
     * 插入一条用户提现表数据
     * @param withdraw
     * @return
     */
     Integer addWithdraw(Withdraw withdraw);

    /**
     * 更新一条用户提现表数据
     * @param withdraw
     * @return
     */
     Integer updateWithdraw(Withdraw withdraw);

    /**
     * 移除一条用户提现表数据
     * @param id
     * @return
     */
     Integer deleteWithdrawById(Long id);
}

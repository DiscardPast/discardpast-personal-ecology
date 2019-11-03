package com.discardpast.louwailou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discardpast.louwailou.service.WithdrawService;
import com.discardpast.louwailou.mapper.WithdrawMapper;
import com.discardpast.louwailou.domain.Withdraw;

import java.util.List;


/**
 * @author discardpast@yeah.net
 * @apiNote 用户提现表(Withdraw)服务实现类
 * @since 2019-10-15 12:41:26
 */
@Service
public class WithdrawServiceImpl implements WithdrawService {

    @Autowired
    private WithdrawMapper withdrawMapper;

    @Override
    public Withdraw queryById(Long id) {
        return this.withdrawMapper.selectById(id);
    }

    @Override
    public List<Withdraw> queryWithdrawByUserId(Long userId) {
        return this.withdrawMapper.selectWithdrawByUserId(userId);
    }

    @Override
    public Integer addWithdraw(Withdraw withdraw) {
        return this.withdrawMapper.insert(withdraw);
    }

    @Override
    public Integer updateWithdraw(Withdraw withdraw) {
        return this.withdrawMapper.updateById(withdraw);
    }

    @Override
    public Integer deleteWithdrawById(Long id) {
        return this.withdrawMapper.deleteById(id);
    }
}

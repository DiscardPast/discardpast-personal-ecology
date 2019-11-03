package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.Withdraw;
import com.discardpast.louwailou.service.WithdrawService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户提现表(Withdraw)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "用户提现表接口", tags = "用户提现表模块")
@RestController
@RequestMapping("/withdraw")
public class WithdrawController{

    @Resource
    private WithdrawService withdrawService;

    /**
     * 通过主键查询单条用户提现表数据
     *
     * @param withdrawId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户提现表", notes = "查询用户提现表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "withdrawId", value = "主键", required = true, example = "1")
            @RequestParam Long withdrawId) {
        return Result.success(this.withdrawService.queryById(withdrawId));
    }

    /**
     * 通过用户Id查询所有用户提现表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户提现表", notes = "查询用户提现表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.withdrawService.queryWithdrawByUserId(userId));
    }

    /**
     * 保存用户提现表数据
     *
     * @param withdraw 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存用户提现表", notes = "保存用户提现表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "withdraw", value = "传入json格式", required = true)
            @RequestBody Withdraw withdraw) {
        return Result.success(this.withdrawService.addWithdraw(withdraw));
    }

    /**
     * 修改用户提现表数据
     *
     * @param withdraw 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改用户提现表", notes = "修改用户提现表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "withdraw", value = "传入json格式", required = true)
            @RequestBody Withdraw withdraw) {
        return Result.success(this.withdrawService.updateWithdraw(withdraw));
    }

    /**
     * 删除用户提现表数据
     *
     * @param withdrawId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除用户提现表", notes = "删除用户提现表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "withdrawId", value = "传入withdrawId", required = true)
            @RequestParam Long withdrawId) {
        return Result.success(this.withdrawService.deleteWithdrawById(withdrawId));
    }
}
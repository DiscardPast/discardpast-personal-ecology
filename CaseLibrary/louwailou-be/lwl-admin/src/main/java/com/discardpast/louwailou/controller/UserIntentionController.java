package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.UserIntention;
import com.discardpast.louwailou.service.UserIntentionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户意向表(UserIntention)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "用户意向表接口", tags = "用户意向表模块")
@RestController
@RequestMapping("/userIntention")
public class UserIntentionController{

    @Resource
    private UserIntentionService userIntentionService;

    /**
     * 通过主键查询单条用户意向表数据
     *
     * @param userIntentionId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户意向表", notes = "查询用户意向表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "userIntentionId", value = "主键", required = true, example = "1")
            @RequestParam Long userIntentionId) {
        return Result.success(this.userIntentionService.queryById(userIntentionId));
    }

    /**
     * 通过用户Id查询所有用户意向表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户意向表", notes = "查询用户意向表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.userIntentionService.queryUserIntentionByUserId(userId));
    }

    /**
     * 保存用户意向表数据
     *
     * @param userIntention 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存用户意向表", notes = "保存用户意向表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "userIntention", value = "传入json格式", required = true)
            @RequestBody UserIntention userIntention) {
        return Result.success(this.userIntentionService.addUserIntention(userIntention));
    }

    /**
     * 修改用户意向表数据
     *
     * @param userIntention 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改用户意向表", notes = "修改用户意向表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "userIntention", value = "传入json格式", required = true)
            @RequestBody UserIntention userIntention) {
        return Result.success(this.userIntentionService.updateUserIntention(userIntention));
    }

    /**
     * 删除用户意向表数据
     *
     * @param userIntentionId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除用户意向表", notes = "删除用户意向表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "userIntentionId", value = "传入userIntentionId", required = true)
            @RequestParam Long userIntentionId) {
        return Result.success(this.userIntentionService.deleteUserIntentionById(userIntentionId));
    }
}
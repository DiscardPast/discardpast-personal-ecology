package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.UserRecommend;
import com.discardpast.louwailou.service.UserRecommendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户推荐表(UserRecommend)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "用户推荐表接口", tags = "用户推荐表模块")
@RestController
@RequestMapping("/userRecommend")
public class UserRecommendController{

    @Resource
    private UserRecommendService userRecommendService;

    /**
     * 通过主键查询单条用户推荐表数据
     *
     * @param userRecommendId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户推荐表", notes = "查询用户推荐表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "userRecommendId", value = "主键", required = true, example = "1")
            @RequestParam Long userRecommendId) {
        return Result.success(this.userRecommendService.queryById(userRecommendId));
    }

    /**
     * 通过用户Id查询所有用户推荐表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户推荐表", notes = "查询用户推荐表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.userRecommendService.queryUserRecommendByUserId(userId));
    }

    /**
     * 保存用户推荐表数据
     *
     * @param userRecommend 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存用户推荐表", notes = "保存用户推荐表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "userRecommend", value = "传入json格式", required = true)
            @RequestBody UserRecommend userRecommend) {
        return Result.success(this.userRecommendService.addUserRecommend(userRecommend));
    }

    /**
     * 修改用户推荐表数据
     *
     * @param userRecommend 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改用户推荐表", notes = "修改用户推荐表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "userRecommend", value = "传入json格式", required = true)
            @RequestBody UserRecommend userRecommend) {
        return Result.success(this.userRecommendService.updateUserRecommend(userRecommend));
    }

    /**
     * 删除用户推荐表数据
     *
     * @param userRecommendId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除用户推荐表", notes = "删除用户推荐表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "userRecommendId", value = "传入userRecommendId", required = true)
            @RequestParam Long userRecommendId) {
        return Result.success(this.userRecommendService.deleteUserRecommendById(userRecommendId));
    }
}
package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.UserCollection;
import com.discardpast.louwailou.service.UserCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户收藏表(UserCollection)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "用户收藏表接口", tags = "用户收藏表模块")
@RestController
@RequestMapping("/userCollection")
public class UserCollectionController{

    @Resource
    private UserCollectionService userCollectionService;

    /**
     * 通过主键查询单条用户收藏表数据
     *
     * @param userCollectionId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户收藏表", notes = "查询用户收藏表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "userCollectionId", value = "主键", required = true, example = "1")
            @RequestParam Long userCollectionId) {
        return Result.success(this.userCollectionService.queryById(userCollectionId));
    }

    /**
     * 通过用户Id查询所有用户收藏表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户收藏表", notes = "查询用户收藏表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.userCollectionService.queryUserCollectionByUserId(userId));
    }

    /**
     * 保存用户收藏表数据
     *
     * @param userCollection 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存用户收藏表", notes = "保存用户收藏表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "userCollection", value = "传入json格式", required = true)
            @RequestBody UserCollection userCollection) {
        return Result.success(this.userCollectionService.addUserCollection(userCollection));
    }

    /**
     * 修改用户收藏表数据
     *
     * @param userCollection 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改用户收藏表", notes = "修改用户收藏表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "userCollection", value = "传入json格式", required = true)
            @RequestBody UserCollection userCollection) {
        return Result.success(this.userCollectionService.updateUserCollection(userCollection));
    }

    /**
     * 删除用户收藏表数据
     *
     * @param userCollectionId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除用户收藏表", notes = "删除用户收藏表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "userCollectionId", value = "传入userCollectionId", required = true)
            @RequestParam Long userCollectionId) {
        return Result.success(this.userCollectionService.deleteUserCollectionById(userCollectionId));
    }
}
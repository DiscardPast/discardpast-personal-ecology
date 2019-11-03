package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.User;
import com.discardpast.louwailou.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(User)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "用户表接口", tags = "用户表模块")
@RestController
@RequestMapping("/user")
public class UserController{

    @Resource
    private UserService userService;

    /**
     * 分页查询所有用户表数据
     *
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户表", notes = "查询用户表", response = Result.class)
    @GetMapping("/all")
    public Result selectAllUser() {
        return Result.success(this.userService.queryUserList());
    }

    /**
     * 通过主键查询单条用户表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户表", notes = "查询用户表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "userId", value = "主键", required = true, example = "1")
            @RequestParam Long userId) {
        return Result.success(this.userService.queryById(userId));
    }

    /**
     * 通过用户Id查询所有用户表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户表", notes = "查询用户表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.userService.queryUserByUserId(userId));
    }

    /**
     * 保存用户表数据
     *
     * @param user 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存用户表", notes = "保存用户表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "user", value = "传入json格式", required = true)
            @RequestBody User user) {
        return Result.success(this.userService.addUser(user));
    }

    /**
     * 修改用户表数据
     *
     * @param user 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改用户表", notes = "修改用户表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "user", value = "传入json格式", required = true)
            @RequestBody User user) {
        return Result.success(this.userService.updateUser(user));
    }

    /**
     * 删除用户表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除用户表", notes = "删除用户表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "userId", value = "传入userId", required = true)
            @RequestParam Long userId) {
        return Result.success(this.userService.deleteUserById(userId));
    }
}
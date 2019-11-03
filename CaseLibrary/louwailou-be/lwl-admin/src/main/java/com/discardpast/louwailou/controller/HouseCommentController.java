package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.HouseComment;
import com.discardpast.louwailou.service.HouseCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房屋评论信息表(HouseComment)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "房屋评论信息表接口", tags = "房屋评论信息表模块")
@RestController
@RequestMapping("/houseComment")
public class HouseCommentController{

    @Resource
    private HouseCommentService houseCommentService;

    /**
     * 通过主键查询单条房屋评论信息表数据
     *
     * @param houseCommentId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋评论信息表", notes = "查询房屋评论信息表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "houseCommentId", value = "主键", required = true, example = "1")
            @RequestParam Long houseCommentId) {
        return Result.success(this.houseCommentService.queryById(houseCommentId));
    }

    /**
     * 通过用户Id查询所有房屋评论信息表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋评论信息表", notes = "查询房屋评论信息表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.houseCommentService.queryHouseCommentByUserId(userId));
    }

    /**
     * 保存房屋评论信息表数据
     *
     * @param houseComment 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存房屋评论信息表", notes = "保存房屋评论信息表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "houseComment", value = "传入json格式", required = true)
            @RequestBody HouseComment houseComment) {
        return Result.success(this.houseCommentService.addHouseComment(houseComment));
    }

    /**
     * 修改房屋评论信息表数据
     *
     * @param houseComment 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改房屋评论信息表", notes = "修改房屋评论信息表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "houseComment", value = "传入json格式", required = true)
            @RequestBody HouseComment houseComment) {
        return Result.success(this.houseCommentService.updateHouseComment(houseComment));
    }

    /**
     * 删除房屋评论信息表数据
     *
     * @param houseCommentId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除房屋评论信息表", notes = "删除房屋评论信息表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "houseCommentId", value = "传入houseCommentId", required = true)
            @RequestParam Long houseCommentId) {
        return Result.success(this.houseCommentService.deleteHouseCommentById(houseCommentId));
    }
}
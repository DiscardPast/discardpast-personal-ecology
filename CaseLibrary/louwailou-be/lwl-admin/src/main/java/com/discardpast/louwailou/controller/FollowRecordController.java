package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.FollowRecord;
import com.discardpast.louwailou.service.FollowRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 跟进记录表(FollowRecord)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "跟进记录表接口", tags = "跟进记录表模块")
@RestController
@RequestMapping("/followRecord")
public class FollowRecordController{

    @Resource
    private FollowRecordService followRecordService;

    /**
     * 通过主键查询单条跟进记录表数据
     *
     * @param followRecordId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询跟进记录表", notes = "查询跟进记录表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "followRecordId", value = "主键", required = true, example = "1")
            @RequestParam Long followRecordId) {
        return Result.success(this.followRecordService.queryById(followRecordId));
    }

    /**
     * 通过用户Id查询所有跟进记录表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询跟进记录表", notes = "查询跟进记录表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.followRecordService.queryFollowRecordByUserId(userId));
    }

    /**
     * 保存跟进记录表数据
     *
     * @param followRecord 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存跟进记录表", notes = "保存跟进记录表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "followRecord", value = "传入json格式", required = true)
            @RequestBody FollowRecord followRecord) {
        return Result.success(this.followRecordService.addFollowRecord(followRecord));
    }

    /**
     * 修改跟进记录表数据
     *
     * @param followRecord 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改跟进记录表", notes = "修改跟进记录表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "followRecord", value = "传入json格式", required = true)
            @RequestBody FollowRecord followRecord) {
        return Result.success(this.followRecordService.updateFollowRecord(followRecord));
    }

    /**
     * 删除跟进记录表数据
     *
     * @param followRecordId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除跟进记录表", notes = "删除跟进记录表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "followRecordId", value = "传入followRecordId", required = true)
            @RequestParam Long followRecordId) {
        return Result.success(this.followRecordService.deleteFollowRecordById(followRecordId));
    }
}
package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.HouseImage;
import com.discardpast.louwailou.service.HouseImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房屋信息图片表(HouseImage)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "房屋信息图片表接口", tags = "房屋信息图片表模块")
@RestController
@RequestMapping("/houseImage")
public class HouseImageController{

    @Resource
    private HouseImageService houseImageService;

    /**
     * 通过主键查询单条房屋信息图片表数据
     *
     * @param houseImageId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息图片表", notes = "查询房屋信息图片表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "houseImageId", value = "主键", required = true, example = "1")
            @RequestParam Long houseImageId) {
        return Result.success(this.houseImageService.queryById(houseImageId));
    }

    /**
     * 通过用户Id查询所有房屋信息图片表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息图片表", notes = "查询房屋信息图片表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.houseImageService.queryHouseImageByUserId(userId));
    }

    /**
     * 保存房屋信息图片表数据
     *
     * @param houseImage 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存房屋信息图片表", notes = "保存房屋信息图片表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "houseImage", value = "传入json格式", required = true)
            @RequestBody HouseImage houseImage) {
        return Result.success(this.houseImageService.addHouseImage(houseImage));
    }

    /**
     * 修改房屋信息图片表数据
     *
     * @param houseImage 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改房屋信息图片表", notes = "修改房屋信息图片表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "houseImage", value = "传入json格式", required = true)
            @RequestBody HouseImage houseImage) {
        return Result.success(this.houseImageService.updateHouseImage(houseImage));
    }

    /**
     * 删除房屋信息图片表数据
     *
     * @param houseImageId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除房屋信息图片表", notes = "删除房屋信息图片表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "houseImageId", value = "传入houseImageId", required = true)
            @RequestParam Long houseImageId) {
        return Result.success(this.houseImageService.deleteHouseImageById(houseImageId));
    }
}
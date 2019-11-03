package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.action.HouseAction;
import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.House;
import com.discardpast.louwailou.service.HouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房屋信息表(House)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "房屋信息表接口", tags = "房屋信息表模块")
@RestController
@RequestMapping("/house")
public class HouseController{

    @Resource
    private HouseService houseService;

    @Resource
    private HouseAction houseAction;

    /**
     * 分页查询所有用户表数据
     *
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户表", notes = "查询用户表", response = Result.class)
    @GetMapping("/all")
    public Result selectAllUser() {
        return Result.success(this.houseService.queryHouseList());
    }


    /**
     * 通过主键查询单条房屋信息表数据
     *
     * @param houseId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息表", notes = "查询房屋信息表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "houseId", value = "主键", required = true, example = "1")
            @RequestParam Long houseId) {
        return Result.success(this.houseAction.getHouseVo(houseId));
    }

    /**
     * 通过用户Id查询所有房屋信息表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息表", notes = "查询房屋信息表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.houseService.queryHouseByUserId(userId));
    }

    /**
     * 保存房屋信息表数据
     *
     * @param house 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存房屋信息表", notes = "保存房屋信息表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "house", value = "传入json格式", required = true)
            @RequestBody House house) {
        return Result.success(this.houseService.addHouse(house));
    }

    /**
     * 修改房屋信息表数据
     *
     * @param house 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改房屋信息表", notes = "修改房屋信息表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "house", value = "传入json格式", required = true)
            @RequestBody House house) {
        return Result.success(this.houseService.updateHouse(house));
    }

    /**
     * 删除房屋信息表数据
     *
     * @param houseId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除房屋信息表", notes = "删除房屋信息表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "houseId", value = "传入houseId", required = true)
            @RequestParam Long houseId) {
        return Result.success(this.houseService.deleteHouseById(houseId));
    }
}
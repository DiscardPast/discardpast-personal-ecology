package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.HouseApartment;
import com.discardpast.louwailou.service.HouseApartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房屋户型信息表(HouseApartment)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "房屋户型信息表接口", tags = "房屋户型信息表模块")
@RestController
@RequestMapping("/houseApartment")
public class HouseApartmentController{

    @Resource
    private HouseApartmentService houseApartmentService;

    /**
     * 通过主键查询单条房屋户型信息表数据
     *
     * @param houseApartmentId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋户型信息表", notes = "查询房屋户型信息表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "houseApartmentId", value = "主键", required = true, example = "1")
            @RequestParam Long houseApartmentId) {
        return Result.success(this.houseApartmentService.queryById(houseApartmentId));
    }

    /**
     * 通过用户Id查询所有房屋户型信息表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋户型信息表", notes = "查询房屋户型信息表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.houseApartmentService.queryHouseApartmentListByHouseId(userId));
    }

    /**
     * 保存房屋户型信息表数据
     *
     * @param houseApartment 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存房屋户型信息表", notes = "保存房屋户型信息表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "houseApartment", value = "传入json格式", required = true)
            @RequestBody HouseApartment houseApartment) {
        return Result.success(this.houseApartmentService.addHouseApartment(houseApartment));
    }

    /**
     * 修改房屋户型信息表数据
     *
     * @param houseApartment 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改房屋户型信息表", notes = "修改房屋户型信息表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "houseApartment", value = "传入json格式", required = true)
            @RequestBody HouseApartment houseApartment) {
        return Result.success(this.houseApartmentService.updateHouseApartment(houseApartment));
    }

    /**
     * 删除房屋户型信息表数据
     *
     * @param houseApartmentId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除房屋户型信息表", notes = "删除房屋户型信息表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "houseApartmentId", value = "传入houseApartmentId", required = true)
            @RequestParam Long houseApartmentId) {
        return Result.success(this.houseApartmentService.deleteHouseApartmentById(houseApartmentId));
    }
}
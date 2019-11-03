package com.discardpast.louwailou.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.HouseApartmentImage;
import com.discardpast.louwailou.service.HouseApartmentImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 房屋信息图片表(HouseApartmentImage)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-31 11:59:36
 */
@Api(value = "房屋信息图片表接口", tags = "房屋信息图片表模块")
@RestController
@RequestMapping("/houseApartmentImage")
public class HouseApartmentImageController {

    @Resource
    private HouseApartmentImageService houseApartmentImageService;

    /**
     * 分页查询所有房屋信息图片表数据
     *
     * @param page 分页对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息图片表列表", notes = "查询房屋信息图片表列表", response = Result.class)
    @GetMapping
    public Result selectAll(@RequestBody IPage<HouseApartmentImage> page) {
        return Result.success(this.houseApartmentImageService.queryByPage(page));
    }

    /**
     * 通过主键查询单条房屋信息图片表数据
     *
     * @param houseApartmentImageId 主键
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询房屋信息图片表", notes = "查询房屋信息图片表", response = Result.class)
    @GetMapping("{houseApartmentImageId}")
    public Result selectOne(
            @ApiParam(name = "houseApartmentImageId", value = "主键", required = true, example = "1")
            @PathVariable Long houseApartmentImageId) {
        return Result.success(this.houseApartmentImageService.queryById(houseApartmentImageId));
    }

    /**
     * 保存房屋信息图片表数据
     *
     * @param houseApartmentImage 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存房屋信息图片表", notes = "保存房屋信息图片表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "houseApartmentImage", value = "传入json格式", required = true)
            @RequestBody HouseApartmentImage houseApartmentImage) {
        return Result.success(this.houseApartmentImageService.addHouseApartmentImage(houseApartmentImage));
    }

    /**
     * 修改房屋信息图片表数据
     *
     * @param houseApartmentImage 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改房屋信息图片表", notes = "修改房屋信息图片表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "houseApartmentImage", value = "传入json格式", required = true)
            @RequestBody HouseApartmentImage houseApartmentImage) {
        return Result.success(this.houseApartmentImageService.updateHouseApartmentImage(houseApartmentImage));
    }

}
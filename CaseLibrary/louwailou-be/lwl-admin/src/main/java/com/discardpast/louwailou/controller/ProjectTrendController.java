package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.ProjectTrend;
import com.discardpast.louwailou.service.ProjectTrendService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目动态信息表(ProjectTrend)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "项目动态信息表接口", tags = "项目动态信息表模块")
@RestController
@RequestMapping("/projectTrend")
public class ProjectTrendController {

    @Resource
    private ProjectTrendService projectTrendService;

    /**
     * 通过主键查询单条项目动态信息表数据
     *
     * @param projectTrendId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询项目动态信息表", notes = "查询项目动态信息表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "projectTrendId", value = "主键", required = true, example = "1")
            @RequestParam Long projectTrendId) {
        return Result.success(this.projectTrendService.queryById(projectTrendId));
    }

    /**
     * 通过用户Id查询所有项目动态信息表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询项目动态信息表", notes = "查询项目动态信息表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.projectTrendService.queryProjectTrendListByProjectId(userId));
    }

    /**
     * 保存项目动态信息表数据
     *
     * @param projectTrend 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存项目动态信息表", notes = "保存项目动态信息表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "projectTrend", value = "传入json格式", required = true)
            @RequestBody ProjectTrend projectTrend) {
        return Result.success(this.projectTrendService.addProjectTrend(projectTrend));
    }

    /**
     * 修改项目动态信息表数据
     *
     * @param projectTrend 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改项目动态信息表", notes = "修改项目动态信息表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "projectTrend", value = "传入json格式", required = true)
            @RequestBody ProjectTrend projectTrend) {
        return Result.success(this.projectTrendService.updateProjectTrend(projectTrend));
    }

    /**
     * 删除项目动态信息表数据
     *
     * @param projectTrendId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除项目动态信息表", notes = "删除项目动态信息表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "projectTrendId", value = "projectTrendsId", required = true)
            @RequestParam Long projectTrendId) {
        return Result.success(this.projectTrendService.deleteProjectTrendById(projectTrendId));
    }
}
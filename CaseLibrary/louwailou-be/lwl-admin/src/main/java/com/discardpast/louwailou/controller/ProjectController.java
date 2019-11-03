package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.Project;
import com.discardpast.louwailou.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目信息表(Project)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "项目信息表接口", tags = "项目信息表模块")
@RestController
@RequestMapping("/project")
public class ProjectController{

    @Resource
    private ProjectService projectService;

    /**
     * 分页查询所有用户表数据
     *
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询用户表", notes = "查询用户表", response = Result.class)
    @GetMapping("/all")
    public Result selectAllProject() {
        return Result.success(this.projectService.queryProjectList());
    }

    /**
     * 通过主键查询单条项目信息表数据
     *
     * @param projectId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询项目信息表", notes = "查询项目信息表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "projectId", value = "主键", required = true, example = "1")
            @RequestParam Long projectId) {
        return Result.success(this.projectService.queryById(projectId));
    }

    /**
     * 通过用户Id查询所有项目信息表数据
     *
     * @param userId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询项目信息表", notes = "查询项目信息表", response = Result.class)
    @GetMapping("{userId}")
    public Result selectByUserId(
            @ApiParam(name = "userId", value = "用户Id", required = true, example = "1")
            @PathVariable Long userId) {
        return Result.success(this.projectService.queryProjectByUserId(userId));
    }

    /**
     * 保存项目信息表数据
     *
     * @param project 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存项目信息表", notes = "保存项目信息表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "project", value = "传入json格式", required = true)
            @RequestBody Project project) {
        return Result.success(this.projectService.addProject(project));
    }

    /**
     * 修改项目信息表数据
     *
     * @param project 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改项目信息表", notes = "修改项目信息表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "project", value = "传入json格式", required = true)
            @RequestBody Project project) {
        return Result.success(this.projectService.updateProject(project));
    }

    /**
     * 删除项目信息表数据
     *
     * @param projectId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除项目信息表", notes = "删除项目信息表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "projectId", value = "传入projectId", required = true)
            @RequestParam Long projectId) {
        return Result.success(this.projectService.deleteProjectById(projectId));
    }
}
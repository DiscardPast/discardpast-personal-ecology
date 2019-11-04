package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.action.StaffAction;
import com.discardpast.louwailou.base.domain.Result;
import com.discardpast.louwailou.domain.Staff;
import com.discardpast.louwailou.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 员工表(Staff)表控制层
 *
 * @author discardpast@yeah.net
 * @since 2019-10-15 12:41:26
 */
@Api(value = "员工表接口", tags = "员工表模块")
@RestController
@RequestMapping("/staff")
public class StaffController{

    @Resource
    private StaffService staffService;

    @Resource
    private StaffAction staffAction;

    /**
     * 通过主键查询单条员工表数据
     *
     * @param staffId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "查询员工表", notes = "查询员工表", response = Result.class)
    @GetMapping
    public Result selectOne(
            @ApiParam(name = "staffId", value = "主键", required = true, example = "1")
            @RequestParam Long staffId) {
        return Result.success(this.staffService.queryById(staffId));
    }

    /**
     * 保存员工表数据
     *
     * @param staff 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存员工表", notes = "保存员工表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "staff", value = "传入json格式", required = true)
            @RequestBody Staff staff) {
        return Result.success(this.staffService.addStaff(staff));
    }

    /**
     * 修改员工表数据
     *
     * @param staff 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "修改员工表", notes = "修改员工表", response = Result.class)
    @PutMapping
    public Result update(
            @ApiParam(name = "staff", value = "传入json格式", required = true)
            @RequestBody Staff staff) {
        return Result.success(this.staffService.updateStaff(staff));
    }

    /**
     * 删除员工表数据
     *
     * @param staffId
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "删除员工表", notes = "删除员工表", response = Result.class)
    @DeleteMapping
    public Result delete(
            @ApiParam(name = "staffId", value = "传入staffId", required = true)
            @RequestParam Long staffId) {
        return Result.success(this.staffService.deleteStaffById(staffId));
    }

    /**
     * 删除员工表数据
     *
     * @param staff
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "员工登录后台", notes = "员工登录后台", response = Result.class)
    @PostMapping("/login")
    public Result login(
            @ApiParam(name = "staff", value = "传入账号密码", required = true)
            @RequestBody Staff staff) {
        return Result.success(this.staffAction.staffLogin(staff));
    }
}
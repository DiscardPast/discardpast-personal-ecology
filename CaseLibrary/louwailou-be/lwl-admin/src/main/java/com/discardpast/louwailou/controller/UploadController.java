package com.discardpast.louwailou.controller;

import com.discardpast.louwailou.base.domain.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author discardpast@yeah.net
 */

@Api(value = "文件上传接口", tags = "文件上传接口")
@RestController
@RequestMapping("/upload")
public class UploadController {

    /**
     * 上传文件接口
     *
     * @param multipartFile 实体对象
     * @return Result 返回统一结果model
     */
    @ApiOperation(value = "保存员工表", notes = "保存员工表", response = Result.class)
    @PostMapping
    public Result insert(
            @ApiParam(name = "staff", value = "传入json格式", required = true)
            MultipartFile multipartFile) {
        return Result.success(true);
    }
}

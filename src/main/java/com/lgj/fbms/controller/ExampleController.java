package com.lgj.fbms.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：LGJ
 * @date ：Created in 2020/4/12 11:05
 * @description：Controller例子
 * @modified By：
 * @version: 1.0
 */
@Api(tags = "swagger使用示例")
@RestController
@Slf4j
@RequestMapping("/api/fbms/example")
public class ExampleController {

    @ApiOperation("获取示例")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "string", value = "参数描述",dataType = "String")
    )
    @GetMapping("/select")
    public String getString(String string) {
        return "string";
    }

    @ApiOperation("添加示例")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "string", value = "参数描述",dataType = "String")
    )
    @PostMapping("/add")
    public String addString(String string) {
        return string;
    }

    @ApiOperation("修改示例")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "string", value = "参数描述",dataType = "String")
    )
    @PutMapping("/update")
    public String updateString(String string) {
        return "string:" + string;
    }

    @ApiOperation("删除示例")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "string", value = "参数描述",dataType = "String")
    )
    @DeleteMapping("/delete")
    public String deleteString(String string) {
        return "string";
    }
}

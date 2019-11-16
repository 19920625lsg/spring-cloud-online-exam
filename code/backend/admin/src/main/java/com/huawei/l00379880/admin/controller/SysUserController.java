/***********************************************************
 * @Description : 用户管理的对外REST接口
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2019/11/17 1:53
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package com.huawei.l00379880.admin.controller;

import com.huawei.l00379880.admin.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理的对外REST接口")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/all")
    @ApiOperation(value = "获取所有用户的信息", notes = "拿到所有用户的详细信息")
    public Object findAll() {
        return sysUserService.findAll();
    }
}

package cn.fintecher.robot.domain.controller;

import cn.fintecher.robot.domain.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户管理", description = "用户管理")
@RequestMapping("/api/userController")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @ApiOperation(value = "测试", notes = "测试")
    @GetMapping("/test")
    private String test() {
        return "hello world";
    }

    @ApiOperation(value = "获取所有用户", notes = "获取所有用户")
    @GetMapping("/getAllUsers")
    private String getAllUsers() {
        return userRepository.findAll().toString();
    }

}

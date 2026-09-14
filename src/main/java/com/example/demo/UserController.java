package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserMapper userMapper;

	@PostMapping
	public String sava(@RequestBody User user) {

		return "用户新增成功";
	}

	@GetMapping
	public List getAll() {
		return userMapper.selectList(new LambdaUpdateWrapper<>());
	}

}

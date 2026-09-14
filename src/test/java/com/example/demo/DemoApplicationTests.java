package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.Resource;
import com.example.demo.entity.User;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
	@Resource
	private UserMapper userMapper;

	@Test

	void testContent() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.isTrue(5 == userList.size(), "");
		userList.forEach(System.out::println);
	}

}

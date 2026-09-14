package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

@Data
@TableName("`user`")
@NoArgsConstructor
@AllArgsConstructor

public class User {
	@TableId("id")
	private Long id;
	private String name;
	private Integer age;
	private String email;
	@TableField("create_time")
	private LocalDateTime createTime;
	@TableField("update_time")
	private LocalDateTime updateTime;
}
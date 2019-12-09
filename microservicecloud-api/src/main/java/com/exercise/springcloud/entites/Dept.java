package com.exercise.springcloud.entites;

import java.io.Serializable;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	/**
	 * 主键
	 */
	private Long deptno;
	/**
	 * 部门名称
	 */
	private String deptname;
	/**
	 * 数据库信息
	 */
	private String db_source;
	

}

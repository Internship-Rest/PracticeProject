package com.internship.elm;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		System.out.println("当前获取的连接为：" + dataSource.getConnection());
	}

}

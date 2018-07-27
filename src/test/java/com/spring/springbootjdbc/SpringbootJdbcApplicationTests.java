package com.spring.springbootjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		System.out.println("------1-----");
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		System.out.println("------2-----");
		connection.close();
	}

}

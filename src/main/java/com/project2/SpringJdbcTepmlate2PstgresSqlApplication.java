package com.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTepmlate2PstgresSqlApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTepmlate2PstgresSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT INTO student (sname,saddress) VALUES ('rahim','bihar')";

	int rows=jdbcTemplate.update(sql);
    if(rows>0) {
    	System.out.println("a new  row has been created");
    }
	}

}

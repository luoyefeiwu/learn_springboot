package com.jerry.banquet.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource(value= {"classpath:jdbc.properties"})
public class JDBCConfig {
	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClassName;

	@Value("${jdbc.username}")
	private String jdbcUsername;

	@Value("${jdbc.password}")
	private String jdbcPassword;

	@Value("${jdbc.maxActive}")
	private Integer maxActive;

	@Value("${jdbc.initialSize}")
	private Integer initialSize;

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		// 数据库驱动
		dataSource.setDriverClassName(jdbcDriverClassName);
		// 相应驱动的jdbcUrl
		dataSource.setUrl(jdbcUrl);
		// 数据库的用户名
		dataSource.setUsername(jdbcUsername);
		// 数据库的密码
		dataSource.setPassword(jdbcPassword);

		dataSource.setInitialSize(initialSize);
		// 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
		dataSource.setMaxActive(maxActive);

		return dataSource;
	}
}

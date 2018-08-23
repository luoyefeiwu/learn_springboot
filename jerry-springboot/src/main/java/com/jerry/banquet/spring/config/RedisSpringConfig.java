package com.jerry.banquet.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jerry.banquet.redis.impl.JedisClientSingle;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@PropertySource(value = "classpath:redis.properties")
public class RedisSpringConfig {

	@Value("${redis.maxTotal}")
	private Integer maxTotal;

	@Value("${redis.maxIdle}")
	private Integer maxIdle;

	@Value("${redis.minIdle}")
	private Integer minIdle;

	@Value("${redis.maxWaitMillis}")
	private long maxWaitMillis;

	@Value("${redis.numTestsPerEvictionRun}")
	private Integer numTestsPerEvictionRun;

	@Value("${redis.timeBetweenEvictionRunsMillis}")
	private Integer timeBetweenEvictionRunsMillis;

	@Value("${redis.minEvictableIdleTimeMillis}")
	private Integer minEvictableIdleTimeMillis;

	@Value("${redis.softMinEvictableIdleTimeMillis}")
	private long softMinEvictableIdleTimeMillis;

	@Value("${redis.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${redis.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${redis.testOnReturn}")
	private boolean testOnReturn;

	@Value("${redis.blockWhenExhausted}")
	private boolean blockWhenExhausted;

	@Value("${redis.host}")
	private String host;

	@Value("${redis.port}")
	private Integer port;

	@Value("${redis.timeout}")
	private Integer timeout;

	@Value("${redis.password}")
	private String password;

	@Value("${redis.clusterNodes}")
	private String clusterNodes;

	// 集群
	@Value("${redis.connectionTimeout}")
	private Integer connectionTimeout;
	// 集群
	@Value("${redis.soTimeout}")
	private Integer soTimeout;
	// 集群
	@Value("${redis.maxAttempts}")
	private Integer maxAttempts;
	// 集群
	@Value("${redis.clusterpassword}")
	private String clusterpassword;

	@Bean
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(maxTotal);
		jedisPoolConfig.setMaxIdle(maxIdle);
		jedisPoolConfig.setMinIdle(minIdle);
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
		jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		jedisPoolConfig.setSoftMinEvictableIdleTimeMillis(softMinEvictableIdleTimeMillis);
		jedisPoolConfig.setTestOnBorrow(testOnBorrow);
		jedisPoolConfig.setTestWhileIdle(testWhileIdle);
		jedisPoolConfig.setTestOnReturn(testOnReturn);
		jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);
		return jedisPoolConfig;
	}

	/**
	 * 单机版配置
	 * 
	 * @param jedisPoolConfig
	 * @return
	 */
	@Bean
	public JedisPool jedisPool(JedisPoolConfig jedisPoolConfig) {
		JedisPool jedisPool = null;
		if (password == null || password.equals("")) {
			jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout);
		} else {
			jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
		}
		return jedisPool;
	}

	/**
	 * 单机版实现类
	 * 
	 * @return
	 */
	@Bean
	public JedisClientSingle jedisClientSingle() {
		JedisClientSingle jedisClientSingle = new JedisClientSingle();
		return jedisClientSingle;
	}

	//
	// /**
	// * 集群版配置
	// *
	// * @param jedisPoolConfig
	// * @return
	// */
	// @Bean
	// public JedisCluster jedisCluster(JedisPoolConfig jedisPoolConfig) {
	// String[] serverArray = clusterNodes.split(",");
	// Set<HostAndPort> nodes = new HashSet<HostAndPort>();
	// for (String item : serverArray) {
	// String[] ipAndPort = item.split(":");
	// String ip = ipAndPort[0].trim();
	// Integer port = Integer.parseInt(ipAndPort[1].trim());
	// HostAndPort hostAndPort = new HostAndPort(ip, port);
	// nodes.add(hostAndPort);
	// }
	// JedisCluster jedisCluster = null;
	// if (clusterpassword == null || clusterpassword.equals("")) {
	// jedisCluster = new JedisCluster(nodes, connectionTimeout, soTimeout,
	// maxAttempts, jedisPoolConfig);
	// } else {
	// jedisCluster = new JedisCluster(nodes, connectionTimeout, soTimeout,
	// maxAttempts, password,
	// jedisPoolConfig);
	// }
	// return jedisCluster;
	// }
	//
	// /**集群版实现类
	// * @return
	// */
	// @Bean
	// public JedisClientCluster jedisClientCluster() {
	// JedisClientCluster jedisClientCluster = new JedisClientCluster();
	// return jedisClientCluster;
	// }

}

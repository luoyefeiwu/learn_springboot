package com.jerry.banquet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jerry.banquet.model.TBanquet;
import com.jerry.banquet.redis.JedisClient;
import com.jerry.banquet.service.BanquetService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RequestMapping("/banquet")
@Controller
public class BanquetController {

	private Logger logger =LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BanquetService banquetService;

	@Autowired
	private JedisClient JedisClient;

	@RequestMapping(value = "/listBanquets", method = RequestMethod.GET, produces = {
			"application/json;charset=UTF-8" })
	@ResponseBody
	public List<TBanquet> listBanquets() {
		logger.info("测试哈哈哈");
		return banquetService.listBanquets();
	}

	@RequestMapping(value = "/testRedis", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String testRedis() {
		String json = JedisClient.get("YH_gHsPtPJTTxgGAKL5eIM7FT5Ave/O4E3XAc8Tf5Weu8PM34XB9F5wDSVFqSUv2H0eXKOOKupB3lwGPc1NvolQ5Q==");
		return json;
	}
}

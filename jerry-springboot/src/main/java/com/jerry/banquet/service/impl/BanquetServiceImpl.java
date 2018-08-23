package com.jerry.banquet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerry.banquet.mapper.TBanquetMapper;
import com.jerry.banquet.model.TBanquet;
import com.jerry.banquet.service.BanquetService;

@Service
public class BanquetServiceImpl implements BanquetService {

	@Autowired
	private TBanquetMapper tbanquetMapper;
	@Override
	public List<TBanquet> listBanquets() {
		return tbanquetMapper.listBanquets();
	}

}

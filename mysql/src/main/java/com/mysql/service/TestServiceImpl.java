package com.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.domain.TestVO;
import com.mysql.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper mapper;

	@Override
	public List<TestVO> getList() {
		return mapper.getList();
	}
}

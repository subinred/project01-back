package com.mycompany.backend.service.impl;

import org.springframework.stereotype.Service;

import com.mycompany.backend.mapper.BaseMapper;
import com.mycompany.backend.model.BaseDto;
import com.mycompany.backend.service.BaseService;

import jakarta.annotation.Resource;

@Service
public class BaseServiceImpl implements BaseService {
  
  @Resource
  BaseMapper baseMapper;
  
  @Override
  public BaseDto select(BaseDto dto) {
    return baseMapper.select(dto);
  }
  
  @Override
  public String test() {
    return "ok";
  }
}

package com.mycompany.backend.service;

import org.springframework.transaction.annotation.Transactional;

import com.mycompany.backend.model.BaseDto;

@Transactional
public interface BaseService {
  public BaseDto select(BaseDto dto);
  public String test();
}

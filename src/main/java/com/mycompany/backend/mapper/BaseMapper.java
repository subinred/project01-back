package com.mycompany.backend.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.backend.model.BaseDto;

@Mapper
public interface BaseMapper {
  BaseDto select(BaseDto dto);
}

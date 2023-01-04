package com.mycompany.backend.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.backend.HellowWorldBean;
import com.mycompany.backend.model.BaseDto;
import com.mycompany.backend.service.BaseService;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@MapperScan("com.mycompany.backend.mapper")
public class BaseController {
  
  @Resource
  BaseService baseService;
  
  @GetMapping(path="/test")
  public String BaseTest() {
    BaseDto dto = new BaseDto();
    dto.setTitle("흠냐");
    log.info(dto);
    return baseService.select(dto).toString();
  }
  
  //예전에는 RequestMapping을 사용하고 @RequestMapping(method=RequestMapping.GET, path="/") 형식으로 작성함
  @GetMapping(path= "/hellowWorld") //"" 안에 들어가는 내용을 endpoint 라고 함
  public String hellowWorld() {
    return "Hellow World";
  }
  
  @GetMapping(path= "/hellowWorldBean")
  public HellowWorldBean hellowWorldBean() {
    return new HellowWorldBean("Hellow World");
    //String이 아닌 Bean 객체 반환이기 떄문에 JSON형태로 변환해줌
    //RestController에서는 반환되는 값이 ResponseBody에 굳이 포함되지 않더라도 JSON 형태로 반환해줌
  }
}

package com.mycompany.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //HellowWorldBean의 모든 게터, 세터 생성
@AllArgsConstructor // 생성자 생략 가능
@NoArgsConstructor // default 생성자가 같이 생성
public class HellowWorldBean {
  /* @Data를 사용함으로써 생략 가능
  public String getMessage() {
    return this.message;
  }
  public void setMessage(String msg) {
    this.message = msg;
  }*/
  private String message;
}

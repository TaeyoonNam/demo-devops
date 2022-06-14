package me.demo.demodevops.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import me.demo.demodevops.service.BankService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

/**
 * @author : naming
 * @packageName : me.demo.demodevops.controller
 * @date : 2022/06/11
 * @description :
 */
@WebMvcTest(BankController.class)
public class BankControllerTest {

  @MockBean
  private BankService bankService;

  @Autowired
  private MockMvc mockMvc;

  @Test
  void test() throws Exception {
    MvcResult result = mockMvc.perform(post("/accounts")
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .content("{\n"
            + "    \"accountNum\": 110220330440,\n"
            + "    \"accountNm\": \"junitTest\",\n"
            + "    \"amount\": 99999\n"
            + "}"))
        .andReturn();

    assertThat(result.getResponse().getStatus()).isEqualTo(HttpStatus.OK.value());
  }

}

package me.demo.demodevops.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : naming
 * @packageName : me.demo.demodevops.controller
 * @date : 2022/06/10
 * @description :
 */
@Log4j2
@RestController
public class BankController {

//  @Autowired
//  private BankService bankService;

  @GetMapping("/healthCheck")
  public String healthCheck() {
    log.info("*** healthCheck Test");
    return "Ok";
  }

  @GetMapping("/testApi")
  public String testApi() {
    log.info("*** testApi Test");
    return "Test Ok";
  }

//  @PostMapping("/accounts")
//  public ResponseEntity makeAccount(@RequestBody Bank bank) {
//    return ResponseEntity.ok(bankService.makeAccount(bank));
//  }
//
//  @DeleteMapping("/accounts")
//  public ResponseEntity deleteAccount(@RequestParam(name = "accountNum", required = true) long accountNum) {
//    bankService.deleteAccount(accountNum);
//    return ResponseEntity.status(HttpStatus.OK).build();
//  }
//
//  @PatchMapping("/accounts")
//  public ResponseEntity updateAccountInfo(@RequestBody Bank bank) {
//    bankService.updateAccountInfo(bank);
//    return ResponseEntity.status(HttpStatus.OK).build();
//  }
//
//  @GetMapping("/accounts")
//  public ResponseEntity getAccountInfo(@RequestParam(name = "accountNum", required = true) long accountNum) {
//    return ResponseEntity.ok(bankService.getAccountInfo(accountNum));
//  }

}

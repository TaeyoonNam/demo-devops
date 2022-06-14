package me.demo.demodevops.repository;

import me.demo.demodevops.entity.Bank;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : naming
 * @packageName : me.demo.demodevops.repository
 * @date : 2022/06/10
 * @description :
 */
@SpringBootTest
public class BankRepositoryTest {

  @Autowired
  private BankRepository bankRepository;

  @Test
  public void depositMoney() {
    Bank bank = new Bank(10001L, "JUnitTest", 10000000000L);
    bankRepository.save(bank);
  }

}
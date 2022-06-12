package me.demo.demodevops.service;

import javax.transaction.Transactional;
import me.demo.demodevops.entity.Bank;
import me.demo.demodevops.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : naming
 * @packageName : me.demo.demodevops.service
 * @date : 2022/06/10
 * @description :
 */
@Service
public class BankService {

  @Autowired
  private BankRepository bankRepository;

  public Bank makeAccount(Bank bank) {
    return bankRepository.save(bank);
  }

  @Transactional
  public void deleteAccount(long accountNum) {
    bankRepository.deleteBankByAccountNum(accountNum);
  }

  @Transactional
  public void updateAccountInfo(Bank bank) {
    bankRepository.updateAccountInfo(bank.getAccountNm(), bank.getAccountNum());
  }

  public Bank getAccountInfo(long accountNum) {
    return bankRepository.getBankByAccountNum(accountNum);
  }


}

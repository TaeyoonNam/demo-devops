//package me.demo.demodevops.repository;
//
//import me.demo.demodevops.entity.Bank;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @author : naming
// * @packageName : me.demo.demodevops.repository
// * @date : 2022/06/10
// * @description :
// */
//public interface BankRepository extends JpaRepository<Bank, Long> {
//
//  void deleteBankByAccountNum(long accountNum);
//
//  Bank getBankByAccountNum(long accountNum);
//
//  @Modifying
//  @Query("UPDATE Bank b SET b.accountNm = :accountNm WHERE b.accountNum = :accountNum")
//  int updateAccountInfo(String accountNm, long accountNum);
//
//}

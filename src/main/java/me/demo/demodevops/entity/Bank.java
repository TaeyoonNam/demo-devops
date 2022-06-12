package me.demo.demodevops.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "BANK")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bank {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "ACCOUNT_NUM", nullable = false)
  private Long accountNum;

  @Column(name = "ACCOUNT_NM", nullable = false)
  private String accountNm;

  @ColumnDefault(value = "0")
  @Column(name = "AMOUNT", nullable = false)
  private Long amount;

  public Bank(Long accountNum, String accountNm, Long amount) {
    this.accountNum = accountNum;
    this.accountNm = accountNm;
    this.amount = amount;
  }
}

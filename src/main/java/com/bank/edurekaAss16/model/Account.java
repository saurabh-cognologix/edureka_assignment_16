package com.bank.edurekaAss16.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Integer accountNumber;
    private String accountHolderName;
    private Double totalBalance;
    private Double depositAmount;
    private Double withdrawAmount;
}

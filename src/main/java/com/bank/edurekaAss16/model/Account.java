package com.bank.edurekaAss16.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Account {
    private Integer accountNumber;
    private String accountHolderName;
    private Double totalBalance = 100.00;
    private Double depositAmount;
    private Double withdrawAmount;
}

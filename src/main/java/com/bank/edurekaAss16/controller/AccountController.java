package com.bank.edurekaAss16.controller;

import com.bank.edurekaAss16.model.Account;
import com.bank.edurekaAss16.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountServices accountServices;

    //get the account details
    @GetMapping ("/account")
    public List<Account> getAccountDetails(){
        return accountServices.getAccountDetail();
    }


   // create new transaction
    @PostMapping("/deposit/{accountNumber}")
    public Double depositedAmount(@RequestBody Account account, @PathVariable("accountNumber") Integer accountNumber){
        return this.accountServices.depositedAmount(account.getDepositAmount());
    }
}

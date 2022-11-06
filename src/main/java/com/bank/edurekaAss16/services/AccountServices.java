package com.bank.edurekaAss16.services;

import com.bank.edurekaAss16.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServices {
    @Autowired
    private Account accountObj;
   // Account accountObj = new Account();
    private  static List<Account> accountList = new ArrayList<>();

    static {
        accountList.add(new Account(1212,"Maxi",500.00,0.0,0.0));
    }


    //get account details
    public List<Account> getAccountDetail() {
        return accountList;

    }
   public Double depositedAmount(Double deposit_amount){
       System.out.println("Amount Deposited In Account "+deposit_amount);
       accountObj.setTotalBalance(accountObj.getTotalBalance()+deposit_amount);
       System.out.println("Total Balance is "+accountObj.getTotalBalance());
        return deposit_amount;
    }

//    public void withdraw(Double withdraw_amount){
//       if(account.getTotalBalance() >=withdraw_amount){
//          // Double updateBalance =  account.setTotalBalance(account.getTotalBalance()-withdraw_amount);
//          // System.out.println("After withdraw :"+updateBalance);
//       }else{
//           System.out.println("You can not withdraw the amount....");
//       }
//        //System.out.println(updatedBalance);
//    }
}

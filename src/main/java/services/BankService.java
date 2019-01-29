package services;

import Bank.Bank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BankService {


    List<Bank> banksDatabase = new ArrayList<Bank>();

    public List<Bank> getBanks() {
        return banksDatabase;
    }
    public static Bank registerBank(Bank bank) {

        this.banksDatabase.add(bank);
        return bank;
    }
}

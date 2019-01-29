package services;

import Bank.*;

import java.util.ArrayList;
import java.util.List;

public class BranchService {

    public BankService bankService = new BankService();
    /*
    *Given bank
    *register branch
    *@return bank branches
    */
     public List<Branch> setBankBranches(Bank bank, Branch branch){

        if(bank.getBranches() == null || bank.getBranches().isEmpty()) {
            bank.setBranches(new ArrayList<Branch>());
        }

        bank.getBranches().add(branch);//TODO: no duplicates check :|

        BankService.registerBank(bank);
        return bank.getBranches();
    }

    public Account openAccount (Branch branch, Client client) {

        //add client to branch
        if(branch.getClients() == null || branch.getClients().isEmpty()){
            branch.setClients(new ArrayList<Client>());
        }
        branch.getClients().add(client);

        Account account = new Account( AccId = 1 , branch, client);

        //add client account info to branch
        if(branch.getClientsAccount() == null || branch.getClientsAccount().isEmpty()){
            branch.setBranchClientAccount(new ArrayList<ClientsAccount>());
        }

        branch.getBranchClientAccount().add(new ClientsAccount());

        return account;
    }
}

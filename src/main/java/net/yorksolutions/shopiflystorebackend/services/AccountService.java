package net.yorksolutions.shopiflystorebackend.services;

import net.yorksolutions.shopiflystorebackend.models.Account;
import net.yorksolutions.shopiflystorebackend.repositories.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountService {

    AccountRepo repository;

    public AccountService(AccountRepo repository) {
        this.repository = repository;
    }

    public ArrayList<Account> findAccountByEmail(String email) {
        ArrayList<Account> listOfAccounts = new ArrayList<>();
        Account foundAccount;
        try {
            if (repository.existsAccountByEmail(email)) {
                foundAccount = repository.findAccountByEmail(email);
                listOfAccounts.add(foundAccount);
            }
        } catch (Exception e) {

        }
        return listOfAccounts;
    }

    public Account add(Account account) {
        return repository.save(account);
    }
}

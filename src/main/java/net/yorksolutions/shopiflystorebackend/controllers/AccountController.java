package net.yorksolutions.shopiflystorebackend.controllers;

import net.yorksolutions.shopiflystorebackend.models.Account;
import net.yorksolutions.shopiflystorebackend.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/accounts")
@CrossOrigin
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public ArrayList<Account> findAccountByEmail(@RequestParam String email) {
        return accountService.findAccountByEmail(email);
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        return accountService.add(account);
    }

}

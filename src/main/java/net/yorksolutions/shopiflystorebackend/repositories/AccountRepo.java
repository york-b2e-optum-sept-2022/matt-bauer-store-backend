package net.yorksolutions.shopiflystorebackend.repositories;

import net.yorksolutions.shopiflystorebackend.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepo extends CrudRepository<Account, UUID> {
    public Account findAccountByEmail(String email);

    public Boolean existsAccountByEmail(String email);

}

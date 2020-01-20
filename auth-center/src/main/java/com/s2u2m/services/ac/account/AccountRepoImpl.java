package com.s2u2m.services.ac.account;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AccountRepoImpl implements AccountRepo {
    @Override
    public UsernameAccount getUsernameAccount(String identity) {
        var accounts = Map.ofEntries(
                Map.entry("user_1", "123456"),
                Map.entry("user_2", "123456")
        );
        if (!accounts.containsKey(identity)) {
            return null;
        }
        return new UsernameAccount(identity, accounts.get(identity));
    }
}

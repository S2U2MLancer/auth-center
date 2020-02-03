package com.s2u2m.services.ac.auth.username;

import com.s2u2m.services.ac.AppContextProvider;
import com.s2u2m.services.ac.repo.account.AccountRepo;
import com.s2u2m.services.ac.auth.AccountDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UsernameAccountDetailsService extends AccountDetailsService<UsernameAccount> {

    @Override
    protected UsernameAccount loadAccount(String identity) {
        return AppContextProvider.getContext().getBean(AccountRepo.class).getUsernameAccount(identity);
    }
}

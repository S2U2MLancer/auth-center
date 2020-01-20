package com.s2u2m.services.ac.service.account;

import com.s2u2m.services.ac.AppContextProvider;
import com.s2u2m.services.ac.account.AccountDetails;
import com.s2u2m.services.ac.account.AccountRepo;
import org.springframework.stereotype.Service;

@Service
public class UsernameAccountDetailsService extends AccountDetailsService {

    @Override
    protected AccountDetails loadAccount(String identity) {
        return AppContextProvider.getContext().getBean(AccountRepo.class).getUsernameAccount(identity);
    }
}

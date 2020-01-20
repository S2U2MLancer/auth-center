package com.s2u2m.services.ac.service.account;

import com.s2u2m.services.ac.account.AccountDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public abstract class AccountDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String identity) throws UsernameNotFoundException {
        return this.loadAccount(identity);
    }

    protected abstract AccountDetails loadAccount(String identity);
}

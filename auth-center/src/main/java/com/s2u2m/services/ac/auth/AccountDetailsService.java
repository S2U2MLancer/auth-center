package com.s2u2m.services.ac.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public abstract class AccountDetailsService<T extends AccountDetails> implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String identity) throws UsernameNotFoundException {
        return this.loadAccount(identity);
    }

    protected abstract T loadAccount(String identity);
}

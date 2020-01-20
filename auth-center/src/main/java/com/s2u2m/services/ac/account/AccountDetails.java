package com.s2u2m.services.ac.account;

import lombok.Getter;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
public abstract class AccountDetails implements UserDetails {
    private final String identity;
    private final String userId;

    protected AccountDetails(final String identity, final String userId) {
        this.identity = identity;
        this.userId = userId;
    }

    @Override
    public String getUsername() {
        return this.identity;
    }
}

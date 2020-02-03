package com.s2u2m.services.ac.repo.account;

import com.s2u2m.services.ac.auth.username.UsernameAccount;

public interface AccountRepo {
    UsernameAccount getUsernameAccount(String identity);
}

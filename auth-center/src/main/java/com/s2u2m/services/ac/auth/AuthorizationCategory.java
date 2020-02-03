package com.s2u2m.services.ac.auth;

import lombok.Getter;

@Getter
public enum AuthorizationCategory {
    USERNAME(1),
    PHONE(2)
    ;

    private final int order;
    AuthorizationCategory(final int order) {
        this.order = order;
    }
}

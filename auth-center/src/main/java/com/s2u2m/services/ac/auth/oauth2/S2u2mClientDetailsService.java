package com.s2u2m.services.ac.auth.oauth2;
//
//import org.springframework.security.oauth2.provider.ClientDetails;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.ClientRegistrationException;
//import org.springframework.security.oauth2.provider.client.BaseClientDetails;
//
//public class S2u2mClientDetailsService implements ClientDetailsService {
//
//    @Override
//    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
//        var details = new BaseClientDetails(clientId, "*", "all",
//                "authorization_code,implicit,password", "USER");
//        details.setClientSecret("123456");
//        return details;
//    }
//}

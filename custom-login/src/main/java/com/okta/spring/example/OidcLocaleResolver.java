package com.okta.spring.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Configuration
public class OidcLocaleResolver extends CookieLocaleResolver {
    private final Logger logger = LoggerFactory.getLogger(OidcLocaleResolver.class);

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        if (securityContext.getAuthentication().getPrincipal() instanceof OidcUser) {
            OidcUser user = (OidcUser) securityContext.getAuthentication().getPrincipal();
            logger.info("Setting locale from OidcUser: {}", user.getLocale());
            return Locale.forLanguageTag(user.getLocale());
        } else {
            return request.getLocale();
        }
    }
}

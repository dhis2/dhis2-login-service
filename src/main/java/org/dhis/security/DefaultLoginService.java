package org.dhis.security;

import org.dhis.user.User;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

public class DefaultLoginService
    implements LoginService
{
    /**
     * Cache login attempts, where usernames are keys and User objects are values.
     */
    private final Cache<String, Integer> USERNAME_LOGIN_ATTEMPTS_CACHE = Caffeine.newBuilder()
        .build(); //TODO set appropriate expiration time for cache
    
    private final int MAX_ATTEMPTS = 5;
        
    public void registerAuthenticationFailure( User user )
    {
        // TODO Implement this method        
    }

    public void registerAuthenticationSuccess( User user )
    {
        // TODO Implement this method        
    }

    public boolean isBlocked( User user )
    {
        // TODO Implement this method        
        return false;
    }
}

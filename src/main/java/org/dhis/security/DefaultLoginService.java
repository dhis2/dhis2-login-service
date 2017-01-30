package org.dhis.security;

import org.dhis.user.User;

import com.github.benmanes.caffeine.cache.LoadingCache;

public class DefaultLoginService
    implements LoginService
{
    /**
     * Cache for login attempts where usernames are keys and login attempts are values.
     */
    private final LoadingCache<String, Integer> USERNAME_LOGIN_ATTEMPTS_CACHE = null;
    
    // TODO Instantiate and configure this cache (https://github.com/ben-manes/caffeine)
    
    @Override
    public void registerAuthenticationFailure( AuthenticationEvent event )
    {
        // TODO Implement this method        
    }

    @Override
    public void registerAuthenticationSuccess( AuthenticationEvent event )
    {
        // TODO Implement this method        
    }

    @Override
    public boolean isBlocked( User user )
    {
        // TODO Implement this method        
        return false;
    }
}

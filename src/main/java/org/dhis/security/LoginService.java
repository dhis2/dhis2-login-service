package org.dhis.security;

import org.dhis.user.User;

/**
 * Manages user logins and handles lockouts after when the 
 * max number of authentication failures has been exceeded
 * per user.
 */
public interface LoginService
{
    /**
     * Registers an authentication success.
     * @param user the user attempting the authentication.
     */
    void registerAuthenticationFailure( User user );
    
    /**
     * Registers an authentication failure.
     * @param user the user attempting the authentication.
     */
    void registerAuthenticationSuccess( User user );
    
    /**
     * Indicates whether the user is blocked from further
     * authentication due to exceeding max number of failures.
     * @param user the user attempting the authentication.
     * @return false if the user is blocked, true otherwise.
     */
    boolean isBlocked( User user );
}

package org.dhis.security;

/**
 * Abstraction for an authentication attempt.
 */
public class AuthenticationEvent
{
    private String username;
    
    public AuthenticationEvent( String username )
    {
        this.username = username;
    }
    
    public String getUsername()
    {
        return username;
    }
}

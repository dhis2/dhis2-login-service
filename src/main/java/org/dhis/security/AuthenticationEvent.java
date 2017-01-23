package org.dhis.security;

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

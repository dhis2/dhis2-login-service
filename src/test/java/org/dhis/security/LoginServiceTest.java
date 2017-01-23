package org.dhis.security;

import org.dhis.security.DefaultLoginService;
import org.dhis.security.LoginService;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest
{
    private LoginService loginService;
    
    @Before
    public void before()
    {
        loginService = new DefaultLoginService();
    }
    
    @Test
    public void testUserIsBlocked()
    {
        // TODO Implement this test
    }

    @Test
    public void testMultipleAuthenticationFailuresThenAuthenticationSuccess()
    {
        // TODO Implement this test
    }
}

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
    public void testFoo()
    {
        // TODO Implement at least two unit tests verifying the LoginService interface behavior
    }
}

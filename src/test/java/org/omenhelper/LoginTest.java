package org.omenhelper;

import org.junit.Test;
import org.omenhelper.Omen.Login;

/**
 * @Author jiyec
 * @Date 2021/5/29 14:17
 * @Version 1.0
 **/
public class LoginTest {
    @Test
    public void testLogin(){
        String email = System.getenv("EMAIL");
        String pass = System.getenv("PASS");
        // TODO: client id获取
        Login login = new Login(email, pass, "6589915c-6aa7-4f1b-9ef5-32fa2220c844", "");
        login.doWeb();
    }
}
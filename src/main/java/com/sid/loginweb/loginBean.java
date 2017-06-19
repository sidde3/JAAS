/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sid.loginweb;

import java.util.Map;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

/**
 *
 * @author siddh_000
 */
public class loginBean implements LoginModule{
    private String password;
    private String userName;
    
    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login() throws LoginException {
        CallbackHandler handler = new CallBackHndlr(userName,password);
        try{
            LoginContext lc = new LoginContext("other", handler);
            lc.login();
            return true;
        }catch(LoginException e){
            e.printStackTrace();
        }
        throw new UnsupportedOperationException("Login Exception");
    }

    @Override
    public boolean commit() throws LoginException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean abort() throws LoginException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean logout() throws LoginException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String userName) {
        this.userName = userName;
    }
    public String getUsername() {
        return userName;
    }
}

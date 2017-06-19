/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sid.loginweb;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.util.logging.Logger;

/**
 *
 * @author siddh_000
 */
public class CallBackHndlr implements CallbackHandler{
    private static final Logger log = Logger.getLogger(CallBackHndlr.class.getName());
    private String userName;
    private String password;

    public CallBackHndlr(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
      for (int i = 0; i < callbacks.length; i++) {
        if (callbacks[i] instanceof NameCallback) {
           NameCallback nameCallback = (NameCallback) callbacks[i];
           log.info(nameCallback.getPrompt());
           nameCallback.setName(userName);
        } else if (callbacks[i] instanceof PasswordCallback) {
           PasswordCallback passwordCallback = (PasswordCallback) callbacks[i];
           log.info(passwordCallback.getPrompt());
           passwordCallback.setPassword(password.toCharArray());
        } else {
           throw new UnsupportedCallbackException(callbacks[i], "The submitted Callback is unsupported");
        }
     }
    }
}

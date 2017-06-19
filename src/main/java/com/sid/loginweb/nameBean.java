/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sid.loginweb;

/**
 *
 * @author siddh_000
 */
public class nameBean {
    private String uname;
    private String passwd;
    
    public nameBean() { 
        uname = null;
        passwd = null;
    }
    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }
    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}

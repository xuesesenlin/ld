package org.fx.account.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountModel implements Serializable {

    private String account;
    private String password;
    private String types;
    private String flag;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public AccountModel() {
        super();
    }

    public AccountModel(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public AccountModel(String account, String password, String types) {
        this.account = account;
        this.password = password;
        this.types = types;
    }

    public AccountModel(String account, String password, String types, String flag) {
        this.account = account;
        this.password = password;
        this.types = types;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", types='" + types + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}

package com.company.contracts;

public interface Login extends VisibleInterface {

    void login(String username, String password);

    String getErrorMessage();

    boolean verifyOnProductPage();

}


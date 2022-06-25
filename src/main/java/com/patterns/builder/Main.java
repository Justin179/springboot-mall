package com.patterns.builder;

public class Main {
    public static void main(String[] args) {

        Name name = new Name.Builder().firstname("Justin").lastname("Chen").build();
        Address address = new Address.Builder().address1("台北市").address2("士林區").build();

        Account account = new Account.Builder().address(address).name(name).id(1).email("justin@gmail.com").build();

        System.out.println(account);
    }
}

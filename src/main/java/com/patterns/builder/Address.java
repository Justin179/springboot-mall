package com.patterns.builder;

public class Address {

    private final String address1;

    private final String address2;

    private Address(Address.Builder builder) {
        this.address1 = builder.address1;
        this.address2 = builder.address2;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }




    public static class Builder
    {
        private String address1;
        private String address2;

        public String getAddress1() {
            return address1;
        }

        public String getAddress2() {
            return address2;
        }


        public Address.Builder address1(final String address1) {
            this.address1 = address1;
            return this;
        }
        public Address.Builder address2(final String address2) {
            this.address2 = address2;
            return this;
        }


        //Return the finally consrcuted User object
        public Address build() {
            return new Address(this);
        }

    }
}

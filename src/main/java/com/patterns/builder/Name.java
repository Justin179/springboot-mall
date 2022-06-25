package com.patterns.builder;

public class Name {

    private final String firstname;
    private final String lastname;

    private Name(Name.Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public static class Builder
    {
        private String firstname;
        private String lastname;

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }


        public Name.Builder firstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }
        public Name.Builder lastname(final String lastname) {
            this.lastname = lastname;
            return this;
        }


        //Return the finally consrcuted User object
        public Name build() {
            return new Name(this);
        }

    }
}

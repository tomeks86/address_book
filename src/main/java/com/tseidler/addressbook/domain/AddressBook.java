package com.tseidler.addressbook.domain;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class AddressBook {
    @OneToOne
    private User owner;

    @OneToMany
    private User user;

    public AddressBook() {
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

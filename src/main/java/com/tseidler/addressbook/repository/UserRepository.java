package com.tseidler.addressbook.repository;

import com.tseidler.addressbook.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User, Integer> {

    ArrayList<User> getByCity(String city);
}

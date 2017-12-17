package com.tseidler.addressbook.repository;

import com.tseidler.addressbook.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

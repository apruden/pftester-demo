package com.pfs.automation.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pfs.automation.domain.User;

public interface UserRepository extends CrudRepository<User, String> {
}

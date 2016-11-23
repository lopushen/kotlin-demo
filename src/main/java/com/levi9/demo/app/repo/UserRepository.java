package com.levi9.demo.app.repo;


import com.levi9.demo.app.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}

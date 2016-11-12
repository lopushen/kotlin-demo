package com.levi9.demo.repo;


import com.levi9.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
    User findByNameAndId(String name, Long id);

}

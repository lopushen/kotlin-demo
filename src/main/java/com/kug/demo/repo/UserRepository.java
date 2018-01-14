package com.kug.demo.repo;


import com.kug.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
    User findByNameAndId(String name, Long id);

}

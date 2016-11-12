package com.levi9.demo.repo;


import com.levi9.demo.domain.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {
    void createUser(User user);
    void deleteUser(User user);
    User findById(Long id);
    User findByName(String name);
    User findByNameAndId(String name, Long id);

}

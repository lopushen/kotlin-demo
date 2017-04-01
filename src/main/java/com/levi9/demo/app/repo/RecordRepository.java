package com.levi9.demo.app.repo;


import com.levi9.demo.app.domain.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Long> {
    Record findByName(String name);
}

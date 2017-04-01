package com.levi9.demo.app.service;

import com.levi9.demo.app.domain.Record;
import com.levi9.demo.app.repo.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RecordService {
    private RecordRepository repository;

    @Autowired
    public RecordService(RecordRepository repository) {
        this.repository = repository;
    }

    public void createRecord(Record record) {
        repository.save(record);
    }

    public Record getRecord(String name) {
        return repository.findByName(name);
    }


    public Record getRecord(Long id) {
        Record one = repository.findOne(id);

        return one;
    }

    public static void throwAnException() throws IOException {
        throw new IOException();
    }
}

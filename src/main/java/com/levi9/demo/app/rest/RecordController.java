package com.levi9.demo.app.rest;

import com.levi9.demo.app.domain.Record;
import com.levi9.demo.app.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("record")
public class RecordController {

    private RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Record getRecord(@RequestParam(value = "name", required = false) String name, @RequestParam(value =
            "id", required = false) Long id) {
        return recordService.getRecord(name);


    }

    @RequestMapping(method = RequestMethod.POST)
    public void createrecord(@RequestBody Record record) {
        recordService.createRecord(record);
    }
}

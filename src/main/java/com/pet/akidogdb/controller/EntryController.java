package com.pet.akidogdb.controller;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@Slf4j
public class EntryController {

    @Autowired
    private DSLContext dsl;


    @GetMapping
    public ResponseEntity helloWorld() {

        System.out.println("dsl = " +  dsl.selectFrom("hello_world").fetch());

        return ResponseEntity.ok("helloWorld Aki.");
    }
}

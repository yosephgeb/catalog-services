package com.polarbookshop.catalogservices.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@Slf4j
public class BookController {

    @GetMapping
    public ResponseEntity<String> get(){
        log.info("Getting all books from the catalog.");
        return ResponseEntity.ok("Here are all the book in the DB");
    }
}

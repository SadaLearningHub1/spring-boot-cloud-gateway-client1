package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/posts")
class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);

    @GetMapping("")
    String findAll() {
        return "I am from root controller";
    }

    @GetMapping("/{id}")
    String findById(@PathVariable Integer id) {
        return "I am from /api/posts/{id}";
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    String save(@RequestBody @Valid Post post) {
        return "I am from /api/posts post method";
    }

    @PutMapping("/{id}")
    String update(@PathVariable Integer id, @RequestBody Post post) {
        return "I am from /api/posts put method";
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    String delete(@PathVariable Integer id) {
        return "I am from delete method";
    }

}

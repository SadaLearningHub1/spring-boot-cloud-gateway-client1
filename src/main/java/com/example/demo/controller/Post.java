package com.example.demo.controller;

import jakarta.validation.constraints.NotEmpty;

record Post(
        Integer id,
        Integer userId,
        @NotEmpty
        String title,
        @NotEmpty
        String body,
        Integer version
){

}

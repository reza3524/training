package com.reza.training.controller;

import com.reza.training.model.Course;
import com.reza.training.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @GetMapping("all")
    public ResponseEntity<List<Course>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
}

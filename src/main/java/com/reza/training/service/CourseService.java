package com.reza.training.service;

import com.reza.training.model.Course;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    List<Course> courses = new ArrayList<>();

    @PostConstruct
    public void init() {

        Course c1 = new Course();
        c1.setId(1L).setTitle("first title").setMentor("mentor A").setRegisterDate(LocalDate.now());

        Course c2 = new Course();
        c2.setId(2L).setTitle("second title").setMentor("mentor B").setRegisterDate(LocalDate.now());

        Course c3 = new Course();
        c3.setId(2L).setTitle("third title").setMentor("mentor C").setRegisterDate(LocalDate.now());

        courses.addAll(Arrays.asList(c1, c2, c3));
    }

    public List<Course> findAll() {
        return courses;
    }
}

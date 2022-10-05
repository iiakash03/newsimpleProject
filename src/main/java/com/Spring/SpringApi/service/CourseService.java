package com.Spring.SpringApi.service;

import com.Spring.SpringApi.Entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourse();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);
}

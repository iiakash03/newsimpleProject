package com.Spring.SpringApi.Controller;

import com.Spring.SpringApi.Entities.Course;
import com.Spring.SpringApi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return"This is homepage";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourse();

    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
// get the courses
package com.Spring.SpringApi.service;

import com.Spring.SpringApi.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(145,"Java core course","this course contains"));
        list.add(new Course(4343,"Spring","Spring coufrse"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for (Course course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}

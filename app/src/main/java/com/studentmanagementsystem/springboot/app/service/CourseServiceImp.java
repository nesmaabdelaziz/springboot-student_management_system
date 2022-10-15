package com.studentmanagementsystem.springboot.app.service;

import com.studentmanagementsystem.springboot.app.dao.CourseDAO;
import com.studentmanagementsystem.springboot.app.entity.Course;
import com.studentmanagementsystem.springboot.app.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImp implements CourseService {

    private CourseDAO courseDAO;

    @Autowired
    public CourseServiceImp(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public void save(Course course) {
        courseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        Optional<Course> result = courseDAO.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Student> getStudentsInCourse(int courseId) {
        return courseDAO.getStudentsInCourse(courseId);
    }

    @Override
    public List<Course> viewEnrolledCourses(int studentId) {
        return courseDAO.viewStudentsAssignedCourses(studentId);
    }
}

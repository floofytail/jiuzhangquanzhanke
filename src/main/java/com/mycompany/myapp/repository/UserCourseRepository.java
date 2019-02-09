package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;
import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.domain.UserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserCourseRepository extends JpaRepository<UserCourse, Long>{
    List<UserCourse> findAllByUser(User user);
    List<UserCourse> findAllByCourseAndUser(Course course, User user);
    List<UserCourse> removeByCourseAndUser(Course course, User user);
}

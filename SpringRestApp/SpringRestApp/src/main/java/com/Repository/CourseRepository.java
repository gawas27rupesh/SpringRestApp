package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}

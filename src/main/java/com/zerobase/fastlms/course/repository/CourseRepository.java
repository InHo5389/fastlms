package com.zerobase.fastlms.course.repository;

import com.zerobase.fastlms.course.entitiy.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {

    Optional<List<Course>> findByCategoryId(long categoryId);
}

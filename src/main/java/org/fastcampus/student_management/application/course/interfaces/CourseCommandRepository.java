package org.fastcampus.student_management.application.course.interfaces;

import org.fastcampus.student_management.domain.Course;

/**
 * @author jerry
 * @description
 * @since 2026.09.14
 **********************************************************************************************************************/
public interface CourseCommandRepository {
    
    void save(Course course);
}

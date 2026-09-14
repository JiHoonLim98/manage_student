package org.fastcampus.student_management.repo;

import org.fastcampus.student_management.application.course.interfaces.CourseQueryRepository;
import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

import java.util.List;

/**
 * @author jerry
 * @description
 * @since 2026.09.14
 **********************************************************************************************************************/
public class CourseJdbcCommandRepository implements CourseQueryRepository {
    
    
    @Override
    public List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek) {
        return null;
    }
    
    @Override
    public List<Course> getCourseListByStudent(String studentName) {
        return null;
    }
}

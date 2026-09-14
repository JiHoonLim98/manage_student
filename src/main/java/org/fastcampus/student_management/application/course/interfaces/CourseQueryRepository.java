package org.fastcampus.student_management.application.course.interfaces;

import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

import java.util.List;

/**
 * @author jerry
 * @description
 * @since 2026.09.14
 **********************************************************************************************************************/
public interface CourseQueryRepository {
    
    List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek);
    
    List<Course> getCourseListByStudent(String studentName);
}

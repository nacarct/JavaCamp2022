package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs eklendi.");
    }

    @Override
    public List<Course> getAll() {
        return new ArrayList<>();
    }
}

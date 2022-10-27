package dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {
    @Override
    public void add(Teacher teacher) {
        System.out.println("Jdbc ile eğitmen eklendi.");
    }
}

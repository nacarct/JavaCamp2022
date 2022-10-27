import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateTeacherDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new MailLogger(), new FileLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), List.of(loggers));
        categoryManager.add(new Category(1,"Java"));

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), List.of(loggers));
        teacherManager.add(new Teacher(1, "Engin Demiroğ"));

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), List.of(loggers));
        courseManager.add(new Course(1,"Java Kursu",20,1,1));
    }
}
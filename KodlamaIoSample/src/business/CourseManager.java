package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getPrice() < 0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }

        if (courseDao.getAll().stream().map(Course::getName).filter(course.getName()::equals).findFirst().isPresent()){
            throw new Exception("Aynı isimde kurs mevcut.");
        }

        courseDao.add(course);

        for (Logger logger: loggers) {
            logger.log(course.getName());
        }
    }


}

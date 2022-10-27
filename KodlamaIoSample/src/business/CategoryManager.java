package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;
import entities.Course;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (categoryDao.getAll().stream().map(Category::getName).filter(category.getName()::equals).findFirst().isPresent()){
            throw new Exception("Aynı isimde kategori mevcut.");
        }

        categoryDao.add(category);

        for (Logger logger: loggers) {
            logger.log(category.getName());
        }
    }
}

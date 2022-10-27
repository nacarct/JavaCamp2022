package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi.");
    }

    @Override
    public List<Category> getAll() {
        return new ArrayList<>();
    }
}

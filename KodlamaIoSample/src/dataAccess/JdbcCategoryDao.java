package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile kategori eklendi.");
    }

    @Override
    public List<Category> getAll() {
        return new ArrayList<>();
    }
}

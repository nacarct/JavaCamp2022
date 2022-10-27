package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("JDBC ile veri tabanına eklenmiştir.");
    }
}

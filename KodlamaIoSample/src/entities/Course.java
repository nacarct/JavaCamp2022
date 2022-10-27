package entities;

public class Course {
    private int id;
    private String name;
    private double price;
    private int categoryId;
    private int teacherId;

    public Course() {
    }

    public Course(int id, String name, double price, int categoryId, int teacherId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}

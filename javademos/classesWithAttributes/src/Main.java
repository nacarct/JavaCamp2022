public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 10000, 3, "Siyah");

        /*product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(10000);
        product.setStockAmount(3);
        product.setColor("Siyah");*/

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}
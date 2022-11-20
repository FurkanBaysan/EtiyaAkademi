public class Main {
    public static void main(String[] args) {
        //  Encapsulation and Constructors

        Product firstProduct = new Product();

        firstProduct.setId(1);
        firstProduct.setName("Laptop");
        firstProduct.setDescription("Huawei Matebook D16");
        firstProduct.setPrice(23000);
        firstProduct.setStockAmount(3);

        System.out.println(firstProduct.getId());
        System.out.println(firstProduct.getName());
        System.out.println(firstProduct.getDescription());
        System.out.println(firstProduct.getPrice());
        System.out.println(firstProduct.getStockAmount());

        System.out.println();

        ProductManager productManager = new ProductManager();
        productManager.add(firstProduct);

        System.out.println(firstProduct.getKod());


        System.out.println();

        Product secondProduct = new Product(2, "Laptop", "Huawei Matebook X Pro", 45000, 2);

        //  Info-> Constructors are alternative to setters

        System.out.println(secondProduct.getId());
        System.out.println(secondProduct.getName());
        System.out.println(secondProduct.getDescription());
        System.out.println(secondProduct.getPrice());
        System.out.println(secondProduct.getStockAmount());
        System.out.println(secondProduct.getKod());


    }
}
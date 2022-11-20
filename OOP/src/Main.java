public class Main {
    public static void main(String[] args) {

        Product firstProduct = new Product();
        //new Product() -> Instance, object
        // product-> object referer, reference

        firstProduct.setName("Erkek Deri Bot");
        firstProduct.setUnitPrice(50);
        firstProduct.setDiscountRate(13.5);
        firstProduct.setUnitsInStock(15);
        firstProduct.setImageUrl("bot.jpeg");

        System.out.println(firstProduct.getName());
        System.out.println(firstProduct.getUnitPrice());
        System.out.println(firstProduct.getDiscountRate());
        System.out.println(firstProduct.getUnitsInStock());

        System.out.println();

        Product secondProduct = new Product();
        secondProduct.setUnitPrice(10523);
        secondProduct.setName("4K Ultra HD TV");

        System.out.println(secondProduct.getName());
        System.out.println(secondProduct.getUnitPrice());

        System.out.println();

        Product thirdProduct = new Product("Huawei", 23000,
                "productimages.hepsiburada.net/s/308/550/110000300562196.jpg/format:webp", 20);
        System.out.println(thirdProduct.getName() + " " + thirdProduct.getUnitPrice() + " " + thirdProduct.getUnitsInStock());
        System.out.println(thirdProduct.getImageUrl());

    }
}
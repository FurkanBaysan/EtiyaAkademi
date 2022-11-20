
public class Product {
    //PascalCase ,camelCase

    private String name;
    private double unitPrice;
    private String imageUrl;
    private double discountRate;
    private int unitsInStock;

    public Product() {

    }

    public Product(String name, double unitPrice, String imageUrl, int unitsInStock) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.imageUrl = imageUrl;
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(double discountRate) { // This shouldn't be available
        this.discountRate = discountRate;
    }

    public int getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        if (unitsInStock <= 0) {
            this.unitsInStock = 0;
        } else {
            this.unitsInStock = unitsInStock;
        }

    }
}

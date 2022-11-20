public class Product {
    //attributes | fields
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod; // Read-Only

    //  At 99%, both getter and setter of related attributes are defined.
    //  Sometimes, there are attributes that we just need to define as read-only, like the kod attribute above (unitPriceAfterDiscount attribute is also an example of this).
    //  In such cases, we define the relevant attribute as read-only (just defining its getter and not its setter).

    public Product() { // Default Constructor

    }

    public Product(int id, String name, String description, double price, int stockAmount) { // Parametrized Constructor
        this.id = id;
        this.name = name;
        this.description = description;
        //this.price = price;
        setPrice(price);
        //this.stockAmount = stockAmount;
        setStockAmount(stockAmount);
    }

    //getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        // Validation
        if (this.name.isEmpty()) {
            return "";
        }
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        //Validation
        if (price <= 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

    }

    public void setStockAmount(int stockAmount) {
        //Validation
        if (stockAmount <= 0) {
            this.stockAmount = 0;
        } else {
            this.stockAmount = stockAmount;
        }

    }

    public String getKod() {
        //Validation
        return this.name.substring(0, 1) + this.id;
    }


}

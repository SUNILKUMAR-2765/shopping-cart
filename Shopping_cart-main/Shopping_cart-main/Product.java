class Product {
    private String name;
    private double price;
    private String quality;

    public Product(String name, double price, String quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quality='" + quality + "'}";
    }
}
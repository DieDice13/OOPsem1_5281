package Domain;


public class Product {
    private String name;
    private int price;
    private int place;

    public Product(String name, int price, int place) {
        this.name = name;
        setPrice(price);
        this.place = place;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public int getPlace() {
        return this.place;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int val) {
        if (val <= 0) this.price = 10;
        else this.price = val;
    }
    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("Продукт = %s Цена = %d Место = %d", this.name, this.price, this.place);
    }
}
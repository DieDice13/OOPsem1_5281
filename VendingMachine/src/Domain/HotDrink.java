package Domain;

public class HotDrink extends Product{
    private int temp;

    public HotDrink(String name, int price, int place, int temp) {
        super(name, price, place);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Температура %d", temp);
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}

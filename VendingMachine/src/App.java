import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Service.CoinDispencer;
import Service.Holder;
import Service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> product = new ArrayList<>();
        Product prod1 = new Product("Лэйс", 100, 0);
        Product prod2 = new Product("Кока-колла", 50, 1);
        Product prod3 = new Product("Милка", 80, 2);
        Product prod4 = new Product("Баунти", 95, 3);
        Product prod5 = new Bottle("Аквиминирале", 110, 4, 0.5);
        Product prod6 = new HotDrink("Безалкогольный глинтвейн", 150, 5, 70);
        Product prod7 = new HotDrink("Горячий шоколад", 125, 6, 76);

        product.add(prod1);
        product.add(prod2);
        product.add(prod3);
        product.add(prod4);
        product.add(prod5);
        product.add(prod6);
        product.add(prod7);

        Holder holder = new Holder();
        CoinDispencer dicpencer = new CoinDispencer();
        VendingMachine machine = new VendingMachine(holder, dicpencer, product);
        for (Product prod : machine.getProduct()) {
            System.out.println(prod);
        }
    }
}

package Service;

import java.util.List;

import Domain.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispencer dicpencer;
    private List<Product> assortiment;

    /**
     * Конструктор
     * @param holder
     * @param dicpencer
     * @param assortiment
     */
    public VendingMachine(Holder holder, CoinDispencer dicpencer, List<Product> assortiment) {
        this.holder = holder;
        this.dicpencer = dicpencer;
        this.assortiment = assortiment;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public CoinDispencer getDicpencer() {
        return dicpencer;
    }

    public void setDicpencer(CoinDispencer dicpencer) {
        this.dicpencer = dicpencer;
    }

    public List<Product> getProduct() {
        return assortiment;
    }

    public void setProduct(List<Product> assortiment) {
        this.assortiment = assortiment;
    }
}

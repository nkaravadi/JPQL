package com.naga.jpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Basket {
    @Id
    private String basketRic;
    private double weight;

    public Basket() {
    }

    public Basket(String basketRic, double weight) {
        this.basketRic = basketRic;
        this.weight = weight;
    }

    public String getBasketRic() {
        return basketRic;
    }

    public void setBasketRic(String basketRic) {
        this.basketRic = basketRic;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

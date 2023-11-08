package model;

import java.util.Objects;

public class VirtualMachine {
    private final String price;

    public VirtualMachine(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "pryce " + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VirtualMachine)) return false;
        VirtualMachine virtualMachine = (VirtualMachine) o;
        return Objects.equals(price, virtualMachine.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}

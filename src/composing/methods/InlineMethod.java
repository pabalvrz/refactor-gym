package composing.methods;

public class InlineMethod {

    private boolean isHighValue(double price) {
        return price > 1000.0;
    }

    public double applyDiscount(double price) {
        if (isHighValue(price)) {
            return price * 0.9;
        }
        return price;
    }

    public double applyDiscountArreglado(double price) {
        return price > 1000.0 ? price * 0.9 : price;
    }
}

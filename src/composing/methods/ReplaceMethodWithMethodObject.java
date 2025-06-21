package composing.methods;

public class ReplaceMethodWithMethodObject {
    public double calculate(double principal, double rate, int years) {
        double result = principal;
        for (int i = 1; i <= years; i++) {
            result *= (1 + rate);
            if (i % 2 == 0) {
                result += 50; // Bonificación bienal
            }
        }
        return result;
    }

    public double calculateArreglado(double principal, double rate, int years) {
        return new Calculate(principal, rate, years).compute();
    }
}

class Calculate {
    private double principal;
    private double rate;
    private double years;

    public Calculate (double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    public double compute() {
        double result = principal;
        for (int i = 1; i <= years; i++) {
            result *= (1 + rate);
            if (i % 2 == 0) {
                result += 50; // Bonificación bienal
            }
        }
        return result;
    }
}

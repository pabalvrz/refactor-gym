import composing.methods.*;

public class Main {


    public static void main(String[] args) {

//        llamadaExtractMethod();
//        llamadaExtractMethodSolucion()
//        llamadaInlineMethod();
//        llamadaInlineMethodArreglado();
//        llamadaInlineTemp();
//        llamadaInlineTempArreglado();
//        llamadaReplaceTempWithQuery();
//        llamadaReplaceTempWithQueryArreglado();
        llamadaSplitTemporaryVariable();
        llamadaSplitTemporaryVariableArreglado();


    }

    private static void llamadaSplitTemporaryVariableArreglado() {
        SplitTemporaryVariable physics = new SplitTemporaryVariable();
        physics.calculateMovementArreglado(5.0, 9.8, 10.0);
    }

    private static void llamadaSplitTemporaryVariable() {
        SplitTemporaryVariable physics = new SplitTemporaryVariable();
        physics.calculateMovement(5.0, 9.8, 10.0);
    }

    private static void llamadaReplaceTempWithQueryArreglado() {
        ReplaceTempWithQuery cart = new ReplaceTempWithQuery();
        System.out.println("Total (5 items x $200): $" + cart.calculateTotalArreglado(5, 200.0));
        System.out.println("Total (3 items x $500): $" + cart.calculateTotalArreglado(3, 500.0));
    }

    private static void llamadaReplaceTempWithQuery() {
        ReplaceTempWithQuery cart = new ReplaceTempWithQuery();
        System.out.println("Total (5 items x $200): $" + cart.calculateTotal(5, 200.0));
        System.out.println("Total (3 items x $500): $" + cart.calculateTotal(3, 500.0));
    }

    private static void llamadaInlineTemp() {
        InlineTemp calculator = new InlineTemp();
        System.out.println("Total (precio $80): $" + calculator.calculateTotal(80.0));
        System.out.println("Total (precio $120): $" + calculator.calculateTotal(120.0));
    }

    private static void llamadaInlineTempArreglado() {
        InlineTemp calculator = new InlineTemp();
        System.out.println("Total (precio $80): $" + calculator.calculateTotalArreglado(80.0));
        System.out.println("Total (precio $120): $" + calculator.calculateTotalArreglado(120.0));
    }

    private static void llamadaInlineMethodArreglado() {
        InlineMethod calculator = new InlineMethod();
        System.out.println("Precio con descuento: $" + calculator.applyDiscountArreglado(1200.0));
        System.out.println("Precio con descuento: $" + calculator.applyDiscountArreglado(800.0));
    }

    private static void llamadaInlineMethod() {
        InlineMethod calculator = new InlineMethod();
        System.out.println("Precio con descuento: $" + calculator.applyDiscount(1200.0));
        System.out.println("Precio con descuento: $" + calculator.applyDiscount(800.0));
    }

    private static void llamadaExtractMethod() {
        ExtractMethod extractMethod = new ExtractMethod();
        String[] sections = {"Introducción", "Desarrollo", "Conclusión"};
        int[] wordCounts = {500, 1500, 800};
        extractMethod.generateReport("Análisis de Mercado", sections, wordCounts);
    }

    private static void llamadaExtractMethodSolucion() {
        ExtractMethod extractMethod = new ExtractMethod();
        String[] sections = {"Introducción", "Desarrollo", "Conclusión"};
        int[] wordCounts = {500, 1500, 800};
        extractMethod.generateReportArreglado("Análisis de Mercado", sections, wordCounts);
    }
}
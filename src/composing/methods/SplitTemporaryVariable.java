package composing.methods;

public class SplitTemporaryVariable {

    public void calculateMovement(double mass, double acceleration, double time) {
        double temp = mass * acceleration;  // Fuerza
        System.out.println("Fuerza aplicada: " + temp + " N");

        temp = temp * time;  // Impulso (cambia el significado de temp)
        System.out.println("Impulso generado: " + temp + " N·s");
    }

    public void calculateMovementArreglado(double mass, double acceleration, double time) {
        double temp = mass * acceleration;  // Fuerza
        System.out.println("Fuerza aplicada: " + temp + " N");

        double impulso = temp * time;  // Impulso (cambia el significado de temp)
        System.out.println("Impulso generado: " + impulso + " N·s");
    }
}

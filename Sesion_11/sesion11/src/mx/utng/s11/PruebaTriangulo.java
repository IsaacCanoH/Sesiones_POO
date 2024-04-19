package mx.utng.s11;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(5.0, 4.0, "Color Pastel");
        System.out.println("Info. de Triangulo");
        triangulo1.mostrarDimension();
        triangulo1.mostrarEstilo();
        System.out.println("Su área es: " + triangulo1.area());

        Triangulo triangulo2 = new Triangulo(7.0, 8.2, "Color Amarillo");
        System.out.println("Info. de Triangulo");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("Su área es: " + triangulo2.area());

        Triangulo triangulo3 = new Triangulo(15.0, 9.0, "Color Gris");
        System.out.println("Info. de Triangulo");
        triangulo3.mostrarDimension();
        triangulo3.mostrarEstilo();
        System.out.println("Su área es: " + triangulo3.area());
    }
}

class Triangulo {
    double base;
    double altura;
    String color;

    Triangulo(double b, double h, String c) {
        base = b;
        altura = h;
        color = c;
    }

    void mostrarDimension() {
        System.out.println("Base y altura son: " + base + " y " + altura);
    }

    void mostrarEstilo() {
        System.out.println("Triangulo es " + color);
    }

    double area() {
        return base * altura / 2;
    }
}

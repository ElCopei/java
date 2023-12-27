package Poo2.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

   public boolean existe(){
    if (a>b+c||b>a+c||c>a+b) {
        return false;        
    }
    else {
        return true;
    }
   }
   
    public double area() { // a classe deve ser resposável por calcular sua própria área
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public void printa() {
        System.out.printf("%.4f", area());
        System.out.println(" ");
    }
    public void tipo() {
        if (a == b && b == c) {
            System.out.println("Tipo: equilatero");
        } else if (a != b && b != c && c != a) {
            System.out.println("Tipo: escaleno");
        } else {
            System.out.println("Tipo: isoceles");
        }
      }
    }



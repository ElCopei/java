package Poo2.application;

import java.util.Locale;
import java.util.Scanner;

import Poo2.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Triangle x, y; // cria as variáveis x e y do tipo triangle
        x = new Triangle(); // intancia o objeto x do tipo triangle
        y = new Triangle(); // instancia o objeto y do tipo triangle
        //double p;
        double areaX, areaY;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measure of triangle X: ");
        x.a = sc.nextDouble(); // atriu valor ao atributo lado a de x
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        //p = (x.a + x.b + x.c) / 2;
        
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); // atribui valor ao atributo lado a de y
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        //p = (y.a + y.b + y.c) / 2;
        
        if (x.existe()==true && y.existe()==true) {
        areaX = x.area(); // chamada do método que calcula a área para x
        areaY = y.area(); //chamada do método que calcula a área para y
        System.out.println("The triangle X area is equal to: ");
        x.printa();
        System.out.println("The triangle Y area is equal to: ");
        y.printa();

        System.out.println(" ");

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        System.out.println(" ");

        System.out.println("Triangle x: ");
        x.tipo();
        System.out.println("Triangle y: ");
        y.tipo();
    }
    else{
        System.out.println("Um dos triangulos não obedece as condições de existencia");
    }
        sc.close();
    }

}

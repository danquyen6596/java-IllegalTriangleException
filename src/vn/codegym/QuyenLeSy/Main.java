package vn.codegym.QuyenLeSy;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập các cạnh của 1 tam giác:");
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("b = ");
        float c = scanner.nextFloat();

        try{
            Triangle(a,b,c);

        }
        catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }


    }

    public static void Triangle(float side1, float side2, float side3) throws   IllegalTriangleException {
        if (side1 >= side2 + side3)
            throw new IllegalTriangleException(side1);
        else if (side2 >= side1 + side3)
            throw new IllegalTriangleException(side2);
        else if (side3 >= side2 + side1)
            throw new IllegalTriangleException(side3);
        else{
            System.out.println("a, b, c là 3 cạnh của tam giác!");
        }
    }
}

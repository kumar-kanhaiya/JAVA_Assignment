package Conditional_Loops;

import java.util.Scanner;

public class conditionalAndLoops {

    public static void main(String[] args) {
        AreaOfCircle(5);

    }
    // function for finding Area of a circle
    public static void AreaOfCircle(int radius){
        float area = (float)(3.14 * radius * radius );
        System.out.printf("Area of a Circle is %.2f" , area);
    }
}

package ParametersAndReturn;

public class CircleArea {

    public static void circleArea(double radius){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        circleArea(2);
    }
}

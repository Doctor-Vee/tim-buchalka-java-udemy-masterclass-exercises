package chapter4;

public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        return feet * 30.48 + inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if ( inches < 0 ) return -1;
        double feet = Math.floor(inches/12);
        double inch = inches % 12;
        return (calcFeetAndInchesToCentimeters(feet, inch));
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.2f", calcFeetAndInchesToCentimeters(341)));
    }
}

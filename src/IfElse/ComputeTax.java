package IfElse;

public class ComputeTax {

    public static void main(String[] args) {
        System.out.println("The tax on $50000 is " + tax(50000));
        System.out.println("The tax on $27500 is " + tax(27500));
        System.out.println("The tax on $6000 is " + tax(6000));
        System.out.println("The tax on $120000 is " + tax(120000));
    }

    public static Double tax(int salaryIn) {
        Double salary = new Double(salaryIn);

        if (salary < 7150.0) {
            return salary * 0.1;
        }
        if (salary < 29050.0) {
            return 715.0 + (salary - 7150.0) * 0.15;
        }
        if (salary < 70350.0) {
            return 4000.0 + (salary - 29050.0) * 0.25;
        }
        return 14325.0 + (salary - 70350.0) * 0.28;
    }
}



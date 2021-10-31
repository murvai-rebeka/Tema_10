public class Main {
    public static void main(String args[]) {
        int sumresult = Calculator.sum(1, 3);
        System.out.println("a=b=" + sumresult);
        int substractresult = Calculator.substract(8, 2);
        System.out.println("a-b=" + substractresult);
        int multiplicationresult = Calculator.multiplication(8, 2);
        System.out.println("a*b=" + multiplicationresult);
        double divideresult = Calculator.divide(8, 3);
        System.out.println("a/b=" + divideresult);
        double avgresult = Calculator.avg(8, 3, 4);
        System.out.println("average(a,b,c)=" + avgresult);
        double modulusresult = Calculator.modulus(8, 3);
        System.out.println("a%b=" + modulusresult);
        double celsiusresult = Calculator.convertCelsiusFromFahrenheit(150);
        System.out.println("celsius=" + celsiusresult);
        double meterresult = Calculator.convertMeterFromInch(789);
        System.out.println("meter from inch=" + meterresult);
        Calculator.calculateSpeed(3000, 1, 10, 30);
        Printer.printJava();
        Printer.printFace();
        Printer.printMyName();

    }
}

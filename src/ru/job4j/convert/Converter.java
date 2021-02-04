package ru.job4j.convert;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        int dollarIn = 120;
        int dollarExp = 2;
        int dollarOut = Converter.rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExp == dollarOut;
        System.out.println("120 rubles are 2 dollars. Test result : " + dollarPassed);
    }
}

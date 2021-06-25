package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int in = 560;
        int expectedEuro = 8;
        int expectedDollar = 9;
        boolean passed = Converter.rubleToEuro(in) == expectedEuro;
        System.out.println("560 rubles are 8. Test result : " + passed);

        passed = Converter.rubleToDollar(in) == expectedDollar;
        System.out.println("560 rubles are 9. Test result : " + passed);
    }
}

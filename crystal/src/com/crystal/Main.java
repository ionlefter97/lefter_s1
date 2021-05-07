package com.crystal;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        //============ Exercise 1 ============
        System.out.println("============ Exercise 1 ============");
        ParticularClass pc1 = new ParticularClass();
        ParticularClass pc2 = new ParticularClass();
        System.out.println("ParticularClass.testNumber = " + ParticularClass.testNumber + ", pc1.testNumber = " + pc1.testNumber + ", pc2.testNumber = " + pc2.testNumber);

        ParticularClass.testNumber = 24;
        System.out.println("\n<<<<< Don't matter how many object of ParticularClass is created, the static field of testNumber access the same memory");
        System.out.println("ParticularClass.testNumber = " + ParticularClass.testNumber + ", pc1.testNumber = " + pc1.testNumber + ", pc2.testNumber = " + pc2.testNumber);

        //============ Exercise 2 ============
        System.out.println("\n\n============ Exercise 2 ============");
        NonInitializationVariable nonInitializationVariable = new NonInitializationVariable();
        System.out.println("<<<<< Java performs default initialization");
        System.out.println("Initialization of int: " + nonInitializationVariable.number);
        System.out.println("Initialization of char: " + nonInitializationVariable.chracter);

        //============ Exercise 3 ============
        System.out.println("\n\n============ Exercise 3 ============");
        DateClass dateClass = new DateClass();
        System.out.println(dateClass.getTime(3680));

        //============ Exercise 4 ============
        System.out.println("\n\n============ Exercise 4 ============");
        CalculateSqauresAndCubes calculateSqauresAndCubes = new CalculateSqauresAndCubes();
        calculateSqauresAndCubes.displaySqauresAndCubes(10);

        //============ Exercise 5 ============
        System.out.println("\n\n============ Exercise 5 ============");

        int x = 10;
        int y = 5;
        System.out.println("x = " + x + " y = " + y);

        int aux = x;
        x = y;
        y = aux;
        System.out.println("x = " + x + " y = " + y);

        //============ Exercise 6 ============
        System.out.println("\n\n============ Exercise 6 ============\n");
        System.out.println(" *********     ***       *        *      ");
        System.out.println(" *       *   *     *    ***      * *     ");
        System.out.println(" *       *  *       *  *****    *   *    ");
        System.out.println(" *       *  *       *    *     *     *   ");
        System.out.println(" *       *  *       *    *    *       *  ");
        System.out.println(" *       *  *       *    *     *     *   ");
        System.out.println(" *       *  *       *    *      *   *    ");
        System.out.println(" *       *   *     *     *       * *     ");
        System.out.println(" *********     ***       *        *      ");

        //============ Exercise 7 ============
        System.out.println("\n\n============ Exercise 7 ============\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for x1:");
        double x1 = scanner.nextDouble();

        System.out.println("Enter a number for x2:");
        double x2 = scanner.nextDouble();

        System.out.println("Enter a number for x3:");
        double x3 = scanner.nextDouble();

        CalculateStatistical calculateStatistical = new CalculateStatistical();

        System.out.println("\nMean: " + calculateStatistical.calculateMean(x1, x2, x3));
        System.out.println("Variance: " + calculateStatistical.calculateVariance(x1, x2, x3));
        System.out.println("Standard deviation: " + calculateStatistical.calculateStandartDeviation(x1, x2, x3));

        //============ Exercise 8 ============
        System.out.println("\n\n============ Exercise 8 ============\n");
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println(primeNumbers.getPrimeNumbers(100));


        //============ Exercise 9 ============
        System.out.println("\n\n============ Exercise 9 ============\n");
        VampireNumbers vampireNumbers = new VampireNumbers();
        Set<Integer> set = new TreeSet<Integer>(vampireNumbers.getVampireNumbers());
        System.out.println(set);


    }

}





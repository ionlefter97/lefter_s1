package com.crystal;

public class CalculateStatistical {

public double calculateMean(double x1, double x2, double x3){
    double mean = (x1 + x2 + x3)/3;
    return mean;
}

public double calculateVariance(double x1, double x2, double x3){

    double mean = calculateMean(x1, x2, x3);
    double variance = (Math.pow(x1-mean, 2) + Math.pow(x2-mean, 2) + Math.pow(x3-mean, 2))/3;
    return variance;
}

public double calculateStandartDeviation(double x1, double x2, double x3){
    double standartDeviation = Math.sqrt(calculateVariance(x1, x2, x3));
    return standartDeviation;
}

}

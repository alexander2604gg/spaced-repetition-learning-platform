package com.alexandersaul.project.models;

import java.util.List;

public class FSRSAlgorithm {

    private final List<Double> listOfOptions = List.of(0.5, 0.75, 1., 1.25, 1.5);


    public double updateDifficultFactor(int option, double difficultFactor) {
        return listOfOptions.get(option - 1) * difficultFactor;
    }

    public double forgettingProbability(double actualInterval, double difficultFactor) {
        double forgettingRate = 0.5;
        ;
        return (Math.pow(Math.E, -forgettingRate * actualInterval / difficultFactor));
    }

    public double nextReviewInterval(double actualInterval, double difficultFactor) {
        double adjustmentFactor = 0.5;
        return actualInterval * (1 + adjustmentFactor * (1 - forgettingProbability(actualInterval, difficultFactor)));
    }


    public static void main(String[] args) {

        List<Integer> options = List.of(1,3,2,2,1,1,1,2,1,2);
        FSRSAlgorithm fsrs = new FSRSAlgorithm();
        double difficultFactor = 1.;
        double actualInterval = 1;

        for (Integer option : options){

            System.out.println("---NUEVA ITERACION---");

            difficultFactor = fsrs.updateDifficultFactor(option,difficultFactor);
            actualInterval = fsrs.nextReviewInterval(actualInterval,difficultFactor);

            System.out.println("difficult factor: " + difficultFactor);
            System.out.println("actual interval: " + actualInterval);
        }


    }
}

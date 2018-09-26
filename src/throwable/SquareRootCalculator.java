package throwable;

import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        SquareRootCalculator squareRootCalculator = new SquareRootCalculator();
        try {
            double number = Double.parseDouble("ser");
            squareRootCalculator.checkIfNotMinus(number);
        } catch (NumberFormatException r) {
            r.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private double checkIfNotMinus(double number){
        if(number>=0){
            return Math.sqrt(number);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


}

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine();
        String[] operationtemp = operation.split(" ");
        if(operationtemp.length == 3) {
            if (hasRim(operationtemp[0]) && hasRim(operationtemp[2])) {
                System.out.println(countingRim(operationtemp));
            } else if ((!hasRim(operationtemp[0]) && hasRim(operationtemp[2])) || (hasRim(operationtemp[0]) && !hasRim(operationtemp[2]))) {
                throw new RuntimeException();
            } else {
                System.out.println(accomplishmentCounting(operationtemp[1], Integer.parseInt(operationtemp[0]), Integer.parseInt(operationtemp[2])));
            }
        } else {
            throw new RuntimeException();
        }
    }

    private static int countingRim(String[] operation){
        int a = 0;
        int b = 0;
        for(RimNumber r : RimNumber.getRimNumbers()){
            if(r.getRimnumber().equals(operation[0])){
                a = r.getNumber();
            }
            if(r.getRimnumber().equals(operation[2])){
                b = r.getNumber();
            }
        }
        //operand
        String operand = operation[1];
        return accomplishmentCounting(operand,a,b);
    }

    private static int accomplishmentCounting(String operand,int a,int b){
        return switch (operand) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
    private static boolean hasRim(String temp){
     for(RimNumber r : RimNumber.getRimNumbers()){
         if(r.getRimnumber().equals(temp)){
             return true;
         }
     }
     return false;
    }
}
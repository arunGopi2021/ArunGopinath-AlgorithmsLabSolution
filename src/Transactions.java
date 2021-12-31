
import java.util.Scanner;

public class Transactions {

    public static void main(String[] args) {
        
        // Solution to the lab question number 1.

       
        // get the size of the Transaction Array from  the user
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the size of the transaction array: ");
        int sizeOfTransactionArray = scObj.nextInt();
        int[] arrTransaction = new int[sizeOfTransactionArray];


        
        // get the values of the Transaction Array
        System.out.println("Enter the values of the transaction array: ");
        for(int i=0;i<sizeOfTransactionArray;i++){
            arrTransaction[i] = scObj.nextInt();
        }

        
        // get the number of targets
        System.out.print("Enter the total number of targets, that needs to be achieved: ");
        int numTargets = scObj.nextInt();

       
       
        // Creating and initializing helper variables
        int sum=0;
        int targetVal;   

        // get the target values and check if target is achieved
        for(int i=0; i<numTargets;i++){
            System.out.print("Enter the value of the target: ");
            targetVal = scObj.nextInt();
            for(int j=0;j<arrTransaction.length;j++){

                sum = sum + arrTransaction[j];

                if(sum>=targetVal){
                    System.out.println("The target was achieved after "+(j+1)+" transactions.");
                    sum=0;
                    break;
                }else if(j==arrTransaction.length-1){
                    System.out.println("Given target was not achieved.");
                    sum=0;
                }//if-else-if block

                
            }//inner for
        }//outer for
        scObj.close();

        
    }//end of main method 
}

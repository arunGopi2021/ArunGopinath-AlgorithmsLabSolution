
import java.util.Scanner;


public class MinimumNotes {
    public static void main(String[] args) {

        // Solution to the lab question number 2.
        
        //get the number of different currency denominations
        Scanner scObj1 = new Scanner(System.in);
        System.out.print("Enter the number of different currency denominations:  ");
        int numOfCurrDenominations = scObj1.nextInt();



        //get the currency denominations value
        int[] currArray = new int[numOfCurrDenominations];
        System.out.println("Enter the value of each currency denomination:  ");
        for(int i=0;i<numOfCurrDenominations;i++){
            currArray[i] = scObj1.nextInt();
        }


        /*  Next, we sort the "currArray" in descending order
            Since this "currArray" is going to be a small array,
            I am using the bubble sort algorithm.
        */

        
        //bubble sort
        int smallTmp;
        for(int i=0;i<=currArray.length-2;i++){
            for(int j=0; j<=currArray.length-2-i;j++){
                if(currArray[j]<currArray[j+1]){
                    smallTmp = currArray[j];
                    currArray[j] = currArray[j+1];
                    currArray[j+1] = smallTmp;
                }
            }//inner for
        }//outer for


        // display the sorted array
        // for(int i=0;i<currArray.length;i++){
        //     System.out.print(currArray[i]+" ");
        // }


        //enter the value to pay
        System.out.print("Enter the amount to pay:  ");
        int payableAmt = scObj1.nextInt();
        


        //the code to pick the notes        
        int[] notes =new int[currArray.length];
        boolean isPossibleToPay = false;


        for(int i=0;i<currArray.length;i++){
            notes[i] = payableAmt/currArray[i];
            payableAmt = payableAmt % currArray[i];           
            if(payableAmt==0){
                isPossibleToPay=true;
            }//if-block
        }//for loop




        if(isPossibleToPay){
            System.out.println("Your payment approach, in order to give the minimum notes will be: ");
            for(int i=0;i<currArray.length;i++){
                if(notes[i]!=0){
                    System.out.println(currArray[i]+": "+notes[i]);
                }//inner-if block
                
            }//Outer If block's for loop
            
        }else{
            System.out.println("Not possible to pay in available denominations");
        }//if-else block


        scObj1.close();
    }//end of main method
}

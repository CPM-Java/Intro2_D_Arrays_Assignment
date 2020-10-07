
/**
 * Introduction to 2-D Arrays
 * DO NOT MODIFY
 * 
 * @author gk CPM
 * @version 1/5/17, 12/18/18
 */

import java.util.Random;

public class Two_D_ArrayCreator
{
    private Random rand = new Random();
    
    //An empty array of integers (defaulted to zeros)
    //with 4 rows and 7 columns (28 total elements)
    private int[][]  myRand2Darray = new int[4][7];
    
    //2-D Arrays can be filled with an initialization table
    private int[][] myPreMade2Darray = {{ 33, 32, 31, 30, 29},
                                        { 23, 22, 21, 20, 19},
                                        { 13, 12, 11, 10, 49}};

    /**
     * Constructor for objects of class Two_D_ArrayDemo
     */
    public Two_D_ArrayCreator()
    {
        // fill the myRand2Darray with 3-digit random numbers
        for(int row = 0; row < myRand2Darray.length; row++)
            for(int col = 0; col < myRand2Darray[row].length; col++) 
                myRand2Darray[row][col] = 100 + rand.nextInt(900);
                
        //Notice: myRand2Darray.length is the number of ROWs in the array
        //        myRand2Darray[row].length is the number of COLUMNs in the array
    }
    
    /**
     * Driver
     */
    public void findStats_display()
    {
        // what is this line doing?                                
        Two_D_ArrayCalculator calc2D = new Two_D_ArrayCalculator(myPreMade2Darray);
       
        //use object to find sum and mean
        int sum = calc2D.findSum();
        double mean = calc2D.findMean();
       
        //display
        System.out.println(calc2D); //what is this line doing?
        System.out.println("The sum of the pre-made 2-D array values = " + sum);
        System.out.println("The mean of the pre-made 2-D array values = " + mean + "\n\n");
        
        //what is happening here?
        calc2D.set2Darray(myRand2Darray);
        
        
        sum = calc2D.findSum();
        mean = calc2D.findMean();
        
        
        System.out.println(calc2D);
        System.out.println("The sum of the random 2-D array values = " + sum);
        System.out.println("The mean of the random 2-D array values = " + mean + "\n\n");
        
    }

}

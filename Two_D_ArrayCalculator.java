
/**
 * Finds the sum and mean of the integers contained 
 * in an instance 2-D array
 * 
 * @author GK CPM 2017
 * @version mods 12/3/17, 12/17/18
 */
public class Two_D_ArrayCalculator
{
    //instance 2-D array of integers
    private int[][] my2DintArray;
    
    /**
     * Constructor
     * 
     * @param  array   a 2-D array of integers
     */
    public Two_D_ArrayCalculator(int[][] array )
    {
        my2DintArray = array;
    }
    
    /**
     * Mutator method for the instance 2-D array
     * 
     * @param  array   a 2-D array of integers
     */
    public void set2Darray(int[][] array )
    {
        my2DintArray = array;
    }
    
    /**
     * Accessor method for the instance 2-D array
     * 
     * @return  the instance 2-D array of integers
     */
    public int[][] get2Darray()
    {
        return my2DintArray;
    }

    /**
     * finds the sum of the values in a 2-D my2DintArray of integers
     * 
     * @return     the sum of all integers in the my2DintArray 
     */
    public int findSum()
    {
        //provide the implementation here
        return 0;
    }
    
    /**
     * finds the average of values in a 2-D my2DintArray of integers
     * 
     * @return     the mean of all integers in the my2DintArray 
     */
    public double findMean()
    {
        //provide the implementation here
        return 0.0;
    }
    
    
    /**
     * toString
     * 
     * @return     a String representation of array contents 
     */
    public String toString()
    {
        String arrayStr = "";
        
        for(int row = 0; row < my2DintArray.length; row++)
        {
            for(int col = 0; col < my2DintArray[row].length; col++) 
            {
                arrayStr += my2DintArray[row][col] + "\t"; //a tab to make it pretty
            }
            arrayStr += "\n"; //next row
        }
        
        return "The 2-D Array of integers contains:\n" + arrayStr;
    }
}

public class Searching {
    
    public static void main(String[] args) 
    {
        //for loop for quiz 
        for (int i = 300; i<=5000; i+= 50 )
            System.out.println(i); 

        double[] numbers = {10.0, 7.5, 5.1, 20, 17, 3};
        System.out.println( SequentialSearch(numbers, 5) );//EXPECT -1 - not found
        System.out.println( SequentialSearch(numbers, 7.5) );//EXPECT 1 - second element


        double[] numbers2 = {3, 8, 25, 26, 32, 50, 67, 75, 81};
        System.out.println(BinarySearch(numbers2, 55 )); //expect -1 not found 
        System.out.println(BinarySearch(numbers2, 75)); //expect 7 for element at index 7
    }

    //returns
    //- the index of key inside the arr if found
    //- -1 if not found
    public static int BinarySearch(double[] arr, double key ) 
    {
        int start = 0;
        int end = arr.length-1; //8 in our example

        while(start <= end)
        {
            int mid = (start+end)/2; //find middle index
            if(arr[mid] == key)

                //success, found it 
                return mid;

            else if (key > arr[mid]) //key is larger than mid value
            {
                start = mid + 1;
            }
            else 
            {
                end = mid - 1;
            }    
        }   
        //you only get here when start > end
        //this means that key is not inside arr 
        return -1;
    }

    //key is being searched inside array and the index is returned (if found, -1 otherwise)
    public static int SequentialSearch(double[] arr, double key)
    {
        //traverse the array
        //for initial, how long, update
        for(int i = 0; i< arr.length; i++ )
        {
            //check if element at position i is the ssame as the key
            if(arr[i] == key)
            {
                return i;
            }
            
        }            
    // you only get here if key was not found
    return -1;
    }
}
public class InsertionSort {
    //creating a method to sort an array.
    public static void insertionSort(int []arr){
        for(int i=1; i<arr.length; i++){     //I am assuming that my first element is already sorted so I am starting from second index
            int currentElement = arr[i];     //created an integer which holds the values of index next or my sorted element
            int j= i-1;                      //this is indicating the index of my sorted element
          //loop runs backwards until it reaches 0 index and element of jth index is grater than current element
            while(j>=0 && arr[j]>currentElement){
                //now storing the jth element in the j+1th index
                arr[j+1]=arr[j];
                //and decrementing the same thing backwards
                j--;
                //loop ends
            }
            //and the current element will be stored in j+1th column
            arr[j+1]= currentElement;
        }
    }
    //Now creating a method to print the array
    public static void printArr(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //confirming the algorithm
    public static void main(String[] args) {
        int arr[]= {2,3,1,39,20,10,33};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);


    }
}

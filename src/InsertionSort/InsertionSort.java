package InsertionSort;

import java.util.Scanner;

public class InsertionSort {
	
	Scanner menu = new Scanner (System.in);
	
	public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public void decrescente (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public void loopInvariant (int arr[]) {
    	System.out.print("Num : ");
		int num = menu.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= arr.length; i++) { 
			if ( (sum += i) == num ) {
				System.out.print(num); 
			}
				
		}
		
    }
    


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }

}

package LoopInvariante;

import InsertionSort.InsertionSort;

public class Main {
	
	public int  Main () {
		int n = 10;
		int sum = 0;
		int v = 7; 
		for (int i = 1; i <= n; i++) {
			if ( (sum += i) == v )
				return v;
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main a = new Main();
		System.out.print(a.Main()); 
	}

}

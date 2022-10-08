package InsertionSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 31, 41, 59, 26, 41, 58 };
		  
        InsertionSort ob = new InsertionSort();
        // Usando o algoritmo apresentado, ilustre a operação de Insertion-Sort no arranjo A = <31, 41, 59, 26, 41, 58>.
        ob.sort(arr);
        
        // Reescreva o procedimento Insertion-Sort para ordenar em ordem não crescente, em vez da ordem não decrescente.
        ob.decrescente(arr);
        
        ob.printArray(arr);
        
        // Loop invariante
        ob.loopInvariant(arr);

	}

}

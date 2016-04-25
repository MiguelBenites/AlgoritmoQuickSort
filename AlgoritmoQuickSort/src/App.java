

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lista[];
		
		lista = new int[6];
		
		lista[0] = 5;
		lista[1] = 2;
		lista[2] = 4;
		lista[3] = 6;
		lista[4] = 1;
		lista[5] = 3;
		
		QuickSort quick = new QuickSort();
		
		quick.ordenar(lista);
		
		for(int i : lista){
			System.out.println(i);
			System.out.println("");
		}
		

	}


}













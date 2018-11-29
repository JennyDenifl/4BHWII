package uebung;

public class PascalDreieck {

	public static int pd(int i, int j){
		
		if(i == 0 && j == j){
			return 1;
		}
		
		return pd(i-1, j-1) + pd(i-1, j);
	}
	
	
	public static void main(String[] args) {
		System.out.println(pd(50,8));
	}

}

//s =4,6

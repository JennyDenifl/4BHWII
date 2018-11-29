package uebung;

public class Fibonacci_Endrekusion {

	public static int fib(int n, int i1, int i2, int c){
		//System.out.println(n);
		if(c == n){
			return i1 + i2;
		}
		
		return fib(n, i2, i1+i2, ++c);
	}
	
	
	public static void main(String[] args) {
		System.out.println(fib(17,1, 0, 1));
	}

}

package uebung;

public class Facultaet {
	
	 public static int faculity(int n){
		  if(n==1){
		  return 1;
		  }
		  return n * faculity( n-1);
		  }
	
	public static void main(String[] args) {
		
		
		System.out.println(faculity(5));
	}
}

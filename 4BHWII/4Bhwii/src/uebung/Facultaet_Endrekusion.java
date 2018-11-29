package uebung;

public class Facultaet_Endrekusion {
	
	 public static int faculity(int n, int i){
		  if(n==1){
			  return i;
		  }
		  
		  return faculity(n-1,i*n);
		
	 }
	
	public static void main(String[] args) {
		System.out.println(faculity(5,1));
	}

}

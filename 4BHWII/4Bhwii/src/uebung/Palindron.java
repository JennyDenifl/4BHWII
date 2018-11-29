//Anna, Annna, Otto
package uebung;

public class Palindron {
	
	public static boolean isPaletron(String s)
	{	
		int z1 = s.charAt(0);
		int zn = s.charAt(s.length()-1);
		
		if( s.length() == 1 || s.length() == 2){
			return true;
		}
		if(z1 != zn){
			return false;
		}

		if(z1 == zn){	
		}
		return isPaletron(s.substring(1, s.length()-2));
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPaletron("anna"));
	}
}

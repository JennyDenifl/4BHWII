package uebung;

public class Uebung1 { 

    public int[] intAr = {5, 6, 8, 10, 9, 3}; 

    public int[] sort() { 
        int z; 
        for (int i = 0; i < intAr.length - 1; i++) { 
            if (intAr[i] < intAr[i + 1]) { 
            	continue;
            } 
            z = intAr[i]; 
            intAr[i] = intAr[i + 1]; 
            intAr[i + 1] = z; 
            sort(); 
        } 
        return intAr; 
    } 

    public static void main(String[] args) { 
        Uebung1 s = new Uebung1(); 
        int[] arr = s.sort(); 
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(arr[i]); 
        } 
    } 
} 

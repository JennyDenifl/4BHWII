package uebung;

public class Uebung2 { 

    public int[] intAr = { 5, 6, 8, 10, 9, 3 }; 

    public int[] sort() { 
        int z; 
        for (int i = 0; i < intAr.length; i++) { 
            for (int j = intAr.length-1; j > 0; j--) { 
                if (intAr[j-1] > intAr[j]) { 
                    z = intAr[j]; 
                    intAr[j] = intAr[j - 1]; 
                    intAr[j - 1] = z; 
                } 
            } 
        } 
        return intAr; 
    } 

    public static void main(String[] args) { 
        Uebung2 s = new Uebung2(); 
        int[] arr = s.sort(); 
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(arr[i]); 
        } 
    } 
} 
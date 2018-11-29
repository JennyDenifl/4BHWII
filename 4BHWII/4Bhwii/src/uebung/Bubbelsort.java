package uebung;

import java.util.ArrayList;

public class Bubbelsort {
	
	private static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> sortByName(int[] input) {
        int temp;
        for (int i=0; i< input.length; i++){
            for(int j= i; j< input.length-1; j++){
                int first = input[i];
                int sec = input[j +1];
                 if (first > sec)  {
                     temp = input[j +1];
                     input[j +1] = input[i];        
                     input[i] = temp;
                 }
             }
            list.add(input[i]);
         }

        return list;
    }

    public static void main(String[] args) {
        int[] i =  {5,3,3,9,0,6,1,9};
        System.out.println(sortByName(i)); 
    }
}

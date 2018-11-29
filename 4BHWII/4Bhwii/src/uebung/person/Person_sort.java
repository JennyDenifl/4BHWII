package uebung.person;

import java.util.ArrayList;

public class Person_sort {
	private static ArrayList<String> list = new ArrayList<String>();

    public static ArrayList<String> sortByName(String[] input) {
        String temp;
        for (int i=0; i< input.length; i++){
            for(int j= i; j< input.length-1; j++){
                char first = input[i].charAt(0);
                char sec = input[j +1].charAt(0);
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
        String string[] =  {"Hermut", "Lanz","Lecha","Zoblin"};
        System.out.println(sortByName(string)); 
    }
}

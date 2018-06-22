package com.arrays.strings;

public class StringUniqueChars {

    public static boolean checkUniqueChars(String input){

        boolean uniqueChars = true;
        for(int i=0;i<input.length();i++){
            if(input.indexOf(input.charAt(i)) != i){
                uniqueChars = false;
                break;
            }
        }
        return uniqueChars;
    }
}
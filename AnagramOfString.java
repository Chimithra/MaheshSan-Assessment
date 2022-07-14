package com.company.Pract;

import java.util.Locale;

class Anagram{
    String s1,s2;
    void anagram(String s1, String s2){
        int successCount = 0;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length(); i++){
                int count =0;
                for(int j=0; j<s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j)){
                        count ++;
                    }
                }
                if(count == 1){// listen , silent
                    successCount++;
                }
            }
            if(successCount == s1.length()){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not anagram after work");
            }
        }
        else{
            System.out.println("Not anagram");
        }
    }
}
public class AnagramOfString {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        Anagram a = new Anagram();
        a.anagram(s1, s2);
    }
}

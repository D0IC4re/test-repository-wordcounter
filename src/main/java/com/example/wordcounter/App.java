package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
        String[] arr = s.split("\\W+");
        int ans = 0;
        for (String i: arr){
            int res = 0;
            for (int j = 0; j < i.length(); j++){
                char t = i.charAt(j);
                if ( t < 65 || (t > 90 && t < 97) || t > 122){
                    res = 1;
                }
            }
            if (res == 0){
                ans++;
            }
        }
        return ans;
    }
}

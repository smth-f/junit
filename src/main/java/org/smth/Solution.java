package org.smth;

public class Solution {
    public static void main(String[] args) {
        Solution myObject = new Solution();
        System.out.println("#1");
        System.out.println(myObject.findNextPerfectSquare(121));
        System.out.println("#2");
        System.out.println(myObject.findShort("Hallo weee"));
        System.out.println("#3");
        System.out.println(myObject.persistence(-992));
    }
    //findNextPerfectSquare
    //You might know some pretty large perfect squares. But what about the NEXT one?
    //Complete the findNextPerfectSquare method that finds the next integral perfect square
    // after the one passed as a parameter. Recall that an integral perfect
    // square is an integer n such that sqrt(n) is also an integer.
    public long findNextPerfectSquare(double sq){
        double sqrt = Math.sqrt(sq);
        if (sqrt == (int) sqrt){
            sqrt++;
            sqrt = Math.pow(sqrt,2);
            //если переменная sq не является "идеальным" корнем, то вернём -1
        } else {
            return -1;
        }
        return (long)sqrt;
    }

    //Shortest Word
    //Simple, given a string of words, return the length of the shortest word(s).
    //String will never be empty and you do not need to account for different data types.
    public int findShort(String s) {
        int minLength;
        if (s == null || s.isEmpty() || s.equals(" ")){
            minLength = 0;
            return minLength;
        }
        String[] arr = s.split(" ");
        minLength = arr[0].length();

        for (int i = 0; i < arr.length; i++) {
            if (minLength>arr[i].length()){
                minLength=arr[i].length();
            }
        }
        return minLength;
    }

    //Write a function, persistence, that takes in a positive parameter num and returns
    // its multiplicative persistence, which is the number of times you must multiply
    // the digits in num until you reach a single digit.
    public int persistence(int a) {
        String str = String.valueOf(a);

        while (str.length() > 1) {
            int res = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-'){
                    continue;
                }
                int digit = Character.getNumericValue(str.charAt(i));
                if (i == 1 && str.charAt(0) == '-'){
                    digit*=-1;
                }
                res *= digit;
            }
            str = String.valueOf(res);
            if (str.length() == 2 && str.charAt(0) == '-'){
                break;
            }
        }
        return Integer.parseInt(str);
    }
}
package org.example;

import java.util.ArrayList;

public class Main {
    // palindrom sayı bulan method
    static boolean isPalindrome(int a){
        boolean isPalindrome;
        System.out.println("BU SAYI PALİNDROME MU?");
        ArrayList<Integer> sayilar = new ArrayList<>();
        int b = 0;
        int c = a;
        for (int i=a; i>0; i--){
            sayilar.add(a%10);
            a /= 10;
            if (a == 0){
                break;
            }
        }
        a = c;
        int size = sayilar.size();
        for (int i=0; i< sayilar.size(); i++){
            b += (int) (sayilar.get(i)*Math.pow(10, size-1));
            size--;
        }
        if (b == a){
            isPalindrome = true;
            System.out.println(a + " => bu sayı palindromedur...");
        }
        else{
            isPalindrome = false;
            System.out.println(a + " => bu sayı palindrome değildir.");
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        isPalindrome(265);
        isPalindrome(999);
        isPalindrome(181);
        isPalindrome(654);



    }
}
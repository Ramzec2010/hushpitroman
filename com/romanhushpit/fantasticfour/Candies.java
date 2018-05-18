package com.romanhushpit.fantasticfour;

public class Candies {
    public static void main(String[] args) {
        int w = calcCandies(10,25,15,40);
        System.out.println(w);
    }
    public static int calcCandies (int x, int y, int z, int w) {
        int numbOfGift = 0;
        int summ = 0;
        for (int i = 0; i<=w; i = i + y) {
            for (int j = 0; j<=w; j = j + z) {
                for (int k = 0; k <=w; k = k + x){
                    summ = i + j + k;
                    if (summ == w)
                        numbOfGift++;
                }
            }
        }
        return numbOfGift;
    }

}

package com.romanhushpit.fantasticfour;

public class SecretaryJenifer {
    public static void main(String[] args) {
        int sec = timePrinter(1,2,5);
        System.out.println(sec);
    }

    static int timePrinter (int x, int y, int N) {
        int max, min;
        int comparison = 0;
        int numOfCurCopies = 0;
        int summTime = 0;
        if (x > y) {max = x; min = y;}
        else {max = y; min = x;}
        int timeForOneCopy = min;
        N = N - 1;
        for (int i = 0; i < N; i++) {
            summTime = summTime + min;
            comparison = comparison + min;
            numOfCurCopies++;
            if (numOfCurCopies >= N) break;
            if (comparison >= max){
                comparison = 0;
                numOfCurCopies++;
            }
            if (numOfCurCopies >= N) break;
        }
        summTime = summTime + timeForOneCopy;
        return summTime;
    }
}

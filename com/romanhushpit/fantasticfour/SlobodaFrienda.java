package com.romanhushpit.fantasticfour;

import java.util.HashSet;

public class SlobodaFrienda {
    public static void main(String[] args) {
        int [] [] list = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 1}, {0, 0, 0, 0, 1}, {0, 0, 1, 1, 0}};
        int num = numOfFriends(5,2, list);
        //int [] [] list = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        //int num = numOfFriends(3,1, list);
        System.out.println(num);
    }

    static int numOfFriends (int N, int S, int[][] list) {
        int numbOfFriends = 0;
        S = S-1;
        HashSet<Integer> tranzit = new HashSet<Integer>();
        for (int i = 0; i <list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] == 1 && (i == S || j == S)) {
                        tranzit.add(i);
                        tranzit.add(j);
                }
            }
        }
        for (int i = 0; i <list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                for (int element : tranzit) {
                    if ((list[i][j] == 1 &&i == element) || (list[i][j] == 1 && j == element)){
                        numbOfFriends++;
                        break;
                    }
                }
            }
        }

        return numbOfFriends - 1;
    }
}

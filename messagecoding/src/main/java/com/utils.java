package com;

import java.util.List;
import java.util.Random;

public class utils {
    private Random random = new Random();

    public static int inversion(int bit) {
        return Math.abs(bit-1);
    }

    public static int rand(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static int XOR(List<Integer> massive, int n) {
        int bit = massive.get(0);
        for (int i = 1; i < n; i++) {
            bit = bit ^ massive.get(i);
        }
        return bit;
    }

    public static int charToBin(char binChar) {
        if (binChar == '0') {
            return 0;
        }
        if (binChar == '1') {
            return 1;
        }
        return 2;
    }

    public static int[] binary(int n) {
        int[] massive = new int[3];
        int b;
        for (int i = 2; n != 0; i--) {
            b = n % 2;
            massive[i] = b;
            n = n / 2;
        }
        return massive;
    }

    public static int oneCount(List<Integer> massive) {
        int count = 0;
        for (int i = 0; i < 4;i++) {
            if (massive.get(i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSame(int[] message, int[] check) {
        int countSame = 0;
        for (int i = 0; i < 3; i++) {
            if (message[i] == check[i]) {
                countSame++;
            }
        }
        return countSame == 3;
    }
}


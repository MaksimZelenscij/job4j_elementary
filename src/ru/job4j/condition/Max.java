package ru.job4j.condition;

public class Max {
    public static int getMax(int left, int right) {
        int max = left > right ? left : right;
        return max;
    }
}

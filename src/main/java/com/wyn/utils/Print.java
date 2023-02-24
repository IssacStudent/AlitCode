package com.wyn.utils;

import java.util.List;

public class Print {
    public static <T> void printList(List<T> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printList(int[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i != list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printList(int[][] list) {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            printList(list[i]);
            if (i != list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

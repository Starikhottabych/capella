package com.hillel.task09;

import java.util.Scanner;

public class MultiplyOddElementsOfArray {
  public static void main(String[] args) {
    System.out.println("9. Определите произведение всех нечетных элементов массива");

    int[] array = ArrayInit();

    System.out.println(ArrayToString(array));

    System.out.println("Произведение всех нечетных элементов массива: " + MultiplyOddElements(array));
  }

  private static int MultiplyOddElements(int[] array) {
    int result = 1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        result *= array[i];
      }
    }
    return result;
  }

  private static String ArrayToString(int[] array) {
    String str = "";
    for(int i : array) {
      str += i + " ";
    }
    return str;
  }

  private static int[] ArrayInit() {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Введите кол-во элементов массива N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }
}

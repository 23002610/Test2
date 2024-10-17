/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearch1;

/**
 *
 * @author muran
 */import java.util.Scanner;


   

public class BinarySearch {

    public static void main(String[] args) {
        Scanner ID = new Scanner(System.in);

        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};

        System.out.print("Enter the product ID: ");
        int targetID = ID.nextInt();

        int index = findProduct(productIDs, targetID);

        if (index != -1) {
            System.out.println("Product is found at index: " + index);
        } else {
            System.out.println("The Product you are looking for is  not found.");
        }

        ID.close();
    }

    public static int findProduct(int[] productIDs, int targetID) {
        int left = 0;
        int right = productIDs.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

            if (productIDs[left] <= productIDs[mid]) {
                if (targetID >= productIDs[left] && targetID < productIDs[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (targetID > productIDs[mid] && targetID <= productIDs[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
}

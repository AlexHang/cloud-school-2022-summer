package Lectia3;

import java.util.Scanner;

public class ExercitiuOptionalMatrix {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int n;
    	 do {
    	   n = sc.nextInt();
    	 } while(n > 10);
    	 
    	 int[][] matrix1 = new int[n][n];
    	 int[][] matrix2 = new int[n][n];
    	 
    	 for(int i = 0; i < n; i++) {
    		 for(int j = 0; j < n; j++) {
    			 matrix1[i][j] = sc.nextInt();
    			 
    		 }
    	 }
    	 
    	 for(int i = 0; i < n; i++) {
    		 for(int j = 0; j < n; j++) {
    			 matrix2[i][j] = sc.nextInt();
    
    		 }
    	 }
    	 
    	 int[][] sumMatrix = new int[n][n];
    	 int[][] productMatrix = new int[n][n];
    	 
    	 for(int i = 0; i < n; i++) {
    		 for(int j = 0; j < n; j++) {
    			 sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
    		 }
    	 }
    	 
    	 for(int i = 0; i < n; i++) {
    		 for(int j = 0; j < n; j++) {
    			 for(int k = 0; k < n; k++) {
    				 productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
    			 }
    		 }
    	 }
    	 
    	System.out.println("Sum:");
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			System.out.print(sumMatrix[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    	System.out.println("Product:");
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			System.out.print(productMatrix[i][j] + " ");
    		}
    		System.out.println();
    	}
     }
}

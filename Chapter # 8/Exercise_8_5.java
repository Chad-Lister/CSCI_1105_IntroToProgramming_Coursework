/*
Author: Chad Lister
Date:  03/06/2020

This program adds 2 matrices together that have the same dimensions and element types as per instructions of Exercise 8 - 5.  Uses the following method header:

	public static double[][] addMatrix(double[][] a, double[][] b)
	
	Example:

	1.0   2.0   3.0      0.0  2.0  4.0         1.0  4.0  7.0
	4.0   5.0   6.0   +  1.0  4.5  2.2    =    5.0  9.5  8.2
	7.0   8.0   9.0      1.1  4.3  5.2         8.1  12.3  14.2	
*/

import java.util.*;

class Exercise_8_5 {
	public static void main(String[] args) {
		
		double [][] matrixA = {
			{1.0, 2.0, 3.0},
			{4.0, 5.0, 6.0},
			{7.0, 8.0, 9.0},
		};
		
		double [][] matrixB = {
			{0.0, 2.0, 4.0},
			{1.0, 4.5, 2.2},
			{1.1, 4.3, 5.2},
		};		
		
		System.out.println(Arrays.toString(matrixA[0]) + "   " + Arrays.toString(matrixB[0]));
		System.out.println(Arrays.toString(matrixA[1]) + " + " + Arrays.toString(matrixB[1]));
		System.out.println(Arrays.toString(matrixA[2]) + "   " + Arrays.toString(matrixB[2]));
		System.out.println();
		addMatrix(matrixA, matrixB);
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double [][] matrixC = {
			{a[0][0] + b[0][0], a[0][1] + b[0][1], a[0][2] + b[0][2]},
			{a[1][0] + b[1][0], a[1][1] + b[1][1], a[1][2] + b[1][2]},
			{a[2][0] + b[2][0], a[2][1] + b[2][1], a[2][2] + b[2][2]},
		};
		
		System.out.println("Equals:  ");
		System.out.println();
		System.out.println(Arrays.toString(matrixC[0]));
		System.out.println(Arrays.toString(matrixC[1]));
		System.out.println(Arrays.toString(matrixC[2]));
		
		return matrixC;
	}
}
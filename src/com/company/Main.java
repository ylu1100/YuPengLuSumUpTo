package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type an integer and I'll calculate the sum of all the integers up to your number.");
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	int sum = 0;
	for(int i = 0; i < x; i++){
	    sum = sum + i;
    }
    sum = sum + x;
    System.out.println("The sum from 1 to " + x + " is "+ sum);
    }
}

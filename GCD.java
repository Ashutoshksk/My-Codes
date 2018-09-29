package com.company;
import java.util.*;

public class GCD {

	public static int gcd(int[] numbers) {
		int gcd=1;
		int index=2;
		if(numbers.length==1){
			gcd=numbers[1];
		}
		if(numbers.length>1){
			gcd=eGcd(numbers[0],numbers[1]);
		}
		while(index<numbers.length){
			gcd=eGcd(gcd,numbers[index]);
			index++;
		}
		return gcd;
	}
	public static int eGcd(int num1,int num2){
		int temp=0;
		while(num2!=0){
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		num1=num1<0 ? num1 * (-1):num1;
		return num1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter the elements: ");
		//Scanner sc = new Scanner(System.in);
		for(int i=0;i<numbers.length;i++){
			numbers[i] = sc.nextInt();
			}
		System.out.println("GCD: ");
		System.out.print(gcd(numbers));
	}
}

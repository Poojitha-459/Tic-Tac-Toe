package com.tasks;

public class RangeTask {

	public static void main(String[] args) {
		System.out.println("prime numbers");
		int count = 0;
		int num = 2;
		int sum = 0;
		while (count < 5) {
			boolean isprime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
				}
			}

			if (isprime == true) {
				sum = sum + num;
				count++;
				System.out.println(num);
			}

			num++;
		}

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		System.out.println("sum is:"+sum);
	}
}

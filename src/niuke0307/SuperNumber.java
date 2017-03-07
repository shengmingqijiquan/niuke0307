package niuke0307;

import java.util.Scanner;

public class SuperNumber {
	/*
	 * 编程题1：
	 * 
	 * @题目名字：超级素数幂 如果一个数字能表示为p^q<且p为一个素数，q为大于1的正整数就称这个数叫做超级素数幂。现在给出一个正整数
	 * n，如果n是一个超级素数幂需要找对应的p和q
	 * 
	 * @输入描述：请输入一个正整数n(2<=n<=10^18)
	 * 
	 * @输出描述：如果n是一个超级素数幂则输出p和q，以空格分隔，行末无空格。 如果n不是超级素数幂，则输出No。
	 * 
	 */

	/*
	 * @param 判断素数
	 * 
	 * @param flag 判断结果，true为素数，false为非素数
	 */
	public static boolean isSu(int p) {
		boolean flag = false;
		for (int i = 2; i < p; i++) {
			if (p % i != 0) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入n值：");
		Integer i = sc.nextInt();

		double MaxValue = Math.pow(10, 18);
		double halfValue = Math.pow(i, 0.5);
		if (2 <= i && i <= MaxValue) {
			for (int p = 2; p <= halfValue; p++) {
				for (int q = 1; q <= halfValue; q++)
					if (SuperNumber.isSu(p)) {
						if (i == Math.pow(p, q)) {
							System.out.println(p + " " + q);
							break;
						}
					} else {
						System.out.println("No");
						break;
					}
			}
		}

	}

}

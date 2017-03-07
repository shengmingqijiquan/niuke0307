package niuke0307;

import java.util.Scanner;

public class SuperNumber {
	/*
	 * �����1��
	 * 
	 * @��Ŀ���֣����������� ���һ�������ܱ�ʾΪp^q<��pΪһ��������qΪ����1���������ͳ�������������������ݡ����ڸ���һ��������
	 * n�����n��һ��������������Ҫ�Ҷ�Ӧ��p��q
	 * 
	 * @����������������һ��������n(2<=n<=10^18)
	 * 
	 * @������������n��һ�����������������p��q���Կո�ָ�����ĩ�޿ո� ���n���ǳ��������ݣ������No��
	 * 
	 */

	/*
	 * @param �ж�����
	 * 
	 * @param flag �жϽ����trueΪ������falseΪ������
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
		System.out.println("������nֵ��");
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

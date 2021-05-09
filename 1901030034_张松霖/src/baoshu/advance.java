package baoshu;

import java.util.Scanner;

public class advance {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();// 人数
		int[] stu = new int[100];// 学生数组
		String s1 = "", s2 = "", s3 = "";// 123行
		for (int i = 0; i < n; i++) {
			stu[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0)
				s1 = s1 +stu[i]+" ";
				
			else if (i % 3 == 1)
				s2 += stu[i]+" ";
			else
				s3 += stu[i]+" ";
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}

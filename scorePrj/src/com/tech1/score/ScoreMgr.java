package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int scrArr[] =new int [5];
		 int sum=0;
		 double Avg=0.0;
		 
		 for (int i = 0; i < scrArr.length; i++) {
			 System.out.println("점수를 입력하세요");
			 int score=sc.nextInt();
			 scrArr[i]=score;
		 }
			 for (int i = 0; i < scrArr.length; i++) {
				 sum =sum + scrArr[i];
		}
		 Avg=sum/(double)scrArr.length;
		 System.out.println("총합 :"+sum+"\n평균:"+Avg);
	}
}

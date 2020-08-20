package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 do {
				
				System.out.println("-1누르면 종료, 계속하시려면 go");
				String goExit=sc.next();
				if (goExit.equals("-1")) {
					System.out.println("종료");
					break;
				}else if (goExit.equals("go")) {
		 
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
		 
		 if (!(sum>50 && sum<100) || !(Avg>50 && Avg<100)) {
			 System.out.println("다시입력");
		 }else {
				}
				}
		 }	while(true);
		 
		 }
	}


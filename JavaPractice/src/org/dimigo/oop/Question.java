/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_Question
 *
 *
 * 1 개요 	:
 * 2. 작성일 :  2017. 4. 3.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] questions = {"1. 가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?"};
		String [] answers = {"아이유", "아이유","응용 프로그래밍"};
		String [] str = {"가수", "배우","과목"};
		Scanner scanner = new Scanner(System.in);
		int i;
		for( i=0; i<3; i++){
			System.out.println(questions[i]);
			if(answers[i].equals(scanner.nextLine())){
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}	
			System.out.println("<<결과출력>>");
			StringBuilder sb = new StringBuilder();
			
		for(i=0; i<3; i++) {
				sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.").append("\n");
			}
			System.out.println(sb);
		}
		
		
		
		
		
		
		
		
		
	}



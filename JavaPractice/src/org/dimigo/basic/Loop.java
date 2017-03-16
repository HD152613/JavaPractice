/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_Loop
 *
 *
 * 1 개요 	:	
 * 2. 작성일 :  2017. 3. 16.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] job ={"마법사", "영주", "기사", "농민"};
		int choice;
		int atk = 100;
		do{
			System.out.println("----------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------");
			choice = scanner.nextInt();
			switch(choice){
			case 1: 
				atk += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+atk);
				break;
			case 2: 
				atk -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+atk);
				break;
			case 3: 
				int num = (new Random().nextInt(4));
				if(num == 0)System.out.printf("마법사");
				if(num == 1)System.out.printf("영주");
				if(num == 2)System.out.printf("기사");
				if(num == 3)System.out.printf("농민");
				System.out.println("(으)로 설정되었습니다.");
				break;
			case 9: 
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴 입니다!");
			}
		}while(choice != 9);

	}


}


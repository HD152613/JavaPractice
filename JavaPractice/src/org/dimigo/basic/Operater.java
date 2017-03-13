/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_Operater
 *
 *
 * 1 개요 	: 디미베
 * 2. 작성일 :  2017. 3. 13.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public class Operater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long don = 1700000L;
		int people = 3;
		int gagae = 1500;
		
		long total = don  * 12 * people * gagae;
		System.out.println("월 평균 급여 : " + String.format("%,d", don) +"원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 :" + String.format("%,d", gagae)  + "개");
		System.out.println("연간 인건비" + String.format("%,d", total));

	}

}

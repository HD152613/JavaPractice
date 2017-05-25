/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 *	 |_OracleDB
 *
 *
 * 1 개요 	:
 * 2. 작성일 :  2017. 5. 25.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public class SybaseDB implements IDBManager{
	public void insert(){
		System.out.println("Sybase DB 저장");
	}
	public void search(){
		System.out.println("Sybase DB 조회");
	}
	public void update(){
		System.out.println("Sybase DB 변경");
	}
	public void delete(){
		System.out.println("Sybase DB 삭제");
	}
}

/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	 |_PersonTest
 *
 *
 * 1 개요 	:
 * 2. 작성일 :  2017. 5. 8.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public class PersonTest {


	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		System.out.println(p.toString());
		System.out.println(k.toString());
		System.out.println(j.toString());
		System.out.println(c.toString());
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();

		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	}

}

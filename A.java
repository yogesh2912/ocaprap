package wrapperPackage;

import java.time.LocalDateTime;

public class A {

	public static void main(String[] args) {
//		Byte b=new Byte("555");
//		System.out.println(b);
		
		Long l=new Long(8l);
		System.out.println(l);
		
		Boolean i=new Boolean(null);
		System.out.println(i);
		
		LocalDateTime ldt=LocalDateTime.of(1997,12,29,10,10);
		System.out.println(ldt);
		
		doSolve();
		
		String myStr="Good";
		String newstr=null;
		char [] ch= {'G','o','o','d'};
		for(char c:ch) {
			newstr=newstr+c;
		}
		System.out.println(newstr);

	}
	
	public static void  doSolve() {
		char c='a';
		switch(c) {
		case 97:
			System.out.println("Hey");
		}
	}

}

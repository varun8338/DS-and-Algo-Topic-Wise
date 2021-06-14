package org.interfaces;

class A{
	
}

public class Test2 implements Interface1 {

	@Override
	public void someMethod1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void someMethod3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		String a=new String("hello");
		String b="hello";
		String c=a.intern();
		String d=c;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(b==c);
		System.out.println(b==d);
		
		Object ob=Class.forName("A").newInstance();
		System.out.println(ob);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		someMethod3();
	}

}

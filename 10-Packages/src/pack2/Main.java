package pack2;

import pack1.Hello;
import pack1.Training;
import pack1.Welcome;


public class Main {
	
	public static void main(String[] args) {
		Welcome w=new Welcome();
		w.greet();
		
		Hello hello = new Hello();
		hello.test();
		
		Training t = new Training();
		System.out.println(t);
	}

}

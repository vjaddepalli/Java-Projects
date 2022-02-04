package com.zensar.training.bean;

public class A {
	private int x;
	private static int y;
	
	void test() {
		B obj=new B();
		System.out.println(obj.a);
	}
	
	public class B { // regular inner class
		private int a;
		
		
		public B() {
			super();
		}


		void m1() {
			System.out.println(x);
			System.out.println(y);
		}

	}

	public static class C { // static inner class

		void m2() {
			System.out.println(y);
		}
	}

	public void calc() {
		class Calculator { // Anonymous inner class

			int sum(int a, int b) {
				System.out.println(x);
				System.out.println(y);
				return a + b;
			}

			int sub(int a, int b) {
				return a - b;
			}

			int mul(int a, int b) {
				return a * b;
			}

			int div(int a, int b) {
				return a / b;
			}
		}
		Calculator calc = new Calculator();

	}

}

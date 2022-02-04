package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Program Begins....");

		int[] arr = { 10, 20, 30 };
		String str = "125";
		try {

			System.out.println(arr[1]);
			int x = Integer.parseInt(str);
			x++;
			System.out.println(x);
			System.out.println(12 / 2);
			str=null;
			System.out.println(str.toUpperCase());

		} catch (ArithmeticException e) {
			System.out.println("Some Arithmetic error");
		} catch (NumberFormatException e) {
			System.out.println("Invalid  data for convertion");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index value");
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally runs always");
		}

		System.out.println("Program Begins....");

	}

}

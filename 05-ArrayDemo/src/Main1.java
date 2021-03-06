
public class Main1 {

	public static void main(String[] args) {
		
		int a=30;
		System.out.println(a);
		
		float b;
		boolean c=true;
		System.out.println(c);
		
		int[] marks;
		marks=new int[3]; //object creation
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks.length);
		
		marks[0]=80;
		marks[1]=90;
		marks[2]=95;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		for(int i=marks.length-1; i>=0; i--) {
			System.out.println(marks[i]);
		}
		
		//enhanced for loop or for-each
		for(int value: marks) {
			System.out.println("Value: "+value);
		}
		
		marks=null;
		marks=new int[] {10,20,30,40,50}; //re-initialization
		
		float []arr= {10.0f,20.0f,30.0f};  //in-line initialization
		
		//System.out.println(arr[100]); //array index out of bounds exception
		
		for(float v:arr){
			System.out.println("val: "+v);
		}
		
		

	}

}

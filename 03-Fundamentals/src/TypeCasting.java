
public class TypeCasting {

	public static void main(String[] args) {
		
		int age;
		float v2=4000.00F;
		age =(int) v2; //explicit typecasting
		byte v3=80; //implicit type casting
		short v4=v3; //implicit type casting
		
		int v5=909;
		v2=v5; //implicit
		
		long v6=v5; //implicit
		
		v6=(long) v2; //explicit
		
		float v7=(float) 8976.65;
		
		boolean v8=true;
		short s=900; //implicit
		byte b=(byte) s;

	}

}

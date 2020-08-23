
public class Casting {

	public static void main(String[] args) {
		int a = 1;
		int a2 = (int) 1; // a1과 a2 동일
		
		System.out.println(a);
		
		int b = (int) 1.1; //double을 강제로 int로 바꿔줌 =>손실(0.1) 발생
		
		String f = Integer.toString(124);
		System.out.println(f);
		
		
		

	}

}

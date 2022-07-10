package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print Fibbinocci series for first 11 numbers
		
		int firstNum = 0;
		int secondNum =1;
		int sum = 0;
		
		System.out.print(firstNum+" "+secondNum);
		for (int i = 2; i < 11; i++) {
			
			sum = firstNum + secondNum;
			firstNum = secondNum;	
			secondNum = sum;
			System.out.print(" "+sum);

	}

}
}

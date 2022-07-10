package week1.day1;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Home Assignment 2: Print if the given number is prime

				//Goal: To understand the problem solving, looping and conditional statement

				/* store the input value n = 13
				 * iterate through all number from 2 to n-1
				 */

				int n = 9;
				boolean isPrime = true;


				for (int i = 2; i <=n-1; i++) 
				{

					if(n%i==0)
					{
						isPrime = false;
						break;

					}

				}
				if(isPrime == true)
				{
					System.out.println(isPrime);
					System.out.println("Given Numbe is Prime Number");
				}
				else
				{
					System.out.println(isPrime);	
					System.out.println("Not Prime Number");
				}

			}
		}





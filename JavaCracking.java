public class JavaCracking{
	public static String crackPassword(String password){
		String guess = "";
		boolean cracked = false;
		while(!cracked){
			System.out.println(guess);
			//if equal to 0 password has been found
			if(password.compareTo(guess) == 0){
				cracked = true;
			}else{
				//add zero to determine distance away from answer
				int result = password.compareTo(guess + "0");
				//if answer is above 0 then it precedes
				if(result > 0){
					//result leads to believe at least 1 zero is ahead
					if(result >= 10)
						guess += 0;
					//append distance apart
					else
						guess += result;
				//answer is potentially  to far ahead
				}else{
					//found password
					if(result == 0){
						cracked = true;
						guess += "0";
					//one of the previous guesses was a 0 and must go back
					}else{
						guess = guess.substring(0, guess.length() - 1) + 0;
					}
				}
			}
		}
		System.out.println(guess);
		return guess;
	}

	public static void main(String[] args){
		final String password = "001000200003000004";
		final String password2 = "11223344556677889900";
		final String password3 = "1234567890";
		final String password4 = "749692206000003346628502750463";
		final String password5 = "0123456789";
		final String password6 = "10203040506070809";
		final String password7 = "7558485700000";
		final String password8 = "05674473";
		final String password9 = "00333455";

		crackPassword(password);
		System.out.println();
		crackPassword(password2);
		System.out.println();
		crackPassword(password3);
		System.out.println();
		crackPassword(password4);
		System.out.println();
		crackPassword(password5);
		System.out.println();
		crackPassword(password6);
		System.out.println();
		crackPassword(password7);
		System.out.println();
		crackPassword(password8);
		System.out.println();
		crackPassword(password9);
	}
}

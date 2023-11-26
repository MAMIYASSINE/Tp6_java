package Ex2;

import java.io.IOException;

public class TestAuthentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean estvrai=true;
		//boolean erreur=false;
	do {	
		estvrai=true;
		try {
			Authentification A=new Authentification();
			//erreur=true
		}
		catch(WrongInputLength e1) {
			System.out.println(e1.getMessage());
			estvrai=false;
			System.exit(0);
		}
		catch(WrongLoginException e2)
		{
			System.out.println(e2.getMessage());
			//System.exit(0);
			estvrai=false;

		}
		catch(WrongPwdException e3) {
			System.out.println(e3.getMessage());
			//System.exit(0);
			estvrai=false;

		}
		catch(IOException e4) {
			System.exit(0);
		}
	}
	while(estvrai== false);
	System.out.println("Fin programme");
	}

}

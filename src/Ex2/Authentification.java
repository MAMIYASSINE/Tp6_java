package Ex2;

import java.io.IOException;
import java.util.Scanner;

public class Authentification {

	private final String LoginCorrect="scott",PwdCorrect="tiger";
	
	public void getUserLogin() throws WrongInputLength,WrongLoginException {
		Scanner sc =new Scanner(System.in);
		String login="";
		System.out.println("donner login: ");
		login=sc.nextLine();
		if(login.length()>10) {
			throw new WrongInputLength("le login saisi depasse 10 caractères.");
		}
		else if(!login.equals(LoginCorrect)){
			throw new WrongLoginException("l'utilisateur saisit un login incorrect");	
		}
	}
	public void getUserPwd() throws WrongPwdException, WrongInputLength{
		Scanner sc =new Scanner(System.in);
		String pwd="";
		System.out.println("donner PWD: ");
		pwd=sc.nextLine();
		if(pwd.length()>10) {
			throw new WrongInputLength("le pwd saisi depasse 10 caractères.");
		}
		else if(!pwd.equals(PwdCorrect)){
			throw new WrongPwdException("le mot de passe est errone");	
		}
	}
	Authentification() throws WrongInputLength, WrongLoginException, WrongPwdException,IOException{
		this.getUserLogin();
		this.getUserPwd();
	}
	
}

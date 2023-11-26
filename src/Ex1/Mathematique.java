package Ex1;

public class Mathematique {

	public static double f(double n,double x) throws ParametreNullException, NegatifException
	{
		if(n==0) {
			//throw new ArithmeticException("impossible de faire une division par zéro !");
			throw new ParametreNullException("impossible de faire une division par zéro !");
		}
		if(x<0)
		{
			throw new NegatifException(x+"est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!!!");
		}
		return (Math.sqrt(x)/n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String a = args[0];
		String b =args[1];
		double n=Double.parseDouble(a);
		double x=Double.parseDouble(b);
		System.out.println(Mathematique.f(n, x));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
		}
		catch(NumberFormatException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Les arguments doivent être des nombres");
		}
		/*catch(ArithmeticException e3) {
			e3.getMessage();
			System.out.println("impossible de faire une division par zéro !");
		}*/
		catch(ParametreNullException e4) {
			System.out.println(e4.getMessage());
			//System.out.println("impossible de faire une division par zéro !");
		}
		catch(NegatifException e5) {
			System.out.println(e5.getMessage());
		}
		finally {
			System.out.println("bloc finally exécuté quel que soit le résultat d’exécution");
		}
		}
		
		
}

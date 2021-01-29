package modelagem;

public class Usuario implements IUser {

	String email;
	String senha;
	String nick;
	
	
	public void logar() {
		System.out.println( email + " logou!");
	}
	
	public void deslogar() {
		System.out.println(email + " deslogou!");
	}

	
}

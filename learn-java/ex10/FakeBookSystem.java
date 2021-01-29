package modelagem;

public class FakeBookSystem {

	void processarEntradaUsuario( IUser user) {
		user.logar();
	}
	
	void processarSaidaUsuario( IUser user) {
		user.deslogar();
	}
	
}

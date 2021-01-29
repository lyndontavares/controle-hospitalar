public class TesteFakeBook {

	public static void main(String[] args) {

		System.out.println("# FakeBook #");

		Usuario usuario = new Usuario();
		usuario.email="isa@email.com";
		usuario.nick= "isa";


		Administrador adm = new Administrador();
		adm.email="lyndon@gmail.com";
		adm.nick="lyndon";


		FakeBookSystem book = new FakeBookSystem();
		book.processarEntradaUsuario( usuario );


	}
}

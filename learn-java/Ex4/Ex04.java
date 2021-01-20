import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		 Scanner LerTeclado = new Scanner(System.in);
		 
		 // C A B E Ç A L H O
		 imprimirBrand();
		 		 
		 // M E N U 
		 List<Produto> menu = prepararMenu();
		 imprimirMenu(menu);
		 
		 // P E D I D O
		 Pedido pedido = new Pedido();
		 
		 // C O N T R O L E   L O O P
		 int controle = 1;
		 
		 // L O O P
		 while ( controle == 1 ) {
			 
			 try {
				 
				 log("Código =>");
				 int codigo = LerTeclado.nextInt();

				 if ( codigo > menu.size() ) {
					 erroCodigoInvalido();
					 continue;
				 }
				 
				 log("Quantidade => ");
				 int quantidade = LerTeclado.nextInt();
				 				 
				 // A D I C I O N A   I E M   A O   P E D I D O
				 pedido.adicionarItem( menu.get(codigo-1), quantidade );
				 
				 
				 log("Continuar comprado? [1]sim [2]não");
				 controle = LerTeclado.nextInt();
				 
				 
			 } catch (Exception e) {
				 erroCodigoInvalido();
			 }
			 
		 }
		
		 if ( pedido.getItens().size() > 0) {
			 
			 imprimirBrand();
			 log("S E U   P E D I D O","=");
			 imprimirPedidoLambda(pedido);
			 
		 }
		 		 
		 log("V O L T E   S E M P R E !","=");
		 LerTeclado.close();
	}
	
	// Methods Helpers
	
	public static void imprimirPedidoFor( Pedido pedido ) {
		 for(int i=0; i<pedido.getItens().size(); i++) {
			 log( pedido.getItens().get(i).toString());
		 }
		 imrimirTotal(pedido);
	}
	
	public static void imprimirBrand() {
		
		// A S C I I   A R T 
		// https://fsymbols.com/text-art/
		
		log("");
		log("█████████████████████████████████████████████████████████████");
		log("█▄─▄█─▄▄▄▄██▀▄─████▄─▄████▀▄─██▄─▀█▄─▄█─▄▄▄─█─█─█▄─▄▄─█─▄▄▄▄█");
		log("██─██▄▄▄▄─██─▀─█████─██▀██─▀─███─█▄▀─██─███▀█─▄─██─▄█▀█▄▄▄▄─█");
		log("▀▄▄▄▀▄▄▄▄▄▀▄▄▀▄▄▀▀▀▄▄▄▄▄▀▄▄▀▄▄▀▄▄▄▀▀▄▄▀▄▄▄▄▄▀▄▀▄▀▄▄▄▄▄▀▄▄▄▄▄▀");
		log(""); 
 
	}
	
	public static void imprimirPedidoIterate( Pedido pedido ) {
		 for(PedidoItem p : pedido.getItens()){
			 log( p.toString());
		 }
		 imrimirTotal(pedido);
	}
	
	public static void imprimirPedidoLambda(Pedido pedido ) {
		 pedido.getItens().forEach(  p -> log( p.toString()));
		 imrimirTotal(pedido);
	}
	
	public static void imrimirTotal(Pedido pedido) {
		 log("    Total ========> R$ " + pedido.getTotal() , "=");
	}
	
	public static List<Produto> prepararMenu() {
		 List<Produto> menu = new ArrayList<Produto>();
		 menu.add( new Produto(1,"Cachorro-Quente",4) );
		 menu.add( new Produto(2,"X-Salada ------",5) );
		 menu.add( new Produto(3,"X-Bacon -------",8) );
		 menu.add( new Produto(4,"X-Egg ---------",8) );
		 menu.add( new Produto(5,"X-Tudo --------",10) );
		 menu.add( new Produto(6,"Misto Quente --",3.5) );
		 return menu;
	}
	
	public static void imprimirMenu(List<Produto> menu ) {
		log( "M E N U ","=");
		menu.forEach(  p -> log( p.toString()));
		log("","=");
	}

	public static void erroCodigoInvalido() {
		log("Código inválido! <Digite de 1 a 6>");
	}
	
	public static void log(String message) {
		System.out.println(message);
	}
	
	public static void log(String msg,String decorator) {
		 log(msg);
		 log(repeatString(decorator,60));
	}
	
	public static String repeatString(String string, int numeroVezes) {
		if ( numeroVezes <=0  ) return "";
		String result = "";
		for (int i = 1; i <= numeroVezes; i++) {
		    result += string;
		}
		return result;
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) throws Exception {

        List<M> m = new ArrayList<>(M);
        M m1 = new M();
        m1.a=1;
        m.add(m1);
        for (int i = 0; i < m.size(); i++) {
            System.out.print( m(i).a );
        }
    }

    public static void log(String msg) {
          System.out.println(msg);
    }
}

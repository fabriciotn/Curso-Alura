package flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        NotasMusicais notas = new NotasMusicais();
        List<Nota> doReMiFa = Arrays.asList(
            notas.pega("do"),    
            notas.pega("doSus"),    
            notas.pega("re"),    
            notas.pega("reSus"),    
            notas.pega("mi"),    
            notas.pega("fa"),    
            notas.pega("faSus"),    
            notas.pega("fa"),    
            notas.pega("faSus"),    
            notas.pega("fa"),    
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("re"),    
            notas.pega("re"),
            notas.pega("do"),    
            notas.pega("sol"),    
            notas.pega("solSus"),    
            notas.pega("fa"),    
            notas.pega("mi"),    
            notas.pega("mi"),    
            notas.pega("mi"),
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("mi"),    
            notas.pega("fa"),    
            notas.pega("fa"),    
            notas.pega("fa")
        );
        Piano piano = new Piano();
        piano.toca(doReMiFa);
    }
}

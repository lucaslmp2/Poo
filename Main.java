package af;

/**
 *
 * @author lucasmoreirapacheco
 */
public class Main {
    
    public static void main(String[] args){
        DadosPessoais D1, D2;
        
        D1 = new DadosPessoais();
        D2 = new DadosPessoais();
        
        D1.preencher();
        D2.preencher();
        D1.status();
        D2.status();
        }
}

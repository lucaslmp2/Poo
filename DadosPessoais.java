package af;
import java.util.Scanner;
/**
 *
 * @author lucasmoreirapacheco
 */
public class DadosPessoais {
        

private String nome;
private int idade;
private int DD;
private int MM;
private int YY;

public DadosPessoais(){
this.nome="";
this.idade=0;
this.DD=0;
this.MM=0;
this.YY=0;
}

public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
    
}

 public int getIdade() {
        return idade;
    }

   
public void setIdade(int idade) {
        this.idade = idade;
    }

   
    public int getDD() {
        return DD;
    }

    
    public void setDD(int DD) {
        this.DD = DD;
    }

   
    public int getMM() {
        return MM;
    }

   
    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getYY() {
        return YY;
    }

    
    public void setYY(int YY) {
        this.YY = YY;
    }
    public void preencher(){
     Scanner ler = new Scanner(System.in);
     System.out.println("Digite o nome: ");
    this.nome = ler.next();
    System.out.println("Digite a idade:");
    this.idade = ler.nextInt();
    System.out.println("Digite o dia de nasc.:");
    this.DD = ler.nextInt();
    System.out.println("Digite o mês de nasc.:");
    this.MM = ler.nextInt();
    System.out.println("Digite o ano de nasc.:");
    this.YY = ler.nextInt();
    
    
    
    }

  public void status(){
      System.out.println("Dados pessoais:");
      System.out.println("Nome:"+this.nome);
      System.out.println("Idade:"+this.idade);
      System.out.println("Data de nascimento:"+DD+"/"+MM+"/"+YY);
      System.out.println("\n");
  }
}

        


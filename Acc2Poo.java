package acc2poo;
import java.util.Arrays;
import java.util.Scanner;
public class Acc2Poo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = new String[4];
		int posicao;
		String buscaNome = "";
		
		
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.println("nomes a ser pesquisado:" +i);
			nomes[i] = ler.nextLine();
							
		}

		System.out.println(Arrays.toString(nomes));
		Arrays.sort(nomes);
		System.out.println(Arrays.toString(nomes));
                System.out.println("Digite o nome a ser pesquisado:");
		buscaNome = ler.nextLine();
		posicao = Arrays.binarySearch(nomes, buscaNome);
		if(posicao > 0) {
		System.out.println(buscaNome+"Esta na Posição:"+posicao+" do vetor.");
		}else{
                    System.out.println("Elemento não encontrado no array!!");
                }
		}


}
/**
 *
 * @author lucasmoreirapacheco
 */

    


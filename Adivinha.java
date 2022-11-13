import java.util.*;
public class Adivinha{
	public static void main(String[] args) {

	try (Scanner rodar = new Scanner(System.in)) {
        Random random = new Random();

        String nome;
        int chances = 20, numero, erro = 0;
        long digite;
        boolean win = false;
        
        numero = random.nextInt(10000) + 1;
        // APENAS PARA SABER QUAL NUMERO ERA GERADO PRA FAZER OS TESTES :)
        // System.out.println("Numero gerado é => " + numero);
        // ONDE TU VAI COLOCAR SEU NOME CASO TIVER UM 
        System.out.println("DIGITA SEU NOME AI: ");
        nome = rodar.next();
        // AQUI QUE A DESCRACA COMEÇA
        while(chances  > 0 && win == false) {
        	System.out.println(Cores.CYAN + "DIGITE UM NUMERO INTEIRO ENTRE 0 E 10.000: " + Cores.RESET);
        	digite = rodar.nextLong();	
        	erro++;
        	if (numero == digite) {
        		System.out.println(Cores.GREEN_BACKGROUND + "\n!!VOCE GANHOU!! " + Cores.RESET);
        		System.out.println("\n" + nome + ", TU TENTOU " + erro + " VEZES");
        		win = true;
        	}else if (digite < numero) {
        		--chances;			
        		System.out.println("NUMERO PEQUENO, RESTA " + chances + " CHANCES");
        	}else {
        		--chances;
        		System.out.println("NUMERO GRANDE, RESTA " + chances + " CHANCES");	
        	}while(chances < 16 && win == false) {
        		System.out.println(Cores.GREEN + "DIGITE UM NUMERO INTEIRO ENTRE " + (numero - 500) + " E " + (numero + 500) + ": " + Cores.RESET);
        		digite = rodar.nextLong();
        		erro++;
        		if (numero == digite) {
        			System.out.println(Cores.GREEN_BACKGROUND + "\n!!VOCE GANHOU!! " + Cores.RESET);
        			System.out.println("\n" + nome + ", TU TENTOU " + erro + " VEZES");
        			win = true;
        		}else if (digite < numero) {
        			--chances;
        			System.out.println("NUMERO PEQUENO, RESTA " + chances + " CHANCES");
        		}else {
        			--chances;
        			System.out.println("NUMERO GRANDE, RESTA " + chances + " CHANCES");
        		}while(chances < 11 && win == false) {
        			System.out.println(Cores.YELLOW + "DIGITE UM NUMERO INTEIRO ENTRE " + (numero - 100) + " E " + (numero + 100) + ": " + Cores.RESET );
        			digite = rodar.nextLong();
        			erro++;
        			if (numero == digite) {
        				System.out.println(Cores.GREEN_BACKGROUND +"\n!!VOCE GANHOU!! " + Cores.RESET);
        				System.out.println("\n" + nome + ", TU TENTOU " + erro + " VEZES");
        				win = true;
        			}else if (digite < numero) {
        				--chances;
        				System.out.println("NUMERO PEQUENO, RESTA " + chances + " CHANCES");
        			}else {
        				--chances;
        				System.out.println("NUMERO GRANDE, RESTA " + chances + " CHANCES");
        			}while(chances < 6 && win == false) {
        				System.out.println(Cores.RED_BOLD + "DIGITE UM NUMERO INTEIRO ENTRE " + (numero - 50) + " E " + (numero + 50) + ": " + Cores.RESET );
        				digite = rodar.nextLong();
        				erro++;
        				if (numero == digite) {
        					System.out.println(Cores.GREEN_BACKGROUND + "\n!!VOCE GANHOU!! " + Cores.RESET);
        					System.out.println("\n" + nome + ", TU TENTOU " + erro + " VEZES");
        					win = true;
        				}else if (digite < numero) {
        					--chances;
        					System.out.println("NUMERO PEQUENO, RESTA " + chances + " CHANCES");
        				}else {
        					--chances;
        					System.out.println("NUMERO GRANDE, RESTA " + chances + " CHANCES");
        				}if (chances == 0 && win == false) {
        					System.out.println(Cores.RED_BACKGROUND + "\n!!VOCE PERDEU!! " + Cores.RESET);
        					System.out.println("\nO NUMERO ERA => " + numero);
        					win = true;
        					System.out.println("\n" + nome + ", TU TENTOU " + erro + " VEZES E NÃO GANHOU\n");
        				}
        				}
        			}
        		}	
        	}
        }
	}
}

import java.util.Scanner;

public class imprimir_quadrado {
    public static void main(String[] args) {
    int altura, largura, salvar;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite respectivamente altura e a largura do quadrado: ");
    altura = entrada.nextInt();
    largura = entrada.nextInt();
    salvar = largura;
    while(altura > 0){
        while( largura > 1) {
            System.out.print("*");
            largura--;       
        }
        largura = salvar;
        System.out.println("*");
        altura--;
    }
    entrada.close();
  }
}

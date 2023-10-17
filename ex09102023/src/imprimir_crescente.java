import java.util.Scanner;

public class imprimir_crescente {
    public static void main(String[] args) {
    int largura;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a maior largura");
    largura = entrada.nextInt();
    for(int i=1 ; i <= largura; i++){
        for(int j=1; j <= i; j++){
            System.out.print("*");
        }
    System.out.println();
    }    
    entrada.close();
  }
}

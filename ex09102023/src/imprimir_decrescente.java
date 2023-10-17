import java.util.Scanner;

public class imprimir_decrescente {
    public static void main(String[] args) {
    int largura;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a maior largura");
    largura = entrada.nextInt();
    for (int i = 1; i <= largura; i++) {
        for (int j = 1; j <= largura - i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
        }   
    entrada.close();
  }
}

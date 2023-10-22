import java.util.Scanner;
public class figura {
    static void fig(int altura) {
    for(int i = 1; i <= altura && altura <= 20; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        System.out.println();
        } 
    }
    public static void main(String[] args) throws Exception {
        int altura, escolha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura da figura a ser exibida (máximo 20): ");
        altura = entrada.nextInt();
        if(altura > 0 && altura <= 20){
            fig(altura);   
        } else {
            System.out.println("Erro!\nVocê deseja continuar?\n1.Sim\n2.Não");
            escolha = entrada.nextInt();
            if(escolha == 1){
                System.out.println("Digite a altura da figura a ser exibida (máximo 20): ");
                altura = entrada.nextInt();
                fig(altura);
            } else {
                System.out.println("Finalizado! ");
            }
        }
        
        entrada.close();
    }
    
}

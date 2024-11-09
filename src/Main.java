import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;
        
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        double media = soma / 4;
        
    
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int numero;
        int count =0;
        int soma = 0;

        do{
            System.out.println("Número> ");
            numero = scan.nextInt();
            count = count++;

            if (numero > 0)
                count = count +1;
                soma = soma + numero;
                maior = numero;

            System.out.println("Maior: " + maior);
        }
        while (count < 5);
        System.out.println("Média: " + (soma/5));
        numero = scan.nextInt();
    }
}
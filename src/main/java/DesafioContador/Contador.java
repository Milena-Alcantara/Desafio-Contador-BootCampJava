package DesafioContador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("Informe o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.print("informe o segundo número: ");
        int numeroDois = scanner.nextInt();

            contar(numeroUm, numeroDois);

        } catch (InputMismatchException err){
                System.err.println("Por favor, digite apenas números inteiros.");
        }catch (ParametroInvalidoException err){
            System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametroInvalidoException {
        if (numeroUm>=numeroDois){
            throw new ParametroInvalidoException();
        }else {
            int contador = numeroDois - numeroUm;
            for (int i = 1; i <=contador ; i++) {
                System.out.println("Imprimindo o número "+i);
            }
        }
    }
}

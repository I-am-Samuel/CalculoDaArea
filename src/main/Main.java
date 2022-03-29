package main;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static final Integer NUMERO_DA_DIVISAO_PARA_CALCULO = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo da área que deseja calcular: ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------- \n'Área do quadrado' - 'Área do retângulo' - 'Área do Triângulo' - 'Área do circulo' - 'Área do trapézio' - 'Área do losango' ");
        String tipoDaArea = scanner.nextLine();

        boolean aAreaDoQuadrado = Objects.equals(tipoDaArea, "Área do quadrado");
        boolean aAreaDoRetangulo = Objects.equals(tipoDaArea, "Área do retângulo");
        boolean aAreaDoTriangulo = Objects.equals(tipoDaArea, "Área do triângulo");
        boolean aAreaDoCirculo = Objects.equals(tipoDaArea, "Área do circulo");
        boolean aAreaDoTrapezio = Objects.equals(tipoDaArea, "Área do trápezio");
        boolean aAreaDoLosango = Objects.equals(tipoDaArea, "Área do losango");

        if (aAreaDoQuadrado){
            System.out.println("Digite o lado do quadraro: ");
            int ladoDoQuadrado = scanner.nextInt();

            int calculoDaAreaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;

            System.out.println(calculoDaAreaDoQuadrado);
        }
        else if (aAreaDoRetangulo){
            System.out.println("Digite o lado do retângulo: ");
            int ladoDoRetangulo = scanner.nextInt();

            System.out.println("Digite a altura do retângulo: ");
            int alturaDoRetangulo = scanner.nextInt();

            int calculoDaAreaDoRetangulo = ladoDoRetangulo * alturaDoRetangulo;

            System.out.println(calculoDaAreaDoRetangulo);
        }
        else if (aAreaDoTriangulo){
            System.out.println("Digite a base do triângulo: ");
            int baseDoTriangulo = scanner.nextInt();

            System.out.println("Digite a altura do triângulo: ");
            int alturaDoTriangulo = scanner.nextInt();

            int calculoDaAreaDoTriangulo = baseDoTriangulo * alturaDoTriangulo / NUMERO_DA_DIVISAO_PARA_CALCULO;

            System.out.println(calculoDaAreaDoTriangulo);
        }
        else if (aAreaDoCirculo){
            System.out.println("Digite o raio do circulo: ");
            int oRaioDoCirculo = scanner.nextInt();

            System.out.println("Digite o valor de PI: ");
            int oPiDoCirculo = scanner.nextInt();

            int calculoDaAreaDoCirculo = oPiDoCirculo * (oRaioDoCirculo * oRaioDoCirculo);

            System.out.println(calculoDaAreaDoCirculo);
        }
        else if (aAreaDoTrapezio){
            System.out.println("Digite");
        }
        scanner.close();
    }
}

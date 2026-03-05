package geo;

public class Calculadora {
	
    private double lado;   
    private double base;   
    private double altura; 
    private double raio;   
    private int opcao;     

    
    public void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Calcular Área do Quadrado");
        System.out.println("2 - Calcular Área do Retângulo");
        System.out.println("3 - Calcular Área do Círculo");
        System.out.println("4 - Sair");
    }

    
    public void executar() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        while (true) {
          
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                	System.out.print("Digite o lado do quadrado: ");
                    lado = scanner.nextDouble();
                    System.out.printf("A área do quadrado é: %.2f\n", lado * lado);
                    break;

                case 2: 
                	System.out.print("Digite a base do retângulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    altura = scanner.nextDouble();
                    System.out.printf("A área do retângulo é: %.2f\n", base * altura);
                    break;

                case 3: 
                	System.out.print("Digite o raio do círculo: ");
                    raio = scanner.nextDouble();
                    System.out.printf("A área do círculo é: %.2f\n", 3.14 * (raio * raio));
                    break;

                case 4: 
                	System.out.println("Saindo...");
                    return;

                default:
                	System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        lerDadosFuncionario(empresa);
        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("Folha Salarial Total: R$" + folhaSalarial);
    }

    private static void lerDadosFuncionario(Empresa empresa) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de funcionários a serem cadastrados: ");
        int numFuncionarios = scanner.nextInt();

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Digite o nome do funcionário: ");
            String nome = scanner.next();

            System.out.println("Digite o ID do funcionário: ");
            int id = scanner.nextInt();

            System.out.println("Digite o salário base do funcionário: ");
            double salarioBase = scanner.nextDouble();

            System.out.println("Digite o cargo do funcionário (DESENVOLVEDOR, GERENTE, SUPORTE): ");
            String cargoStr = scanner.next();
            Cargo cargo = Cargo.valueOf(cargoStr.toUpperCase());

            Funcionario funcionario = null;
            switch (cargo) {
                case DESENVOLVEDOR:
                    funcionario = new Desenvolvedor(nome, id, salarioBase);
                    break;
                case GERENTE:
                    funcionario = new Gerente(nome, id, salarioBase);
                    break;
                case SUPORTE:
                    funcionario = new Suporte(nome, id, salarioBase);
                    break;
                default:
                    System.out.println("Cargo inválido.");
            }

            if (funcionario != null) {
                empresa.adicionarFuncionario(funcionario);
            }
        }
        scanner.close();
    }
}
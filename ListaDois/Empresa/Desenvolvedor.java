class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.10;
    }
    
}

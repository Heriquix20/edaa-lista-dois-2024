class Gerente extends Funcionario {

   public Gerente(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.20 + 1000;
    }
    
}

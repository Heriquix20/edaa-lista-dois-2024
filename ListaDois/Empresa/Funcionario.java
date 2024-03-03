abstract class Funcionario {
    private String nome;
    private int id;
    private double salario;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public abstract double calcularSalario(double salarioBase);

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}
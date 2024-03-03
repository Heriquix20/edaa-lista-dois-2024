import java.util.ArrayList;
import java .util.List;

class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaSalarial() {
        double folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.calcularSalario(funcionario.getSalario());
        }
        return folhaSalarial;
    }
}


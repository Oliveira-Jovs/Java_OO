package Feito;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarioss {
	private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarioss() {
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                Gerente gerente = (Gerente) funcionario;
                System.out.println("Nome: " + gerente.getNome() + ", Idade: " + gerente.getIdade() +
                        ", Salário: " + gerente.getSalario() + ", Departamento: " + gerente.getDepartamento() +
                        ", Número de subordinados: " + gerente.getNumeros_de_subordinados());
            } else {
                System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade() +
                        ", Salário: " + funcionario.getSalario());
            }
        }
    }
}


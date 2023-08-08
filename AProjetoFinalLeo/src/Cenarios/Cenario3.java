package Cenarios;

import java.util.List;
import java.util.ArrayList;

import Animais.Animal;
import Animais.Anfibio;
import Animais.Ave;
import Animais.Mamifero;
import Animais.Peixe;
import Animais.Reptil;

import Pessoas.Biologo;
import Pessoas.Funcionario;
import Pessoas.Veterinario;
import Pessoas.Visitantes;
import Setores.Administracao;
import Setores.Biologia;
import Setores.ClinicaVeterinaria;
import Setores.Medicamento;
import Setores.ServicosGerais;
import Setores.Setor;

public class Cenario3 {public static void main(String[] args) {
	
	Visitantes visitante1 = new Visitantes();
	visitante1.setNome("João");
	visitante1.setIdade(38);

	Visitantes visitante2 = new Visitantes();
	visitante2.setNome("Helena  ");
	visitante2.setIdade(33);
		
	Visitantes visitante3 = new Visitantes();
	visitante3.setNome("Alice ");
	visitante3.setIdade(3);
	
	Visitantes visitante4 = new Visitantes();
	visitante4.setNome("Theo ");
	visitante4.setIdade(12);
	
	Visitantes visitante5 = new Visitantes();
	visitante5.setNome("Gael ");
	visitante5.setIdade(67);
	
	List<Visitantes> tampa = new ArrayList<Visitantes>();
	tampa.add(visitante1);
	tampa.add(visitante2);
	tampa.add(visitante3);
	tampa.add(visitante4);
	tampa.add(visitante5);
	
	
}

}

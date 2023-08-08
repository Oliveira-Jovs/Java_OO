package Projetinho;

public class AppEverton {public static void main(String[] args) {

	Funcionario funcionario1 = new Funcionario();
	funcionario1.setNome("Ronoi");
	funcionario1.setCpf("715.523.444.52");
	funcionario1.setSalário(1.200);
	funcionario1.setCargo("faxineiro");
	
	Funcionario funcionario2 = new Funcionario();
	funcionario2.setNome("Augusto");
	funcionario2.setCpf("620.679.550-04");
	funcionario2.setSalário(3.388);
	funcionario2.setCargo("Administrador");
	
	Funcionario funcionario3 = new Funcionario();
	funcionario3.setNome("Fusir");
	funcionario3.setCpf("447.639.850-27");
	funcionario3.setSalário(14.000);
	funcionario3.setCargo("Diretor");
	
	Funcionario funcionario4 = new Funcionario();
	funcionario4.setNome("Tabin");
	funcionario4.setCpf("644.232.690-07");
	funcionario4.setSalário(3.800);
	funcionario4.setCargo("Recursos humanos");
	
	Funcionario funcionario5 = new Funcionario();
	funcionario5.setNome("Tethal");
	funcionario5.setCpf("443.077.880-95");
	funcionario5.setSalário(5.000);
	funcionario5.setCargo("Cara da T.I");
	
	Funcionario biologo1 = new Biologo();
	biologo1.setNome("César");
	biologo1.setCpf("920.107.780-73");
	biologo1.setSalário(4.650);
	biologo1.setCargo("Biologo chefe");
	((Biologo)biologo1).setCrbio(1234);
	
	Funcionario biologo2 = new Biologo();
	biologo2.setNome("Raséc");
	biologo2.setCpf("154.652.444.78");
	biologo2.setSalário(3.354);
	biologo2.setCargo("Biologo ajudante");
	((Biologo)biologo2).setCrbio(5678);
	
	Funcionario veterinario1 = new Veterinario();
	veterinario1.setNome("Marcela");
	veterinario1.setCpf("172.842.444.39");
	veterinario1.setSalário(3.125);
	veterinario1.setCargo("Veterinaria chefe");
	((Veterinario)veterinario1).setCrmv(9876);
	
	Funcionario veterinario2 = new Veterinario();
	veterinario2.setNome("Lara");
	veterinario2.setCpf("781.632.444.41");
	veterinario2.setSalário(2.900);
	veterinario2.setCargo("Veterinaria ajudante");
	((Veterinario)veterinario2).setCrmv(4321);
	
	Funcionario veterinario3 = new Veterinario();
	veterinario3.setNome("Campos");
	veterinario3.setCpf("022.144.854.85");
	veterinario3.setSalário(2.140);
	veterinario3.setCargo("Veterinario estagiário");
	((Veterinario)veterinario3).setCrmv(8125);
	
	

	
	
	
}}

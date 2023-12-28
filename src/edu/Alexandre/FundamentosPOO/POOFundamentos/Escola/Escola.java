package edu.Alexandre.FundamentosPOO.POOFundamentos.Escola;

public class Escola {
	public static void main(String[] args) {


		// Aluno felipe = new Aluno();
		// felipe.nome="Felipe";
		// felipe.idade = 8;
		
		// System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
        // Não é mais acessivel pois seus atributos são privados.
        
        Aluno Alexandre = new Aluno();
        Alexandre.setNome("Alexandre");
        Alexandre.setIdade(34);
        Alexandre.setSexo("Masculino");

        System.out.println("O aluno " + Alexandre.getNome() + " tem " + Alexandre.getIdade() + " anos de idade" + " e é do sexo " + Alexandre.getSexo());
	}
}

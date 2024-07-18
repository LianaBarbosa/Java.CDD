package heranca;

public class Faculdade {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Juliana", 14);
		Professor p1 = new Professor("renata", 43);
		Funcionario f1 = new Funcionario("renan", 26);
		
		a1.matricula = "123";
		p1.disciplina = "matemática";
		f1.cargo = "secretario";
		
		
		System.out.println(a1.nome + " " + a1.idade + " " + a1.matricula);
		System.out.println(p1.nome + " " + p1.idade + " " + p1.disciplina);
		System.out.println(f1.nome + " " + f1.idade + " " + f1.cargo);
	}

}

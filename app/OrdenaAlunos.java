package app;

public class OrdenaAlunos {

	public CadastroAlunos source;
	
	public OrdenaAlunos (CadastroAlunos source) {
		this.source = source;
	}
	
	public Aluno[] computar() {
		
		Aluno resposta[] = new Aluno[source.alunos.length];
		//copia o vetor para o vetor de resposta
		for (int i=0; i < source.alunos.length; i++) {
			resposta[i] = source.alunos[i]; 
		}
		
		for (int i = 0; i < resposta.length - 1; i++) {
			for (int j = i; j < resposta.length; j++) {
				String matricula1 = source.getMatricula(resposta, i);
				String matricula2 = source.getMatricula(resposta, j);
				if (matricula1.compareTo(matricula2) > 0) {
					Aluno t = resposta[i]; 
					resposta[i] = resposta[j];
					resposta[j] = t;
				}
			}
		}
		
		return resposta;
		
	}
	
}

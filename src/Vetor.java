import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    public void Adiciona(Aluno aluno){
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public Aluno pega(int posicao){
        return alunos[posicao];
    }

    public void remove(int posicao){

    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i <totalAlunos; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalAlunos;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }


}

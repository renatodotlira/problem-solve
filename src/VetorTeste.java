public class VetorTeste {

    public static void main(String... args){
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("carlos");

        Vetor lista = new Vetor();

        lista.Adiciona(a1);
        lista.Adiciona(a2);

        System.out.println(lista);
        System.out.println(lista.contem(a3));
    }
}

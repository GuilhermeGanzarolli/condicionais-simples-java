public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        if(nota>=7){
            System.out.println("O aluno APROVADO com média"+ nota);
        }else if (nota<7 && nota>=5) {
                System.out.println("Aluno precisa fazer recuperação");
        }else{
            System.out.println("Aluno REPROVADO");
        }
    }
}


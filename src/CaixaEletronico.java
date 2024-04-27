public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado>saldo) {
            System.out.println("Não é possivel realizar a trasação");
        }else{
            saldo -= valorSolicitado;
            System.out.println("Saque de "+ valorSolicitado + " realizado com sucesso");
        }
        System.out.println("Saldo atual "+ saldo);
    }
}

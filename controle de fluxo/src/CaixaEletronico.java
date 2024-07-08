public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
        else if (valorSolicitado > saldo) {
            System.out.println("Saldo insuficiente");
        }
        else
            System.out.println("Valor Digitado inválido");
    }
}

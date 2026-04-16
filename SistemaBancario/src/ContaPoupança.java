public class ContaPoupança extends Conta {

    private static final double rendimentoMensal = 0.005;

    //construtor poupança

    //MT poupança
    public ContaPoupança(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);
    }

    @Override
    public double sacarDinheiro(double valorSaque) {
        if (valorSaque > 0 && getSaldoConta() >= valorSaque) {
            setSaldoConta(getSaldoConta() - valorSaque);
            return getSaldoConta();
        } else {
            throw new IllegalArgumentException("Saldo insuficiente. Saque não autorizado!");
        }
    }

    @Override
    public double calcularRendimentoConta() {
        return getSaldoConta() * rendimentoMensal;
    }
}
public class ContaCorrente extends Conta{

    private static final double taxaSaque = 2.00;

    //construtor corrente
    public ContaCorrente(int numeroConta, double saldoConta){
        super(numeroConta, saldoConta);

    }
    //Polimorfismo
    @Override
    public double calcularRendimentoConta(){
        return 0.0;
}
    @Override
    public double sacarDinheiro(double valorSaque) {
        double total = valorSaque + taxaSaque;
        if (valorSaque > 0 && getSaldoConta() > total) {
            return getSaldoConta() - total;
            } else {
            throw new IllegalArgumentException("Saldo insuficiente. Saque não autorizado!");
        }
    }
}

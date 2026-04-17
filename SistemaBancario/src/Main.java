public class Main {
    public static void main(String[] args) {
        Conta ContaCorrente = new ContaCorrente(1050, 500.00);
        Conta ContaPoupanca = new ContaPoupanca(1300, 600.000);

        ContaCorrente.depositar(50.00);
        ContaPoupanca.depositar(200.00);

        ContaPoupanca.sacarDinheiro(80.00);

        System.out.println();
        System.out.println("Conta Corrente:");
        System.out.printf("Saldo: R$ %.2f\n", ContaCorrente.getSaldoConta());
        System.out.printf("Rendimento gerado: %.2f\n", ContaCorrente.calcularRendimentoConta());

        System.out.println("\nConta Poupança:");
        System.out.printf("Saldo: R$ %.2f\n", ContaPoupanca.getSaldoConta());
        System.out.printf("Rendmento gerado: R$ %.2f\n", ContaPoupanca.calcularRendimentoConta());
    }
}
//teste 1: Conta poupanca nao mostrando valor de rendimento. 720 * 0.005 = 3,6 reais
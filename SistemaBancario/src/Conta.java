abstract class Conta {

     private int numeroConta;
    private double saldoConta;

     public Conta(int numeroConta, double saldoConta) {

         this.numeroConta = numeroConta;
         setSaldoConta(saldoConta);

     }

     //======acesso dados privados========GET e SET======
    //MT get
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public double getSaldoConta() {
        return this.saldoConta;
    }

    //MT  set
    public void setNumeroConta(int numeroContaUser) {
        this.numeroConta = numeroContaUser;
    }
    public void setSaldoConta(double saldoValor) {
        if (saldoValor < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo");
        }else {
            this.saldoConta = saldoValor;
        }
    }
    //======metodos=======

    //MT Depositar valor
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta += valor;
        } else {
            throw new IllegalArgumentException("O valor do depósito não pode ser negativo.");
        }
    }
    //MT Sacar dinheiro (acesso privado ao saldo)
    public abstract double sacarDinheiro(double valorSaque);

    //MT  rendimento da Conta
    public abstract double calcularRendimentoConta();

}


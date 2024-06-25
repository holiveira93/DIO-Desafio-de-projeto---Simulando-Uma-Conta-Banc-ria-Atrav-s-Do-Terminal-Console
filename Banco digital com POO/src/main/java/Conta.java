public abstract class Conta {

    protected static int contadorConta = 1;

    private final int agencia = 3060;
    protected int conta;
    private double saldo;

    public void depositar(double valor){
        deposito(valor);
        System.out.println(String.format("Depósito do valor %.2f realizado com sucesso", valor));
        imprimirSaldoAtual();
    }

    public void sacar(double valor){
        saque(valor);
        System.out.println(String.format("Depósito do valor %.2f realizado com sucesso", valor));
        imprimirSaldoAtual();
    }

    public void transferir(double valor, Conta contaPara){
        saque(valor);
        contaPara.deposito(valor);
        System.out.println(String.format("Transferência do valor %.2f para agência %d, conta %d realizado com sucesso", valor,contaPara.agencia, contaPara.conta));
        imprimirSaldoAtual();
    };


    private void deposito(double valor){
        this.saldo += valor;
    }

    private void saque(double valor){
        this.saldo -= valor;
    }

    private void imprimirSaldoAtual(){
        System.out.println(String.format("Saldo atual da conta %d: %.2f",this.conta,this.saldo));
    }
}

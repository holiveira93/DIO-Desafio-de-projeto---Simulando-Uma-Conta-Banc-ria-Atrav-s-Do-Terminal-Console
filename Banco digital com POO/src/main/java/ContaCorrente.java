
public class ContaCorrente extends Conta {
    private final String Tipo = "Corrente";

    public ContaCorrente(){
        this.conta=Conta.contadorConta++;
    }

}

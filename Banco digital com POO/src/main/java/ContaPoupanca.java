import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta{
    private final String Tipo = "Poupança";

    public ContaPoupanca(){
        this.conta=Conta.contadorConta++;
    }
}

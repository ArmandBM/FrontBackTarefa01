import java.util.InputMismatchException;

public class TransladoAereo  extends ItemPacote{

    private final CompaniaAerea companiaAerea;
    private String numeroVoo;

    public TransladoAereo(Double preco, Pacote pacote, CompaniaAerea companiaAerea, String numeroVoo) {
        super(preco, pacote);
        this.companiaAerea = companiaAerea;
        alterarNumeroVoo(numeroVoo);
    }

    public void alterarNumeroVoo(String numeroVoo){
        if(numeroVoo == null || numeroVoo.isEmpty() || numeroVoo.trim().isEmpty()){
            throw new InputMismatchException("NumeroVoo não pode ser vazio.");
        }
        this.numeroVoo = numeroVoo;
    }

    public CompaniaAerea obterCompaniaAerea() {
        return companiaAerea;
    }
}

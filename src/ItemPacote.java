import java.math.BigDecimal;
import java.util.InputMismatchException;

public abstract class ItemPacote {

    protected BigDecimal preco;
    protected final Pacote pacote;

    public ItemPacote(Double preco, Pacote pacote){
        this.preco = verificaPreco(preco);
        this.pacote = pacote;
    }

    protected BigDecimal verificaPreco(Double preco){

        if(preco < 0){
            throw new InputMismatchException("Preço não pode ser negativo");
        }

        return (new BigDecimal(preco));

    }

}

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Contratacao {

    private BigDecimal valor;
    private LocalDate dataContratacao;
    private final Cliente cliente;
    private Pacote pacote;

    public Contratacao(BigDecimal valor, LocalDate dataContratacao, Cliente cliente, Pacote pacote){
        this.valor = validaValor(valor);
        this.dataContratacao = dataContratacao;
        this.cliente = cliente;
        this.pacote = pacote;

    }

    private static BigDecimal validaValor(BigDecimal valor){
        if(valor.doubleValue() < 0){
            throw new InputMismatchException("Valores negativos não são aceitos");
        }
        return valor;
    }

    public void alteraDataDeContratacao(LocalDate data){
        this.dataContratacao = data;
    }

    public Pacote retornaPacote(){
        return this.pacote;
    }

    public void alteraPacote(Pacote novoPacote){
        this.pacote = novoPacote;
    }

}

import java.util.InputMismatchException;
import java.util.UUID;

public class Pacote {

    private String descricao;
    private final UUID idUnico;
    private final Localidade localidade;

    public Pacote(String descricao, Localidade localidade){
        this.descricao = alterarDescricao(descricao);
        this.localidade = localidade;
        idUnico = UUID.randomUUID();
    }

    public String alterarDescricao(String descricao){
        if(descricao == null || descricao.isEmpty() || descricao.trim().isEmpty()){
            throw new InputMismatchException("descrição não pode ser vazia.");
        }
        return descricao;
    }

    public String obterDescricao(){
        return this.descricao;
    }

    public UUID obterId(){
        return this.idUnico;
    }
    public Localidade obterLocalidade() {
        return localidade;
    }
}

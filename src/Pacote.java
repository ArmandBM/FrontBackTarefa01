import java.util.InputMismatchException;
import java.util.UUID;

public class Pacote {

    private String nome;
    private String descricao;
    private final UUID idUnico;

    public Pacote(String nome, String descricao){
        this.nome = alteraNome(nome);
        this.descricao = descricao;
        idUnico = UUID.randomUUID();
    }

    public String alteraNome(String nome){
        if(nome == null || nome.isEmpty() || nome.trim().isEmpty()){
            throw new InputMismatchException("Nome informado incorretamente");
        }
        return nome;
    }

    public String retornaNome(){
        return this.nome;
    }

    public String retornaDescricao(){
        return this.descricao;
    }

    public String retornaid(){
        return this.idUnico.toString();
    }
}

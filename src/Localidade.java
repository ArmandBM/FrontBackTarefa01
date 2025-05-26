import java.util.InputMismatchException;

public class Localidade {

    private String nome;

    public Localidade(String nome){
        this.nome = alterarNome(nome);
    }

    public String alterarNome(String nome){
        if(nome == null || nome.isEmpty() || nome.trim().isEmpty()){
            throw new InputMismatchException("nome não pode ser vazio.");
        }
        return nome;
    }

    public String retornarNome(){
        return this.nome;
    }
}

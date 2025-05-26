import java.time.LocalDate;
import java.util.InputMismatchException;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private CPF cpf;

    public Cliente(String nome, LocalDate dataNascimento, CPF cpf){
        alterarNome(nome);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public void alterarNome(String nome){
        if(nome == null || nome.isEmpty() || nome.trim().isEmpty()){
            throw new InputMismatchException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String retornaNome(){
        return this.nome;
    }

    public CPF retornaCpfrelacionado(){
        return this.cpf;
    }

    public LocalDate retornaDataNascimento(){
        return this.dataNascimento;
    }
}

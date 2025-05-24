public class Hospedagem extends ItemPacote{

    private final String nome;
    private Endereco endereco;

    public Hospedagem(Double preco, Pacote pacote, String nomeHotel, Endereco endereco){
        super(preco, pacote);
        this.nome = nomeHotel;
        this.endereco = endereco;
    }

    public void atualizaEndereco(Endereco endereco){
        if(endereco != null){
            this.endereco = endereco;
        }
    }

    public Endereco retornaEndereco(){
        return this.endereco;
    }

    public String retornaNome(){
        return this.nome;
    }
}

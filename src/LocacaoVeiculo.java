public class LocacaoVeiculo extends ItemPacote{

    private Automovel veiculo;

    public LocacaoVeiculo(Double preco, Pacote pacote, Automovel carro) {
        super(preco, pacote);
        this.veiculo = carro;
    }

    public Automovel retornaVeiculo(){
        return this.veiculo;
    }

}

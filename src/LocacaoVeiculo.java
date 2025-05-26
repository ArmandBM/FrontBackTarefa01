import java.util.InputMismatchException;

public class LocacaoVeiculo extends ItemPacote{

    private final Marca marca;
    private Modelo modelo;

    public LocacaoVeiculo(Double preco, Pacote pacote, Marca marca, Modelo modelo) {
        super(preco, pacote);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Modelo obterModelo() {
        return modelo;
    }
    public Marca obterMarca() {
        return marca;
    }
}

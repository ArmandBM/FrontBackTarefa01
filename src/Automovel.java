public class Automovel {

    public static enum marcaDisponivel{
        Wolkswagen,
        Cherry,
        BYD,
        GM,
        TOYOTA,
        GURGEL,
        Outro
    };

    public final string modelo;
    public final marcaDisponivel marca;

    public Automovel(string modelo, marcaDisponivel marca){
        this.marca = marca;
        this.modelo = modelo;
    }
}

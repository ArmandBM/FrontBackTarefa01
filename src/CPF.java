import java.util.InputMismatchException;

public class CPF {

    private String cpf;

    public CPF(String cpf){

        if(validaCPF(cpf)){
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("CPF informado incorretamente");
        }

    }

    private boolean validaCPF(String cpf){
        int soma = 0;
        int primeiroDigito, segundoDigito;

        String possivelCpf = cpf.replaceAll("\\D", "");

        if(possivelCpf.length() != 11){
            return false;
        }

       //Checamos os dígitos verificadores
        //Primeiro dígito
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(possivelCpf.charAt(i)) * (10 - i);
        }
        primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }
        //Segundo dígito
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(possivelCpf.charAt(i)) * (11 - i);
        }
        segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        //Comparamos com os verificadores
        if(possivelCpf.charAt(9) != Character.forDigit(primeiroDigito, 10)
                && possivelCpf.charAt(10) != Character.forDigit(segundoDigito, 10)){
            return false;
        }

        return true;
    }
    public String retornaCPF(){
        return this.cpf;
    }
}

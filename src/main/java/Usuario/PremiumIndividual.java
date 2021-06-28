package Usuario;

public class PremiumIndividual extends Usuario{

    public String indentificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote(){
        return this.getValor();
    }
}

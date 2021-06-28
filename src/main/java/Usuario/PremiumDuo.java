package Usuario;

public class PremiumDuo extends Usuario{

    public String indentificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote() {

        return this.getValor() + (this.getNumDispositivos() * 10.0f);
    }

}

package Usuario;

public class PremiumUniversitario extends Usuario{

    public String indentificarPessoa() {
        return this.getEmail();
    }

    public float calculaValorPacote(){
        return this.valor;
    }
}

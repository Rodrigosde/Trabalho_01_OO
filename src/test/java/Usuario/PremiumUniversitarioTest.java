package Usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumUniversitarioTest {

    @Test
    void indentificarPessoa() {
        Usuario premiumUniversitario = new PremiumUniversitario();
        premiumUniversitario.setEmail("abc@gmail.com");
        premiumUniversitario.setSenha("123");
        assertEquals("abc@gmail.com", premiumUniversitario.indentificarPessoa());
    }

    @Test
    void calculaValorPacote() {
        Usuario premiumUniversitario = new PremiumUniversitario();
        premiumUniversitario.setValor(19.0f);
        assertEquals(19.0f, premiumUniversitario.calculaValorPacote());
    }
}
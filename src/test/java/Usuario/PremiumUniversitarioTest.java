package Usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumUniversitarioTest {

    Usuario premiumUniversitario = new PremiumUniversitario();

    @Test
    void identificarPessoa() {
        premiumUniversitario.setEmail("abc@gmail.com");
        premiumUniversitario.setSenha("123");
        assertEquals("abc@gmail.com", premiumUniversitario.identificarPessoa());
    }

    @Test
    void calculaValorPacote() {
        premiumUniversitario.setValor(19.0f);
        assertEquals(19.0f, premiumUniversitario.calculaValorPacote());
    }

    @Test
    void deveRetornarValorDoPacoteDosetValor(){
        premiumUniversitario.setValor(19.0f);
        premiumUniversitario.setNumDispositivos(3);
        assertEquals(19.0, premiumUniversitario.calculaValorPacote());
    }
}
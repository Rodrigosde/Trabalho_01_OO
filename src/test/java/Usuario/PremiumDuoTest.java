package Usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumDuoTest {

    @Test
    void indentificarPessoa() {
        Usuario premiumDuo = new PremiumDuo();
        premiumDuo.setEmail("abc@gmail.com");
        premiumDuo.setSenha("123");
        assertEquals("abc@gmail.com", premiumDuo.indentificarPessoa());
    }

    @Test
    void calculaValorPacote6telas() {
        Usuario premiumDuo = new PremiumDuo();
        premiumDuo.setValor(35.0f);
        premiumDuo.setNumDispositivos(6);
        assertEquals(95.0f, premiumDuo.calculaValorPacote());
    }
    @Test
    void calculaValorPacote2telas() {
        Usuario premiumDuo = new PremiumDuo();
        premiumDuo.setValor(35.0f);
        premiumDuo.setNumDispositivos(2);
        assertEquals(55.0f, premiumDuo.calculaValorPacote());
    }
}
package Usuario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumIndividualTest {

    @Test
    void indentificarPessoa() {
        PremiumIndividual premiumIndividual = new PremiumIndividual();
        premiumIndividual.setEmail("abc@gmail.com");
        premiumIndividual.setSenha("123");
        assertEquals("abc@gmail.com", premiumIndividual.indentificarPessoa());
    }

    @Test
    void calculaValorPacote() {
        PremiumIndividual premiumIndividual = new PremiumIndividual();
        premiumIndividual.setValor(35.0f);
        assertEquals(35.0f, premiumIndividual.calculaValorPacote());
    }
}
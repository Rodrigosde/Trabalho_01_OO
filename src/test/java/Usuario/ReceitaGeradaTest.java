package Usuario;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaGeradaTest {

    @Test
    void calcularReceitaGeral() {
        Usuario premiumduo = new PremiumDuo();
        Usuario premiumindividual = new PremiumIndividual();
        Usuario premiumuniversitario = new PremiumUniversitario();

        premiumduo.setValor(34);
        premiumduo.setNumDispositivos(2);
        premiumindividual.setValor(36);
        premiumuniversitario.setValor(22);


        List<Usuario> lista = new ArrayList<Usuario>();
        lista.add(premiumduo);
        lista.add(premiumindividual);
        lista.add(premiumuniversitario);


        ReceitaGerada receitaGerada = new ReceitaGerada();

        assertEquals(112.0f,receitaGerada.calcularReceitaGeral(lista));

    }
}
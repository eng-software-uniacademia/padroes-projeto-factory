import factories.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTest {
    @Test
    void deveRetornarServicoInexistente() {
        try {
            ServicoFactory.obterServico("Tazmania");
        } catch (IllegalArgumentException ex) {
            assertEquals("Serviço inexistente.", ex.getMessage());
        }
    }

    @Test
    void deveRetornarServicoInvalido() {
        try {
            ServicoFactory.obterServico("Cadastro");
        } catch (IllegalArgumentException ex) {
            assertEquals("Serviço inválido.", ex.getMessage());
        }
    }
}

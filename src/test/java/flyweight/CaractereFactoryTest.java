package flyweight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class CaractereFactoryTest {
    @Test void deveCompartilharFlyweightDoMesmoSimbolo() {
        CaractereFactory factory = new CaractereFactory();
        assertSame(factory.obterCaractere('A'), factory.obterCaractere('A'));
        assertEquals(1, factory.quantidadeDeCaracteresCompartilhados());
    }
    @Test void deveCriarFlyweightsDiferentesParaSimbolosDiferentes() {
        CaractereFactory factory = new CaractereFactory();
        assertNotSame(factory.obterCaractere('A'), factory.obterCaractere('B'));
        assertEquals(2, factory.quantidadeDeCaracteresCompartilhados());
    }
    @Test void documentoMantemPosicoesSeparadasComFlyweightCompartilhado() {
        CaractereFactory factory = new CaractereFactory();
        Documento documento = new Documento();
        documento.adicionar(new CaracterDocumento(factory.obterCaractere('A'), 1, 0, "Arial", 12));
        documento.adicionar(new CaracterDocumento(factory.obterCaractere('A'), 1, 1, "Arial", 12));
        assertSame(documento.getCaracteres().get(0).getCaractere(), documento.getCaracteres().get(1).getCaractere());
        assertEquals(2, documento.getCaracteres().size());
    }
}

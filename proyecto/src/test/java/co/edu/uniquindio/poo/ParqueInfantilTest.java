package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ParqueInfantilTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test 
    public void ParqueNombreNulo (){
        LOG.info("Inicio teste parque infantil con nombre nulo");
        assertThrows(Throwable.class, () -> new ParqueInfantil(null, "D1", Municipio.FILANDIA));
        LOG.info("Fin test parque infantil con nombre nulo ");
    }

}

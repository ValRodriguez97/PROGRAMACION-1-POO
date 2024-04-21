package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
    private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void ValorProyectoSinParques() {
        LOG.info("Inicio test ValorProyectoSinParques");

        var proyecto = new Proyecto();

        assertEquals(0.0, proyecto.calcularValorProyecto());

        LOG.info("Fin test ValorProyectoSinParques");
    }

    @Test
    public void obtenerParqueNombre (){
        LOG.info("Inicio test Obtener un parque por su nombre");
        Proyecto proyecto = new Proyecto();
        ParqueInfantil parque = new ParqueInfantil("Las flores", "Parque infantil para niños y mascotas", Municipio.GENOVA);
        proyecto.añadirParqueInfantil(parque);
        assertEquals(parque, proyecto.getParqueNombre("Las flores"));
        LOG.info("Fin test Obtener un parque por su nombre");
    }

    @Test
    public void ParqueNombreNoExistente (){
        LOG.info("Inicio test para obtener un parque con un nombre existente");
        Proyecto proyecto = new Proyecto();

        assertThrows(Throwable.class, () -> proyecto.getParqueNombre("Las flores"));
        LOG.info("Fin test para obtener un parque con un nombre existente");
    }

    @Test
    public void ParquesIguales (){
        LOG.info("Inicio test parques con igual nombre");
        Proyecto proyecto = new Proyecto();
        ParqueInfantil parque= new ParqueInfantil("Nubecitas", "Parque infantil para niños menores a 5 años", Municipio.PIJAO);
        proyecto.añadirParqueInfantil(parque);
        assertThrows(Throwable.class, () -> proyecto.añadirParqueInfantil(parque));
        LOG.info("Fin test parques con igual nombre");
    }

    @Test
    public void MunicipiosSinParque (){
        LOG.info("Inicio test municipios sin parques");
        Proyecto proyecto = new Proyecto();
        assertEquals(0, proyecto.getParqueMunicipio("CALARCA").size());
        LOG.info("Fin test municipios sin parques");
    }

    @Test
    public void MunicipioInexistente (){
        LOG.info("Inicio teste obtener un municipio inexistente");
        Proyecto proyecto = new Proyecto();
        assertEquals(0, proyecto.getParqueMunicipio("QUIMBAYA").size());
        LOG.info("Fin teste obtener un municipio inexistente");
    }

    @Test
    public void ParquesMunicipio (){
        LOG.info("Inicio teste obtener lista ordenada de acuerdo a los municipios");
        Proyecto proyecto = new Proyecto();
        var parque1 = new ParqueInfantil("P1", "D1", Municipio.ARMENIA);
        var parque2 = new ParqueInfantil("P2", "D2", Municipio.CORDOBA);
        var parque3 = new ParqueInfantil("P3", "D3", Municipio.MONTENEGRO);
        var parque4 = new ParqueInfantil("P4", "D4", Municipio.ARMENIA);
        var parque5 = new ParqueInfantil("P5", "D5", Municipio.MONTENEGRO);
        var parque6 = new ParqueInfantil("P6", "D6", Municipio.CORDOBA);

        proyecto.añadirParqueInfantil(parque1);
        proyecto.añadirParqueInfantil(parque2);
        proyecto.añadirParqueInfantil(parque3);
        proyecto.añadirParqueInfantil(parque4);
        proyecto.añadirParqueInfantil(parque5);
        proyecto.añadirParqueInfantil(parque6);

        Collection<ParqueInfantil> listaEsperada = List.of(parque1,parque4);

        assertIterableEquals(listaEsperada, proyecto.getParqueMunicipio("ARMENIA"));
        LOG.info("Fin teste obtener lista ordenada de acuerdo a los municipios");
    }

    @Test
    public void ParquesOrdenValor (){
        LOG.info("Inicio test parques ordenados por valor");
        Proyecto proyecto = new Proyecto();

        var parque1 = new ParqueInfantil("P1", "D1", Municipio.PIJAO);
        var parque2 = new ParqueInfantil("P2", "D2", Municipio.CORDOBA);
        var parque3 = new ParqueInfantil("P3", "D3", Municipio.BUENAVISTA);
        var parque4 = new ParqueInfantil("P4", "D4", Municipio.PIJAO);
        var parque5 = new ParqueInfantil("P5", "D5", Municipio.CORDOBA);
        var parque6 = new ParqueInfantil("P6", "D6", Municipio.BUENAVISTA);

        Zona zona = new Zona("Zona", Material.ASFALTO, new Cuadrado(15));

        parque1.agregarZona(zona);
        parque2.agregarZona(zona);
        parque3.agregarZona(zona);
        parque4.agregarZona(zona);
        parque5.agregarZona(zona);
        parque6.agregarZona(zona);

        proyecto.añadirParqueInfantil(parque1);
        proyecto.añadirParqueInfantil(parque2);
        proyecto.añadirParqueInfantil(parque3);
        proyecto.añadirParqueInfantil(parque4);
        proyecto.añadirParqueInfantil(parque5);
        proyecto.añadirParqueInfantil(parque6);

        Collection <ParqueInfantil> listaEsperada = List.of(parque2, parque5, parque3, parque6, parque1,parque4);
        assertIterableEquals(listaEsperada, proyecto.listaOrdenada());
        LOG.info("Fin test parques ordenados por valor");
    }
}

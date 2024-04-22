package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void ParqueInfantilNombreVacio (){
        LOG.info("Inicio test parque con nombre vacio");
        assertThrows(Throwable.class, () -> new ParqueInfantil("", "D1", Municipio.ARMENIA));
        LOG.info("Fin test parque con nombre vacio");
    }

    @Test 
    public void ParqueInfantilDescripcionNula (){
        LOG.info("Inicio test parque infantil con descripcion nula");
        assertThrows(Throwable.class, () -> new ParqueInfantil("A", null, Municipio.CORDOBA));
        LOG.info("Fin test parque infantil con descripcion nula ");
    }

    @Test
    public void ParqueInfantilDescripcionVacia (){
        LOG.info("Inicio test parque infantil con descripcion vacia");
        assertThrows(Throwable.class, () -> new ParqueInfantil("A", " ", Municipio.MONTENEGRO));
        LOG.info("Fin test parque infantil con descripcion vacia");
    }

    @Test
    public void ValorParqueSinZonas (){
        LOG.info("Inicio test Valor parque sin zonas");
        ParqueInfantil parque = new ParqueInfantil("Las flores", "Parque para niños y mascotas", Municipio.SALENTO);
        assertEquals(50000, parque.calcularValor());
        LOG.info("Fin test Valor parque sin zonas");
    }

    @Test 
    public void ValorParqueZonaCircular (){
        LOG.info("Inicio test valor de un parque con zona circular");
        ParqueInfantil parque = new ParqueInfantil("Las flores", "Parque infantil para niños y mascotas", Municipio.CALARCA);
        parque.agregarZona(new Zona("Zona de mascotas", Material.ARENA, new Circulo(10)));
        assertEquals(3151592.65, parque.calcularValor(),0.05);
        LOG.info("Inicio test valor de un parque con zona circular");
    }

    @Test
    public void ValorParqueCuatroZonas (){
        LOG.info("Inicio test valor parque con cuatro zonas");
        ParqueInfantil parque = new ParqueInfantil("Las flores", "Parque infantil para niños y mascotas", Municipio.CALARCA);
        parque.agregarZona(new Zona("Zona mascotas", Material.ARENA, new Circulo(10)));
        parque.agregarZona(new Zona("Zona rectangular", Material.GRAMA_SINTENTICA, new Rectangulo(10, 20)));
        parque.agregarZona(new Zona("Zona cuadrada", Material.GRAMA_NATURAL, new Cuadrado(10)));
        parque.agregarZona(new Zona("Zona triangular", Material.ARENA, new Triangulo(10, 20)));

        assertEquals(13151592.65, parque.calcularValor(),0.05);
        LOG.info("Fin test valor parque con cuatro zonas");
    }

    @Test
    public void ParqueZonasIgualNombre (){
        LOG.info("Inicio test parques con igual nombre");
        ParqueInfantil parque = new ParqueInfantil("Las flores", "Parque infantil para niños y mascotas", Municipio.CALARCA);
        parque.agregarZona(new Zona("Zona mascotas", Material.ARENA, new Circulo(10)));
        assertThrows(Throwable.class, () -> parque.agregarZona(new Zona("Zona mascotas", Material.GRAMA_NATURAL, new Cuadrado(4))));
        LOG.info("Fin test parques con igual nombre");
    }
}

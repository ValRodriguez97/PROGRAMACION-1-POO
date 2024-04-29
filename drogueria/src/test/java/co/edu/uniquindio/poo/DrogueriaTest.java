package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(DrogueriaTest.class.getName());

    /*
     * Prueba para no admitir pedidos de un producto sinStock
     */
    @Test
    public void pedidoProductoSinStock (){
        LOG.info("Inicio test pedidos con productos sin stock");
        assertThrows(Throwable.class, ()-> new Pedido(LocalDate.of(2024, 04, 18), 8, 
        new ProductoHogar("9703", "Limpiador de pisos", "Producto para la limpieza de todo tipo de pisos", 12000,
         0, "Tiendas D1", "Mantener fuera del alcance de los niños"), 
        new Cliente("María", "Gonzáles", "1.084.938.837", "Calle 2, casa 5, Armenia", "3128362634")));
        LOG.info("Fin test pedidos con productos sin stock");
    }

    @Test
    public void ProductosStock100 (){
        LOG.info("Inicio test obtener productos con stock mayor a 100");
        var drogueria = new Drogueria("hsbdj");

        CuidadoPersonal producto1 = new CuidadoPersonal("8734", "Gel limpiador facial", "Jabon de limpieza facil, especial para pieles grasosas", 87000, 452, "La roche posay", "agua, sodio, capililo glicol");
        ProductoHogar producto2 = new ProductoHogar("9703", "Limpiador de pisos", "Producto para la limpieza de todo tipo de pisos", 12000, 23, "Tiendas D1", "Mantener fuera del alcance de los niños");
        Medicamento producto3 = new Medicamento("8174", "Dolex gripa", "Manejo y alivio de los sitnomas de la gripa", 6000, 143, "Dolex", 500);

        drogueria.agregarProducto(producto1);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto3);

        Collection<Producto> listaEsperada = List.of(producto1, producto3);

        assertIterableEquals(listaEsperada, drogueria.getProductoStock100());

        LOG.info("Fin test obtener productos con stock mayor a 100");
    }

    @Test 
    public void costoTotalPedido (){
        LOG.info("Inicio test calcular el costo total de un pedido");
        var drogueria = new Drogueria("a");
        Pedido  pedido = new Pedido(LocalDate.of(2024, 04, 18), 32, new ProductoHogar("9703", "Limpiador de pisos", "Producto para la limpieza de todo tipo de pisos", 12000, 23, "Tiendas D1", "Mantener fuera del alcance de los niños"), new Cliente("María", "Gonzáles", "1.084.938.837", "Calle 2, casa 5, Armenia", "3128362634"));
        drogueria.agregarPedido(pedido);
        assertEquals(384000, pedido.calcularValorPedido(), 0.05, App.PRECISION);
        LOG.info("Fin test calcular el costo total de un pedido");
    }
}

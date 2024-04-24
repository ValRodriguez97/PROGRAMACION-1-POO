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

    @Test
    public void pedidosSinStock (){
        LOG.info("Inicio test pedidos con productos sin stock");
        assertThrows(Throwable.class, ()-> new Pedido(LocalDate.of(2024, 04, 22), 6, 
        new ProductoHogar("124", "Crema Hidratante", "Crema hidratante con vitamina c", 200, 0, "3456", "Aplicar suavemente sobre el rostro"), 
        new Cliente("Vanesa", "Muñoz", "46583", "hdcuebdieub", "sjgddushcids")));
        LOG.info("Fin test pedidos con productos sin stock");
    }

    @Test
    public void ProductosStock100 (){
        LOG.info("Inicio test obtener productos con stock mayor a 100");
        var drogueria = new Drogueria("hsbdj");

        CuidadoPersonal producto1 = new CuidadoPersonal("cndkncla", "92839283", "Jabon", "ajsdsjbcjds", 737828, 457, "ksandjsc");
        ProductoHogar producto2 = new ProductoHogar("jdncds", "jncdsnekicn", "jdcjdcbi", 4343, 23, "jsdcbid", "jsbdieb");
        Medicamento producto3 = new Medicamento(232, "djnckjnfc", "ksdjcjdvb", "kjcjnf", 83734, 111, "ksjdncj");

        drogueria.agregarProducto(producto3);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto1);

        Collection<Producto> listaEsperada = List.of(producto3, producto1);

        assertIterableEquals(listaEsperada, drogueria.getProductoStock100());

        LOG.info("Fin test obtener productos con stock mayor a 100");
    }

    @Test
    public void agregarNuevoProducto (){
        Drogueria drogueria = new Drogueria("a");
        ProductoHogar producto = new ProductoHogar("123", "crema", "producto a base de alcohol", 3747, 100, "123", "Mantengase fuera del alcance de los niños");
        drogueria.agregarProducto(producto);
    }

    @Test 
    public void costoTotalPedidos (){
        var drogueria = new Drogueria("a");
        Pedido  pedido = new Pedido(LocalDate.of(2024, 04, 22), 32, 
        new CuidadoPersonal("Niacinamida", "1234", "Jabon limpiador de rostro", "Aplicar tres dias en la semana",
         45000, 34, "1234"), 
        new Cliente("Vanesa", "Muñoz", "1234", "calle 2", "7836382"));
        drogueria.agregarPedido(pedido);
        assertEquals(1440000, pedido.calcularValorPedido(), 0.05, App.PRECISION);
    }

}

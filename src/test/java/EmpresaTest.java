import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    private Empresa empresa;
    private Conductor conductor;
    private Bus bus;
    private Viaje viaje;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("123456789-0","0532 calle a",new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        conductor = new Conductor("nombre", "apellido", "912345678","A");
        bus = new Bus("AA-BB-10","marca","modelo");
        viaje = new Viaje("ciudad1","ciudad2","13:05","14:20", new ArrayList<>());
    }

    @Test
    void agregarConductor() {
        empresa.agregarConductor(conductor);
        assertTrue(empresa.getConductores().contains(conductor));
    }

    @Test
    void agregarBus() {
        empresa.agregarBus(bus);
        assertTrue(empresa.getBuses().contains(bus));
    }

    @Test
    void descontinuarBus() {
        empresa.agregarBus(bus);
        empresa.descontinuarBus(bus.getPatente());
        assertFalse(empresa.getBuses().contains(bus));

    }

    @Test
    void asociarBus() {
        empresa.asociarBus(viaje,bus);
        assertTrue(viaje.getBus().equals(bus));
    }

    @Test
    void obtenerBusesRangoTiempoYDestino() {
        assertEquals(1, empresa.obtenerBusesRangoTiempoYDestino("13:00","15:00","ciudad2").size());
    }
}
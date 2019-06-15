package algocraft;
import algocraft.errores.CasilleroOcupadoError;
import algocraft.mapaDeJuego.Casillero;
import algocraft.materiales.MaderaProxy;
import org.junit.Test;

public class CasilleroTest {
    @Test (expected = CasilleroOcupadoError.class)
    public void test01UnCasilleroOcupadoNoDeberiaPoderSerOcupado(){
        Casillero casillero = new Casillero();
        casillero.aniadirElemento(new MaderaProxy());
        casillero.aniadirElemento(new MaderaProxy());
    }
}

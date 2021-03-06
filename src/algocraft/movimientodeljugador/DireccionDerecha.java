package algocraft.movimientodeljugador;

import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;

public class DireccionDerecha extends Direccion{
    public DireccionDerecha(Mapa unMapa) {
        super(unMapa);
    }
    @Override
    public void realizarMovimiento(Jugador unJugador, int columna, int fila) {
        moverJugadorA(unJugador, columna+1,fila);
        mapa.eliminarElementoEnPosicion(columna,fila);
    }

    @Override
    public void actualizarUbicacion(UbicacionJugador ubicacionJugador) {
        ubicacionJugador.actualizarUbicacion(this);
    }

    @Override
    public String vista(String mirando) {
        return "derecha";
    }
}

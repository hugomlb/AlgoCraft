package algocraft.mapadejuego;

import algocraft.Observable;

public class Casillero {

    private EstadoCasillero estado;
    private Observable colocable;

    public Casillero(){
        estado = new CasilleroLibre();
    }
    public void aniadirElemento(Observable colocable){
        estado.validarAgregacion();
        this.colocable = colocable;
        estado = new CasilleroOcupado();
    }

    public void eliminarElemento() {
        colocable = null;
        estado = new CasilleroLibre();
    }
    public String darNombre(){
        return estado.darNombreDe(colocable);
    }

    public String getId(){
        return colocable.getId();
    }

    public Observable getObservable(){
        return colocable;
    }
}
 

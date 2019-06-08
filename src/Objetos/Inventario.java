package Objetos;

import java.util.ArrayList;
import java.util.List;
import Objetos.Herramienta;

public class Inventario {
    private List<Herramienta> herramientas;
    public Inventario(){
        herramientas = new ArrayList<>();
    }
    public void aniadirHerramienta(Herramienta unaHerramienta){
        herramientas.add(unaHerramienta);
    }
}

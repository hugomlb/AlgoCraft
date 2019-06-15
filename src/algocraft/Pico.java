package algocraft;

public class Pico extends Herramienta {
    public Pico(MaterialDeConstruccion unMaterialDeConstruccion) {
        fortaleza = new FortalezaPico();
        aguante = new AguantePico();
        unMaterialDeConstruccion.inicializar(fortaleza);
        unMaterialDeConstruccion.inicializar(aguante);
    }
}

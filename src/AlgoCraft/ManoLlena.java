package AlgoCraft;

public class ManoLlena implements EstadoMano{
    Herramienta herramienta;
    public ManoLlena(Herramienta unaHerramienta) {
    this.herramienta = unaHerramienta;
    }

    @Override
    public void golpear(Material unMaterial) {
        unMaterial.serGolpeadaPor(this.herramienta);
    }

    @Override
    public void guardarHerramientaEn(Inventario unInventario) {
        unInventario.aniadirHerramienta(this.herramienta);
    }
}
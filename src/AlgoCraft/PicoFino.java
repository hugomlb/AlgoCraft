package AlgoCraft;

public class PicoFino extends Herramienta{

    private Material material;

    public PicoFino(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        EstrategiaDeConstruccion estrategiaDeConstruccion = unMaterial.estrategiaDeConstruccion();
        this.durabilidad = estrategiaDeConstruccion.durabilidadDeConstruccion(this);
        this.fuerza = estrategiaDeConstruccion.fuerzaDeConstruccion(this);
        this.desgaste = estrategiaDeConstruccion.desgasteDeConstruccion(this);
    }
    @Override
    public void golpear(Material material) {

    }

    @Override
    public boolean esUnHacha() {
        return false;
    }

    @Override
    public boolean esUnPico() {
        return false;
    }

    @Override
    public boolean esUnPicoFino() {
        return true;
    }

}
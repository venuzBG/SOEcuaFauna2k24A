package BusinessLogic.Entities.SOTipoAlimentacion;

public abstract class SOAlimento {
    protected String tipo;
    @Override
    public String toString(){
        return "[tipo=" + tipo + "]";
    }
}

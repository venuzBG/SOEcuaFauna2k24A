package BusinessLogic.Entities.SOTipoHormiga;

public abstract class SOHormiga {
    protected String tipo;
    @Override
    public String toString(){
        return "[tipo=" + tipo + "]";
    }
}

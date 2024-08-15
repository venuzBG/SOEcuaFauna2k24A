package DataAccess.DTO;

public class HormigaDTO {
    private Integer IdHormiga;
    private Integer TipoHormiga;
    private Integer Localidad;
    private Integer Sexo;
    private Integer IngestaNativa;
    private Integer GenoAlimento;
    private String  Estado;
    private String  FechaCreacion;
    private String  FechaModifica;

    public HormigaDTO(){}

    public HormigaDTO(Integer idHormiga, Integer tipoHormiga, Integer localidad, Integer sexo, Integer ingestaNativa,
            Integer genoAlimento, String estado, String fechaCreacion, String fechaModifica) {
        this.IdHormiga = idHormiga;
        this.TipoHormiga = tipoHormiga;
        this.Localidad = localidad;
        this.Sexo = sexo;
        this.IngestaNativa = ingestaNativa;
        this.GenoAlimento = genoAlimento;
        this.Estado = estado;
        this.FechaCreacion = fechaCreacion;
        this.FechaModifica = fechaModifica;
    }
    public Integer getIdHormiga() {
        return IdHormiga;
    }
    public void setIdHormiga(Integer idHormiga) {
        IdHormiga = idHormiga;
    }
    public Integer getTipoHormiga() {
        return TipoHormiga;
    }
    public void setTipoHormiga(Integer tipoHormiga) {
        TipoHormiga = tipoHormiga;
    }
    public Integer getLocalidad() {
        return Localidad;
    }
    public void setLocalidad(Integer localidad) {
        Localidad = localidad;
    }
    public Integer getSexo() {
        return Sexo;
    }
    public void setSexo(Integer sexo) {
        Sexo = sexo;
    }
    public Integer getIngestaNativa() {
        return IngestaNativa;
    }
    public void setIngestaNativa(Integer ingestaNativa) {
        IngestaNativa = ingestaNativa;
    }
    public Integer getGenoAlimento() {
        return GenoAlimento;
    }
    public void setGenoAlimento(Integer genoAlimento) {
        GenoAlimento = genoAlimento;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFechaNacimiento() {
        return FechaCreacion;
    }
    public void setFechaNacimiento(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
    public String getFechaModifica() {
        return FechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }

    @Override
    public String toString(){
        return  "  \n" + getClass().getName()
                + "\n IdHormiga      "+ getIdHormiga()
                + "\n IdHormiga          "+ getClave()
                + "\n Localidad          "+ getClave()
                + "\n Sexo               "+ getClave()
                + "\n IngestaNativa      "+ getClave()
                + "\n GenoAlimento       "+ getClave()
                + "\n Estado             "+ getEstado()
                + "\n fechaCreacion      "+ getFechaCreacion()
                + "\n fechaModifica      "+ getFechaModifica();
    }
}

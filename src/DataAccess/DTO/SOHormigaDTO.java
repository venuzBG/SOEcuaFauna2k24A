package DataAccess.DTO;

public class SOHormigaDTO {
    private Integer soIdHormiga;
    private Integer soTipoHormiga;
    private Integer soLocalidad;
    private Integer soSexo;
    private Integer soIngestaNativa;
    private Integer soGenoAlimento;
    private String  soEstado;
    private String  soFechaCreacion;
    private String  soFechaModifica;

    public SOHormigaDTO(Integer soIdHormiga, Integer soTipoHormiga, Integer soLocalidad, Integer soSexo,
            Integer soIngestaNativa, Integer soGenoAlimento, String soEstado, String soFechaCreacion,
            String soFechaModifica) {
        this.soIdHormiga = soIdHormiga;
        this.soTipoHormiga = soTipoHormiga;
        this.soLocalidad = soLocalidad;
        this.soSexo = soSexo;
        this.soIngestaNativa = soIngestaNativa;
        this.soGenoAlimento = soGenoAlimento;
        this.soEstado = soEstado;
        this.soFechaCreacion = soFechaCreacion;
        this.soFechaModifica = soFechaModifica;
    }



    public Integer getSoIdHormiga() {
        return soIdHormiga;
    }



    public void setSoIdHormiga(Integer soIdHormiga) {
        this.soIdHormiga = soIdHormiga;
    }



    public Integer getSoTipoHormiga() {
        return soTipoHormiga;
    }



    public void setSoTipoHormiga(Integer soTipoHormiga) {
        this.soTipoHormiga = soTipoHormiga;
    }



    public Integer getSoLocalidad() {
        return soLocalidad;
    }



    public void setSoLocalidad(Integer soLocalidad) {
        this.soLocalidad = soLocalidad;
    }



    public Integer getSoSexo() {
        return soSexo;
    }



    public void setSoSexo(Integer soSexo) {
        this.soSexo = soSexo;
    }



    public Integer getSoIngestaNativa() {
        return soIngestaNativa;
    }



    public void setSoIngestaNativa(Integer soIngestaNativa) {
        this.soIngestaNativa = soIngestaNativa;
    }



    public Integer getSoGenoAlimento() {
        return soGenoAlimento;
    }



    public void setSoGenoAlimento(Integer soGenoAlimento) {
        this.soGenoAlimento = soGenoAlimento;
    }



    public String getSoEstado() {
        return soEstado;
    }



    public void setSoEstado(String soEstado) {
        this.soEstado = soEstado;
    }



    public String getSoFechaCreacion() {
        return soFechaCreacion;
    }



    public void setSoFechaCreacion(String soFechaCreacion) {
        this.soFechaCreacion = soFechaCreacion;
    }



    public String getSoFechaModifica() {
        return soFechaModifica;
    }



    public void setSoFechaModifica(String soFechaModifica) {
        this.soFechaModifica = soFechaModifica;
    }



    public SOHormigaDTO(){}



    @Override
    public String toString(){
        return  "  \n" + getClass().getName()
                + "\n soIdHormiga          "+ getSoIdHormiga()
                + "\n IdHormiga          "+ getSoIdHormiga()
                + "\n Localidad          "+ getSoLocalidad()
                + "\n Sexo               "+ getSoSexo()
                + "\n IngestaNativa      "+ getSoIngestaNativa()
                + "\n GenoAlimento       "+ getSoGenoAlimento()
                + "\n Estado             "+ getSoEstado()
                + "\n fechaCreacion      "+ getSoFechaCreacion()
                + "\n fechaModifica      "+ getSoFechaModifica();
    }
}

package py.una.pol.sd.dto;

public class RespuestaDTO {

    private Long codigo;

    private String mensaje;


    public RespuestaDTO(){
      // TODO document why this constructor is empty
    }
    

    public RespuestaDTO(Long codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }


    public Long getCodigo() {
        return codigo;
    }

    public String getMensaje() {
        return mensaje;
    }


    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


}

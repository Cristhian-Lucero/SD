package py.una.pol.sd.dto;

public class PersonaDTO {

    private Long cedula;

    private String nombre;

    private String apellido;

    public PersonaDTO(){
      // TODO document why this constructor is empty
    }
    

    public PersonaDTO(Long cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }




    @Override
    public String toString() {
        return "PersonaDTO [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }


    public Long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}

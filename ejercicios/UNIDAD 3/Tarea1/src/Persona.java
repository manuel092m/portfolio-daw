public class Persona {


    private String nombre, apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public boolean esAdolescente(){
        if (edad>12 && edad<20){
            return true;
        }else return false;
    }

    public String getFullName (){

        if (nombre.isEmpty() && apellido.isEmpty()){
            return "";
        }
        if (apellido.isEmpty()){
            return nombre;
        }
        if (nombre.isEmpty()){
            return apellido;
        }
        return nombre+" "+apellido;
    }
}

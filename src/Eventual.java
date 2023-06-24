public class Eventual extends Trabajador implements Corredora{

    private String disponibilidad;
    private String correo_electronico;


    public Eventual(String nombres, String apellidos, String run, String telefono, int edad, String disponibilidad, String correo_electronico) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correo_electronico = correo_electronico;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disponibilidad: " + disponibilidad + '\n' +
                "Correo Electrónico: " + correo_electronico);
    }
}


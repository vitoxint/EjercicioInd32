public class Contratado extends Trabajador implements Corredora{

    private String fecha_ingreso;
    private int salario_mensual;


    public Contratado()  {
    }

    public Contratado(  String nombres , String apellidos , String run ,  String telefono , int edad ,
                        String fecha_ingreso, int salario_mensual) {
        super(nombres , apellidos , run , telefono , edad );
        this.fecha_ingreso = fecha_ingreso;
        this.salario_mensual = salario_mensual;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(int salario_mensual) {
        this.salario_mensual = salario_mensual;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Fecha Ingreso: " + fecha_ingreso + '\n' +
                "Salario mensual: " + salario_mensual );
    }
}


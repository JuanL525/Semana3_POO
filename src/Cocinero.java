public class Cocinero{
    public String nombre;
    public int experiencia;
    public String especialidad;

    public Cocinero(String nombre, int experiencia, String especialidad){
        this.nombre=nombre;
        this.experiencia=experiencia;
        this.especialidad=especialidad;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Especialidad: " + especialidad);

        System.out.println("--------------------");
    }

}

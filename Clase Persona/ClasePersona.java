public class ClasePersona {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setTelefono("3006201902");
        persona.setNombre("Ruben Agudelo Alzate");

        String Nombre = persona.getNombre();
        System.out.println("Nombre: " + Nombre);

        String Telefono = persona.getTelefono();
        System.out.println("Telefono: " + Telefono);

        int Edad = persona.getEdad();
        System.out.println("Edad: " + Edad);

    }
}

class Persona {
    private int Edad;
    private String Telefono;
    private String Nombre;

    //Set-Get Edad
    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public int getEdad() {
        return this.Edad;
    }

    //Set-Get Telefono
    public void setTelefono(String telefono){this.Telefono = telefono;}

    public String getTelefono() {return this.Telefono;}

    //Set-Get Nombre
    public void setNombre(String nombre){this.Nombre = nombre;}

    public String getNombre() {return this.Nombre;}
}

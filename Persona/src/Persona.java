public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad () {
        return edad;
    }
    public void  setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}
class Cliente extends Persona {
    private float credito;
    public Cliente(int edad, String nombre, String telefono, float credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void setCredito (float credito) {
        this.credito = credito;
    }
    public float getCredito(){
        return credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(22, "Ruben Agudelo Alzate", "300489152", 10);

        System.out.println("Edad: "+ (cliente.getEdad()));
        System.out.println("Nombre: "+ (cliente.getNombre()));
        System.out.println("Telefono: "+ (cliente.getTelefono()));
        System.out.println("Credito: "+ (cliente.getCredito()));

        Trabajador trabajador = new Trabajador(35, "Andres Felipe Cano", "3124789327", 10000);

        System.out.println("Edad: "+ (trabajador.getEdad()));
        System.out.println("Nombre: "+ (trabajador.getNombre()));
        System.out.println("Telefono: "+ (trabajador.getTelefono()));
        System.out.println("Salario: "+ (trabajador.getSalario()));
    }
}






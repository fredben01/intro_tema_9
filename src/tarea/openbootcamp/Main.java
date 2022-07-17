package tarea.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Freddy");
        cliente.setTelefono("987654321");
        cliente.setCredito(2000);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(50);
        trabajador.setNombre("Pepe");
        trabajador.setTelefono("112233445");
        trabajador.setSalario(6000);

        System.out.println("El cliente: {"
                + cliente.getEdad()
                + ", "  + cliente.getNombre()
                + ", " + cliente.getTelefono()
                + ", " + cliente.getCredito()
                +"}");

        System.out.println("El trabajador: {"
                + trabajador.getEdad()
                + ", "  + trabajador.getNombre()
                + ", " + trabajador.getTelefono()
                + ", " + trabajador.getSalario()
                +"}");

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
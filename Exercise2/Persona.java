package Exercise2;

public class Persona {

    private int edad;

    private boolean sexo;

    public Persona() {

    }

    public Persona (int edad, boolean sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}

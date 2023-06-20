public class Hijo extends Padre{
    int edad;
    String contextura;

    public Hijo(){
        super();
    }
    public Hijo(String cabello, String ojos, String etnia, float estatura, String rasgos, String caracter, int edad, String contextura) {
        super(cabello, ojos, etnia, estatura, rasgos, caracter);
        this.edad = edad;
        this.contextura = contextura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }
}


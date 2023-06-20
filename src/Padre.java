public class Padre extends Abuelo{
    float estatura;
    String rasgos;
    String caracter;

    public Padre(){
        super();
    }

    public Padre(String cabello, String ojos, String etnia, float estatura, String rasgos, String caracter) {
        super(cabello, ojos, etnia);
        this.estatura = estatura;
        this.rasgos = rasgos;
        this.caracter = caracter;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    public void imprimirPadre(){
        System.out.println("Este el padre");
    }
}



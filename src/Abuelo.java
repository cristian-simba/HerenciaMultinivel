public class Abuelo {
    String cabello;
    String ojos;
    String etnia;

    public Abuelo() {
    }
    public Abuelo(String cabello, String ojos, String etnia) {
        this.cabello = cabello;
        this.ojos = ojos;
        this.etnia = etnia;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
    public void imprimirAbuelo(){
        System.out.println("Este el abuelo");
    }
}

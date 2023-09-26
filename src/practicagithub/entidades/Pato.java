package practicagithub.entidades;

public class Pato {
    ///modificanfo desde dev/mar
    
    private String color;
    private String raza;

    public Pato() {
    }

    public Pato(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Pato{" + "color=" + color + ", raza=" + raza + '}';
    }
    
    
            
}

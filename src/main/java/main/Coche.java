package main;

public class Coche {
    private String marca;

    private String modelo;

    private String color;

    private int velocidad;

    public Coche(String marca, String modelo, String color, int velocidadMaxima) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMaxima() {
        return velocidad;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidad = velocidadMaxima;
    }
    
    public void acelerar(){
        velocidad = velocidad + 50;
        System.out.println("Brrruuuuuummmmmm");
    }

}

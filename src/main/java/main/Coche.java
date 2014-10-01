package main;

public class Coche {
    private String marca;

    private String modelo;

    private String color;

    private int velocidad;
    
    private int aceleracion;
    
   

    private String matricula;

    public Coche(String marca, String modelo, String color, int velocidad) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    
    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        aceleracion = aceleracion + 5;
        System.out.println("Brrruuuuuummmmmm");
    }
    
    public void frenar(){
        this.velocidad = 0;
        System.out.println("Frenazo");
    }
    
    public void derrape(){
        System.out.println("Derrapando");
    }
    
    public void mostrarMatricula(){
        System.out.println(this.matricula);
    }

}

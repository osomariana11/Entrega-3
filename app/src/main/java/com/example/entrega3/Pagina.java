package com.example.entrega3;

public class Pagina {

    private String nombre;
    private String edad;
    private int image;

    private String mensaje;



    public Pagina(String nombre, String edad, String mensaje, int image) {
        this.nombre = nombre;
        this.edad = edad;
        this.mensaje = mensaje;
        this.image = image;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

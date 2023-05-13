package com.example.proyectosegundotrimestre;

public class Alumno {
    private final int MAXIMO_HORAS = 300;

    private int horasModulos = 0;
    private String nombre;
    private String apellidos;
    private String nif;
    private String codigoPostal;
    private String correoElectronico;

    public Alumno(int horasModulos, String nombre, String apellidos, String nif, String codigoPostal, String correoElectronico) {
        this.horasModulos = horasModulos;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.codigoPostal = codigoPostal;
        this.correoElectronico = correoElectronico;
    }

    public Alumno() {
    }

    public int getHorasModulos() {
        return horasModulos;
    }

    public void setHorasModulos(int horasModulos) {
        this.horasModulos = horasModulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean comprobarHoras(){
        boolean horasValidas = false;
        if(getHorasModulos()<=MAXIMO_HORAS){
            horasValidas=true;
        }
        return horasValidas;
    }
}

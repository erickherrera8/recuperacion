/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 */
public class Persona {

    private int id;
    private String cedula;
    private String nombresCompletos;

    public Persona(int id, String cedula, String nombresCompletos) {
        this.id = id;
        this.cedula = cedula;
        this.nombresCompletos = nombresCompletos;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombresCompletos() {
        return nombresCompletos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombresCompletos(String nombresCompletos) {
        this.nombresCompletos = nombresCompletos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombresCompletos='" + nombresCompletos + '\'' +
                '}';
    }
}


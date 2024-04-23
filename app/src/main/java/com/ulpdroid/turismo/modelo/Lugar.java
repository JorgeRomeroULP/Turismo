package com.ulpdroid.turismo.modelo;

import java.io.Serializable;

public class Lugar implements Serializable {
    private String nombre;
    private int horario;
    private int descripcion;
    private int rvFoto;
    private int itemFotoA;
    private int itemFotoB;
    private int itemFotoC;

    public Lugar(String nombre, int horario, int descripcion, int rvFoto, int itemFotoA, int itemFotoB, int itemFotoC) {
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
        this.rvFoto = rvFoto;
        this.itemFotoA = itemFotoA;
        this.itemFotoB = itemFotoB;
        this.itemFotoC = itemFotoC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getRvFoto() {
        return rvFoto;
    }

    public void setRvFoto(int rvFoto) {
        this.rvFoto = rvFoto;
    }

    public int getItemFotoA() {
        return itemFotoA;
    }

    public void setItemFotoA(int itemFotoA) {
        this.itemFotoA = itemFotoA;
    }

    public int getItemFotoB() {
        return itemFotoB;
    }

    public void setItemFotoB(int itemFotoB) {
        this.itemFotoB = itemFotoB;
    }

    public int getItemFotoC() {
        return itemFotoC;
    }

    public void setItemFotoC(int itemFotoC) {
        this.itemFotoC = itemFotoC;
    }
}

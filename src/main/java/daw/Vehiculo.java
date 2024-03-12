/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author aiman
 */
public class Vehiculo {
    private String fabricante ;
    private String modelo;
    private int año;
    private String bastidor;
    private String color;
    private String licencia;

    public Vehiculo(String fabricante, String modelo, int año, String bastidor, String color, String licencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año = año;
        this.bastidor = bastidor;
        this.color = color;
        this.licencia = licencia;
    }

    public Vehiculo() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.fabricante);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + this.año;
        hash = 59 * hash + Objects.hashCode(this.bastidor);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.licencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.año != other.año) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return Objects.equals(this.licencia, other.licencia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("fabricante=").append(fabricante);
        sb.append(", modelo=").append(modelo);
        sb.append(", año=").append(año);
        sb.append(", bastidor=").append(bastidor);
        sb.append(", color=").append(color);
        sb.append(", licencia=").append(licencia);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

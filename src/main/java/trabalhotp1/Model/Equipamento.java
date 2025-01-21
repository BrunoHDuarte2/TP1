/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Model;

import java.io.Serializable;

/**
 *
 * @author bhdbr
 */
public class Equipamento implements Serializable{
    private static final long serialVersionUID = 4002096859286734082L;
    private String nome;
    private int id;
    private String modelo;
    private Estado estado;

    public Equipamento(String nome, int id, String modelo, Estado estado) {
        this.nome = nome;
        this.id = id;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    
}

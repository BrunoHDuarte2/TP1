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

    public Equipamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

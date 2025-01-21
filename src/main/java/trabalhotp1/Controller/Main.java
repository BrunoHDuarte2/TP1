/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Estado;

/**
 *
 * @author bhdbr
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        AcessoBancoDeDados banco = new AcessoBancoDeDados();
        banco.criarEquipamento(new Equipamento("Mixer", 1, "AR15", Estado.INSTALADO));
        banco.criarEquipamento(new Equipamento("Blender", 2, "AR15", Estado.INSTALADO));
    }
}


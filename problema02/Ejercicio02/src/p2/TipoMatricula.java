/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> lista;

    public void establecerListaMatriculas(ArrayList<Matricula> lis) {
        lista = lis;
    }

    public ArrayList<Matricula> obtenerLista (){
    
    return lista;
    }
    public void establecerPromedioTarifas() {
        double s = 0;
        for (int i = 0; i < lista.size(); i++) {
            s += lista.get(i).obtenerTarifa();
        }
        promedioMatriculas = s/lista.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

}

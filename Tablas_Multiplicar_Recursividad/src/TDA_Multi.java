/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class TDA_Multi {
    int resul,num=0;
    String cadena;
    public void multiplicar(int n1, int multip){
		if(multip>=1){
                   multiplicar(n1, multip-1);
                   resul=n1+num;
                   num=resul;
		}
		cadena+=("\n"+n1+"x"+multip+"="+(resul));
	}
}

package org.blc.training.base;

/**
 *
 * @author blondel.sita
 */
public class VolumeCube {

    public static void main(String[] args) {

        float longeur = Float.valueOf(args[0]);
        float largeur = Float.valueOf(args[1]);
        float hauteur = Float.valueOf(args[2]);
        float volume = longeur * largeur * hauteur;
        System.out.println("volume de(" + longeur + "" + largeur + "" + hauteur + ") = " + volume);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jbuffeteau
 */
public class Activite
{
    private int numero;
    private String libelle;
    
    public Activite(int n,String name)
    {
        numero = n;
        libelle = name;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }
}

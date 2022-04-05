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
public class Formation 
{
    private String code;
    private int numActivite;
    private String intitule;
    
    public Formation(String cd,int numero,String name)
    {
        code = cd;
        numActivite = numero;
        intitule = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the numActivite
     */
    public int getNumActivite() {
        return numActivite;
    }

    /**
     * @return the intitule
     */
    public String getIntitule() {
        return intitule;
    }
}

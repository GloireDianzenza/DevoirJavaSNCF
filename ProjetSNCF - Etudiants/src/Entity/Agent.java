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
public class Agent 
{
   private String code;
   private String nom;
   private String prenom;
   
   public Agent(String cd,String n,String p)
   {
       code = cd;
       nom = n;
       prenom = p;
   }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }
}

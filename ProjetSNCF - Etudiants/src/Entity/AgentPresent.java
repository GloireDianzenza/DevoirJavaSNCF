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
public class AgentPresent
{
   private String code;
   private String nom;
   private String prenom;
   private int present;
   private boolean pr;
   
   public AgentPresent(String cd,String n,String p,int pre)
   {
       code = cd;
       nom = n;
       prenom = p;
       present = pre;
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

    /**
     * @return the pr
     */
    public boolean isPresent() {
        if(present == 1)
        {
            pr = true;
        }
        else
        {
            pr = false;
        }
        return pr;
    }
}

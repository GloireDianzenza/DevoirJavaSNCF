/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Activite;
import Entity.Agent;
import Entity.AgentPresent;
import Entity.Formation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbuffeteau
 */
public class FonctionsMetier
{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cnx;
    
    public FonctionsMetier()
    {
        cnx = ConnexionBDD.getCnx();
    }

    public ArrayList<Activite> GetAllActivites()
    {
        ArrayList<Activite> lesActivites = new ArrayList<>();
        try
        {
            ps = cnx.prepareStatement("SELECT numero,libelle FROM activite");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Activite ac = new Activite(rs.getInt(1), rs.getString(2));
                lesActivites.add(ac);
            }
        } catch(SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lesActivites;
    }

    public ArrayList<Formation> GetAllFormationsByIdActivite(int idActivite)
    {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        try
        {
            ps = cnx.prepareStatement("SELECT code,numeroActivite,intitule FROM formation WHERE numeroActivite = '"+idActivite+"'");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Formation f = new Formation(rs.getString(1), rs.getInt(2), rs.getString(3));
                lesFormations.add(f);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return lesFormations;    
    }

    public ArrayList<AgentPresent> GetAllAgentsInscritsFormation(String idFormation)
    {
        ArrayList<AgentPresent> lesAgents = new ArrayList<>();
        try
        {
            ps = cnx.prepareStatement("SELECT code,nom,prenom,inscription.presence FROM agent JOIN inscription ON agent.code = inscription.codeAgent WHERE inscription.numeroFormation = '"+idFormation+"'");
            rs = ps.executeQuery();
            while(rs.next())
            {
                AgentPresent a = new AgentPresent(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                lesAgents.add(a);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesAgents;    
    }

    public ArrayList<Agent> GetAllAgentsNonInscritsFormation(String idFormation)
    {
        ArrayList<Agent> lesAgents = new ArrayList<>();
        try
        {
            ps = cnx.prepareStatement("SELECT code,nom,prenom FROM agent WHERE code NOT IN (SELECT code FROM agent JOIN inscription ON agent.code = inscription.codeAgent WHERE inscription.numeroFormation = '"+idFormation+"')");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Agent a = new Agent(rs.getString(1),rs.getString(2),rs.getString(3));
                lesAgents.add(a);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesAgents;   
    }

    public void InsererInscription(String idFormation, String idAgent) 
    {
        try
        {
            ps = cnx.prepareStatement("INSERT INTO inscription VALUES ('"+idFormation+"','"+idAgent+"',0)");
            ps.executeUpdate();
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ModifierPresence(String idFormation, String idAgent, boolean present)
    {
        int presence;
        try
        {
            if(present)
            {
                presence = 1;
            }
            else
            {
                presence = 0;
            }
            ps = cnx.prepareStatement("UPDATE inscription SET presence = '"+presence+"' WHERE numeroFormation = '"+idFormation+"' AND codeAgent = '"+idAgent+"'");
            ps.executeUpdate();
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Formation> GetAllFormations()
    {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        try
        {
            ps = cnx.prepareStatement("SELECT code,numeroActivite,intitule FROM formation");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Formation form = new Formation(rs.getString(1), rs.getInt(2), rs.getString(3));
                lesFormations.add(form);
            }
        } catch(SQLException ex)
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lesFormations;   
    }
}

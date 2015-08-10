/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author T-107
 */
public class DAOTarjeta {
    
    private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    
    public DAOTarjeta(){
        fac= HibernateUtilidades.getSessionFactory();
        ses= fac.openSession();
        tranza=ses.beginTransaction();
        
    }
    
    
    public void cerrarSesionT(){
        tranza.commit();
        ses.close();
    }
    
    public void guardarT(Tarjeta T) throws Exception{
        
        ses.save(T);
        cerrarSesionT();
        
    }
    
    public ArrayList<Tarjeta> buscarTodosT() throws Exception{
        Criteria cri=ses.createCriteria(Tarjeta.class);
        ArrayList<Tarjeta> gastos=(ArrayList<Tarjeta>) cri.list();
        cerrarSesionT();
        return gastos;
    }
    
    
      public  void actualizarT(Tarjeta T)throws Exception{
        ses.update(T);
        cerrarSesionT();
    }
      
      public void borrarT(Tarjeta T)throws Exception{
           ses.delete(T);
           cerrarSesionT();
       }
      
      public Tarjeta buscarPorIdT(Integer id)throws Exception{
         Tarjeta T=(Tarjeta) ses.createCriteria(Tarjeta.class).add(Restrictions.idEq(id)).uniqueResult();
           
        return T;
        
    }
}

      
  
//AXEL
package org.unitec.maven;

/**
 *
 * @author T-107
 */

public class LeerMySQL implements Leer{

    @Override
    public String leer() throws Exception {
        //aqui va hibernate.
       String mensajito="***** Conectado a My-SQL*****";
       return mensajito;
    }
    
}

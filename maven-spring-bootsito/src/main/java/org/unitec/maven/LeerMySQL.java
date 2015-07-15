
package org.unitec.maven;

/**
 *
 * @author T-107
 */
public class LeerMySQL implements Leer{

    @Override
    public String leer() throws Exception {
    //Aqui va hibernate tect etc
        String mensajito = "conectado a mysql";
        return mensajito;
    }
    
}

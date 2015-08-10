
package org.unitec.maven;

//Se enlazan los beans
//AXEL

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBasica {
    @Bean
    Leer servicioleer(){
        Leer leer=new LeerMySQL();
    //inyeccion
        return leer;
    }
    
}
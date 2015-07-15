
package org.unitec.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T-107
 */


@Configuration

public class ConfiguracionBasica {
    //generar bin que se llamara igual (Leer)
    @Bean
    Leer servicioLeer(){
      Leer leer = new  LeerMySQL();
      return leer;
        
    }
    
}


package org.unitec.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T-107
 */


@Controller
@RequestMapping("/")
public class ControladorLeer {
    //cada servicio es un metodo
    @RequestMapping(value="/leer", method = RequestMethod.GET, headers = {"Accept=text/html"})
    @ResponseBody String leer () throws Exception{
        return "aqui vamos a mostrar el servicio leer que hicimos ya";
    }
    
    
}

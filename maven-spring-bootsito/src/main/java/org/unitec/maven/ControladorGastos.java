//PROYECTO FINAL
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A-X-E-L
 */
@RestController
@RequestMapping("/")

public class ControladorGastos {
    @RequestMapping(value="/gastos", method=RequestMethod.GET,
    headers={"Accept=application/json"})
    @ResponseBody ArrayList<Gastos> obtenerTodos()throws Exception{
    DAOGastos dao=new DAOGastos();
    return  dao.buscarTodos();     
    }
    
    
    @RequestMapping(value="/gastos/{tarjetaId}/{concepto}/{fecha}/{cantidad}",
    method=RequestMethod.POST,
    headers={"Accept=text/html"})
    
    @ResponseBody String guardarGasto(@PathVariable Integer tarjetaId,
    @PathVariable String concepto,
    @PathVariable Date fecha, @PathVariable Float cantidad )throws Exception{
        
    DAOGastos dao=new DAOGastos();
    Gastos g=new Gastos();
    g.setIdTarjeta(new Tarjeta(tarjetaId));
    g.setCantidad(cantidad);
    g.setFecha(fecha);
    g.setConcepto(concepto);
    dao.guardar(g);
    return "Se guardo correctamente elgasto";
     }
    
    
    @RequestMapping(value="/gastos/{gastosId}/{tarjetaId}/{concepto}/{fecha}/{cantidad}",
    method=RequestMethod.PUT,
    headers={"Accept=text/html"})
    @ResponseBody String actualizarGasto(@PathVariable Integer gastosId,@PathVariable Integer tarjetaId,
    @PathVariable String concepto,
    @PathVariable String fecha, @PathVariable Float cantidad )throws Exception{
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    DAOGastos dao=new DAOGastos();
    Gastos g=new Gastos();
    
    g.setIdTarjeta(new Tarjeta(tarjetaId));
    g.setIdGastos(gastosId);
    g.setCantidad(cantidad);
    g.setFecha(formatter.parse(fecha));
    g.setConcepto(concepto);
    dao.actualizar(g);
    
    return "Se actualizo el gasto correctamente.";
                }
    @RequestMapping(value="/gastos/{gastosId}/{tarjetaId}/{concepto}/{fecha}/{cantidad}",
    method=RequestMethod.DELETE,
   headers={"Accept=text/html"})
    @ResponseBody String borrarGasto(@PathVariable Integer gastosId,@PathVariable Integer tarjetaId,
    @PathVariable String concepto,
    @PathVariable String fecha, @PathVariable Float cantidad )throws Exception{
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    DAOGastos dao=new DAOGastos();
    Gastos g=new Gastos();
    g.setIdTarjeta(new Tarjeta(tarjetaId));
    g.setIdGastos(gastosId);
    g.setCantidad(cantidad);
    g.setFecha(formatter.parse(fecha));
    g.setConcepto(concepto);
    dao.borrar(g);
    
    return "Se realizo el borrado correctamente...";
               
    }
    }
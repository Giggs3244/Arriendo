/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_servicio;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Bryan
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    /**
     * Web service operation
     *
     * @param nombre
     * @param cuenta
     * @param valor
     * @return
     * @throws ClassNotFoundException
     */
    @WebMethod(operationName = "pagar")
    public String pagar(@WebParam(name = "nombre") String nombre, @WebParam(name = "cuenta") String cuenta, @WebParam(name = "valor") int valor) throws ClassNotFoundException {

        String mensaje = "";

        try {

            Conexion conexion = new Conexion();
            mensaje = conexion.Conexion(nombre, cuenta, valor);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

        return mensaje;
    }

}

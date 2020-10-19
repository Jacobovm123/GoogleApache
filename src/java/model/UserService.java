/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import webservice.DetalleFactura;
import webservice.Login;
import webservice.User;

/**
 *
 * @author jacob
 */
public class UserService {

    public String actualizar(int id, java.lang.String nombre, java.lang.String descripcion) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizar(id, nombre, descripcion);
    }

     public  String actualizarDF(int id, java.lang.String descripcion, java.lang.String nombre, java.lang.String nombrep, java.lang.String marca, java.lang.String cantidad, java.lang.String precio, java.lang.String total) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizarDF(id, descripcion, nombre, nombrep, marca, cantidad, precio, total);
    }

     public  boolean autenticacionLogin(java.lang.String usuario, java.lang.String pass) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.autenticacionLogin(usuario, pass);
    }

     public  java.util.List<webservice.DetalleFactura> dfListar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.dfListar();
    }

   public  User eliminar(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminar(id);
    }

     public  java.util.List<webservice.DetalleFactura> fDlistar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.fDlistar();
    }

     public  DetalleFactura fDlistarID(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.fDlistarID(id);
    }

     public  java.util.List<webservice.Factura> flistar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.flistar();
    }

     public  String ingresarLogin(java.lang.String nombre, java.lang.String apellido, java.lang.String usuario, java.lang.String pass, java.lang.String cargo) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.ingresarLogin(nombre, apellido, usuario, pass, cargo);
    }

     public  Login listarCargo(java.lang.String cargo) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarCargo(cargo);
    }

     public  Login listarCorreo(java.lang.String correo) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarCorreo(correo);
    }

     public  User listarID(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarID(id);
    }

         public  String agregar(java.lang.String nombre, java.lang.String descripcion) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregar(nombre, descripcion);
    }

     public  String agregardf(java.lang.String idFactura, java.lang.String idProducto, java.lang.String cantidad, java.lang.String precio) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregardf(idFactura, idProducto, cantidad, precio);
    }

     public  DetalleFactura deleteDF(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.deleteDF(id);
    }

     public  java.util.List<webservice.User> listar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String actualizarDF1(int id, int idFactura, int idProducto, java.lang.String cantidad, java.lang.String precio) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizarDF1(id, idFactura, idProducto, cantidad, precio);
    }
  
    
    
    
    
    
}

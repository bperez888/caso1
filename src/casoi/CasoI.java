/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoi;

import javax.swing.JOptionPane;

/**
 *
 * @author bren
 */
public class CasoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // solicitar datos
        String nombreCliente;
        int cedula;
        String codigoFactura;
        int montoFactura;
        String mes;
        
        
        nombreCliente = JOptionPane.showInputDialog("ingrese el nombre del cliente:");
        cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de cedula del cliente: ")) ;
        codigoFactura = JOptionPane.showInputDialog("ingrese el codigo de factura:");
        montoFactura = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto total de la factura"));
        mes = JOptionPane.showInputDialog("ingrese el mes correspondiente: "); 
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de facturas:"));
        double comisionTotal = 0;
        int puntosTotal = 0;
        
        // proces fact
        for (int i = 0; i < cantidadFacturas; i++) {
            double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese monto factura:"));
            int electricos = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de productos electricos:"));
            int automotrices = Integer.parseInt(JOptionPane.showInputDialog("ingtese cantidad de productos automotrices:"));
            int construccion = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de productos de construccion:"));
            
            double comisionFactura = 0;
            int puntosFactura = 0;

            // Calc comisiones, puntos
            if (electricos > 0 automotrices > 0  cnstruccion > 0  monto > 50000) {
                comisionFactura += monto * 0.10;
                puntosFactura += 3;
            }
            if (electricos >= 3) {
                comisionFactura += monto * 0.04;
                puntosFactura += 1;
            }
            if (automotrices > 4) {
                comisionFactura += monto * 0.04;
                puntosFactura += 1;
            }
            if (construccion > 0) {
                comisionFactura += monto * 0.08;
                puntosFactura += 2;
            }
            if (monto > 50000) {
                comisionFactura += monto * 0.05;
                puntosFactura += 1;
            }
            
            // Acumular comisiones y puntos
            comisionTotal += comisionFactura;
            puntosTotal += puntosFactura;
        }

        // datos finales
        System.out.println("vendedor: " + nombreCliente);
        System.out.println("codigo: " + codigoFactura);
        System.out.println("comision total: " + comisionTotal);
        System.out.println("puntos totales: " + puntosTotal);
        
        
      
    }
}
    
    


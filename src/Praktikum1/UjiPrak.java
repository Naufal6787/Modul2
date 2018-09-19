/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Naufal K D
 */
public class UjiPrak {
   public static void main(String[]args){
         // membuat objek busBesar dari class Bus
         
          Prak busBesar = new Prak(40);
         
          busBesar.getPenumpang(15);
          busBesar.getPenumpang(5);
          busBesar.getPenumpang(26);
          busBesar.getAverage();
       }
}

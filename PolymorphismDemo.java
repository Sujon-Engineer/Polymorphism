/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.simplegeometricobject;

/**
 *
 * @author sujon
 */
public class PolymorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    // TODO code application logic here
    displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
    displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    /** Display geometric object properties
        * @param object */
    public static void displayObject(SimpleGeometricObject object) {
    System.out.println("Created on " + object.getDateCreated() +". Color is " + object.getColor());
    }
}

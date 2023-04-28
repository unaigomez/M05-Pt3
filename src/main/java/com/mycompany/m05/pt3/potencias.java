/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m05.pt3;
import java.util.Scanner;
/**
 *
 * @author 28-12-20
 */
public class potencias {
    public int potencia(int a,int b) {
        int resultado = 1;
        for(int i=1; i<=b; i++){
            resultado *= a;
        }
        return resultado;
    }
}

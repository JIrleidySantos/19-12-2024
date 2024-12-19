/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.mavenproject1.clases;

/**
 *
 * @author mundo
 */
public class Cliente {
    protected float saldo;
    protected int nConsignaciones = 0;
    protected int nRetiros = 0;
    protected float tasaAnual;
    protected float comiMensual = 0;

    public Cliente(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
}

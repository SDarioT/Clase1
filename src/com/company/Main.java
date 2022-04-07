package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.printf("hola"+ " | ");

        var autoJuan = new Auto();
        autoJuan.color="amarillo";
        autoJuan.marca="chevrolet";
        autoJuan.year= 2014;
        autoJuan.placa="UBB 0102";
        autoJuan.precio= 5000;
        System.out.println(autoJuan.color+" | "+
                autoJuan.marca+" | "+
                autoJuan.year+" | "+
                autoJuan.precio+" | ");
        var esTaxi=false;
        esTaxi= autoJuan.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa "+autoJuan.placa+ " es un taxi");
        }else{
            System.out.println("El auto de placa "+autoJuan.placa+ " NO es un taxi");
        }
        System.out.println(" El auto de precio "+ autoJuan.precio+ " Debe pagar de tasa solidaria "+ autoJuan.calcularTasaSolidaria());

        var costoMatricula=10000d;
        costoMatricula=autoJuan.calcularMatricula(2010, 10000);
        System.out.println("Debe pagar "+costoMatricula+" USD por concepto de matrícula");

        System.out.println("El auto es de la provincia de: "+autoJuan.obtenerProbincia());

        var calcularYears = 2022;
        calcularYears=autoJuan.calcularYears(2022);
        System.out.printf("el auto tiene " +calcularYears +" años" +" | ");

        var sePuedeAsegurar = false;

        System.out.printf("el auto se puede asegurar " +"|" +sePuedeAsegurar +"|");

        var esProvinciaDe = false;
        System.out.printf(" es de la Provincia de: " +esProvinciaDe);

    }
}

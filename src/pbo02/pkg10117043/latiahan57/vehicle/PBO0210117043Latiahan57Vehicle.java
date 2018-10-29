/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latiahan57.vehicle;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latiahan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vehicle nVehicle1 = new vehicle();
        vehicle nVehicle2 = new vehicle();

        bicycle nBicycle = new bicycle();
        nVehicle1.setMyBrand("Trek Bike");
        nVehicle1.setMyModel("7.4FX");
        nBicycle.setMyGearCount(23);
        System.out.println("Brand : " + nVehicle1.getMyBrand());
        System.out.println("Model : " + nVehicle1.getMyModel());
        System.out.println("Jumlah Gear : " + nBicycle.getMyGearCount());
        System.out.println("");

        skateboard nSkateboard = new skateboard();
        nVehicle2.setMyBrand("Ally Skate");
        nVehicle2.setMyModel("Rocket");
        nSkateboard.setMyBoardLenght(54.5);
        System.out.println("Brand : " + nVehicle2.getMyBrand());
        System.out.println("Model : " + nVehicle2.getMyModel());
        System.out.println("Panjang Board : " + nSkateboard.getMyBoardLenght());
    }
    
}

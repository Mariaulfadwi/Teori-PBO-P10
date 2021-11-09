/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Manager extends Pegawai {
    private int tunjangan;

    public Manager(int tunjangan, String nama, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

   
    public int infoGaji (){
        return gaji;
    }
    public  int infoTunjangan (){
        return tunjangan;
    }
}

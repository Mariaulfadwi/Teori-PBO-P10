/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Bayaran {
    public int hitungBayaran(Pegawai peg){
        int uang = peg.infoGaji();
        if(peg instanceof Manager)
            uang+= ((Manager) peg).infoTunjangan();
        else if (peg instanceof Programmer)
            uang+= ((Programmer) peg).infoBonus();
        return uang;
    }
    
    public static void main(String[] args) {
        Manager man = new Manager(50, "Agus", 800);
        Programmer prog = new Programmer(30, "Budi", 600);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran Untuk Manajer : "+hr.hitungBayaran(man));
        System.out.println("Bayaran Untuk Programmer : "+hr.hitungBayaran(prog));
    }
}

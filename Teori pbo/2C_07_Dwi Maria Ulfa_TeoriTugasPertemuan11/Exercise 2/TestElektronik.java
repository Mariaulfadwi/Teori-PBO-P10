/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestElektronik {
    public static void main(String[] args){
        Manusia ulfa = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();
        
        ulfa.nyalakanPerangkat(tvjadul);
        ulfa.nyalakanPerangkat(tvmodern);
    }
}

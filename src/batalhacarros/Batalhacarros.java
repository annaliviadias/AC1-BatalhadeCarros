/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/  /*Main*/
package batalhacarros;

/**
 *
 * @author diaasnnna
 */
public class Batalhacarros {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //Instanciar um objeto do tipo Carro.
        Carros carro1 = new Carros("Eco Racer", " C ", 850);
        Carros carro2 = new Carros("Concept R", " A ", 870);
        Carros carro3 = new Carros("SVJ Roadstor", " B ", 1300);
        Carros carro4 = new Carros("F-Type", " D ", 447);

        int velocidadeCarro1 = carro1.getVelocidade();
        int velocidadeCarro2 = carro2.getVelocidade();
        int velocidadeCarro3 = carro3.getVelocidade();
        int velocidadeCarro4 = carro4.getVelocidade();

        //COMBATE 1: Eco Racer x Concept R
        System.out.println(" 1 Round");
        if (velocidadeCarro1 > velocidadeCarro2) {
            System.out.println(carro1.getModelo() + " é o mais veloz no 1 Round");
        } else {
            System.out.println(carro2.getModelo() + " é o mais veloz no 1 Round                                               ");
        }

        //COMBATE 2: SVJ Roadstor x F-Type
        System.out.println(" 2 Round"                                                     );
        if (velocidadeCarro3 > velocidadeCarro4) {
            System.out.println(carro3.getModelo() + " é o mais veloz no 2 Round");
        } else {
            System.out.println(carro4.getModelo() + " é o mais veloz no 2 Round                                                 ");
        }
        

        if (velocidadeCarro2 > velocidadeCarro3) {
            System.out.print(carro3.getModelo() + " é o perdedor");
        } else {
            System.out.println ("  " + carro4.getModelo() + " foi o Grande Campeão");
        }
        
    }
    
}

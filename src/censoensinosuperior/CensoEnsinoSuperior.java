/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censoensinosuperior;

/**
 *
 * @author elivelton
 */
public class CensoEnsinoSuperior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manipular manipula = new Manipular();
        manipula.lerArquivo("/home/elivelton/Documentos/Microdados Censo Ensino Superior Inep/2009/DADOS/teste2.txt");
    }

}

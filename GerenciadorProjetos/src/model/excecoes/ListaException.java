/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para as buscas/listagem
 * @extends A super classe Exception
 */
public class ListaException extends Exception{
    
    public ListaException(Exception e){
        super(e);
    }
    
    public ListaException(String msg){
        super(msg);
    } 

}

/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para da(s) busca(s)
 * @extends A super classe Exception
 */
public class BuscaException extends Exception{
    
    public BuscaException(Exception e){
        super(e);
    }
    
    public BuscaException(String msg){
        super(msg);
    } 
 
}

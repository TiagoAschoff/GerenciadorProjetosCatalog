/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para da(s) atualização(ões)
 * @extends A super classe Exception
 */
public class AtualizarException extends Exception{
    
    public AtualizarException(Exception e){
        super(e);
    }
    
    public AtualizarException(String msg){
        super(msg);
    } 

}

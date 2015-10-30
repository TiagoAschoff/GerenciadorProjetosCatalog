/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para do campo de cadastros dos CRUDs
 * @extends A super classe Exception
 */
public class CampoException extends Exception{
    
    public CampoException(Exception e){
        super(e);
    }
    
    public CampoException(String msg){
        super(msg);
    } 
}

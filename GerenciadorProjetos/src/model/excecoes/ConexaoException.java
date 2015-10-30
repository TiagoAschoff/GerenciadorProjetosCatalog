/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para da(s) conexão(ões)
 * @extends A super classe Exception
 */
public class ConexaoException extends Exception{
    
    public ConexaoException(Exception e){
        super(e);
    }
    
    public ConexaoException(String msg){
        super(msg);
    }

}

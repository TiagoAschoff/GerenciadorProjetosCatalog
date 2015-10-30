/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para as remoções
 * @extends A super classe Exception
 */
public class RemocaoException extends Exception{
	    
	    public RemocaoException(Exception e){
	        super(e);
	    }
	    
	    public RemocaoException(String msg){
	        super(msg);
	    }  
}

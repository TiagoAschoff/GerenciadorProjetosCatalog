/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção para as inserções
 * @extends A super classe Exception
 */
public class InsercaoException extends Exception{

	public InsercaoException(Exception e){
        super(e);
    }
    
    public InsercaoException(String msg){
        super(msg);
    } 
}

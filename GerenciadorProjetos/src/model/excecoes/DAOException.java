/**
 * 
 */
package model.excecoes;

/**
 * @author marcio
 * Classe responsável por representar a exceção dos DAOs 
 * @extends A super classe Exception
 */
public class DAOException extends Exception {
    
    public DAOException(Exception e){
        super(e);
    }
    
    public DAOException(String msg){
        super(msg);
    }

}

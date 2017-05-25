/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 *	 |_IDMVMANNKGE
 *
 *
 * 1 개요 	:
 * 2. 작성일 :  2017. 5. 25.
 * </pre>
 * 
 * @auther :  	suboum
 * @Versiion : 	1.0
 *
 */
public interface IDBManager {
    public static final String ORACLE_DATABASE = "ORACLE";
    public static final String SYBASE_DATABASE = "SYBASE";
    void insert();
    void search();
    void update();
    void delete();
    static IDBManager getDBObject(String database){
        IDBManager action = null;
        if(database.equals(ORACLE_DATABASE))
            action = new OracleDB();
        else if(database.equals(SYBASE_DATABASE))
            action = new SybaseDB();
        return action;
    }   
}
// $Id: PoolManagerCellInfo.java,v 1.2 2004-11-09 08:04:46 tigran Exp $
package diskCacheV111.poolManager ;

import  java.io.* ;
import  dmg.cells.nucleus.* ;

public class PoolManagerCellInfo
       extends CellInfo
       implements Serializable {


    private String [] _poolList = new String[0] ;

    private static final long serialVersionUID = -5064922519895537712L;

    PoolManagerCellInfo( CellInfo info ){
       super(info) ;
    }
    void setPoolList( String [] poolList ){
       _poolList = new String[poolList.length] ;
       System.arraycopy( poolList , 0 , _poolList , 0 , poolList.length);
    }
    public String [] getPoolList(){ return _poolList ; }

    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder() ;
       sb.append(super.toString()).append(" [") ;
        for (String pool : _poolList) {
            sb.append(pool).append(",");
        }
       sb.append("]");
       return sb.toString() ;
    }
}

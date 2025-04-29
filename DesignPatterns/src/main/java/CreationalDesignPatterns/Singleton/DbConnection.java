package CreationalDesignPatterns.Singleton;

public class DbConnection {

    private static DbConnection con;

    private DbConnection(){

    }
    /*
    // LAZY INITIALIZATION
    public static DbConnection getInstance()
    {
        if( con == null )
            con = new DbConnection();

        return con;
    }
     */

    // DOUBLE-CHECKED LOCKING - SYNCHRONISED(THREAD SAFE)
    public static DbConnection getInstance()
    {
        if( con == null ){
            synchronized ( DbConnection.class ) {
                if( con == null ) {
                    con = new DbConnection();
                }
            }
        }

        return con;
    }

}

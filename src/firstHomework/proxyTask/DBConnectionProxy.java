package firstHomework.proxyTask;

public class DBConnectionProxy implements DBConnectionAble{

    String urlToDatabse;
    DBConnectionAble dbNameHolder;

    public DBConnectionProxy(String urlToDatabse, DBConnectionAble dbNameHolder) {
        this.urlToDatabse = urlToDatabse;
        this.dbNameHolder = dbNameHolder;
    }

    @Override
    public String getConnection() {
        return urlToDatabse + dbNameHolder.getConnection();
    }
}

package firstHomework.proxyTask;

public class DBConnection implements DBConnectionAble{

    String databseName;

    public DBConnection(String databseName) {
        this.databseName = databseName;
    }

    @Override
    public String getConnection() {
        return databseName;
    }
}

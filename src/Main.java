class DataBaseConnection{
    private static DataBaseConnection dataBaseConnection;

    private DataBaseConnection(){

    }

    public static DataBaseConnection getInstance(){
        if(dataBaseConnection == null){
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }

}


public class Main {
    public static void main(String[] args) {
        DataBaseConnection db1 = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();

        System.out.println(db1);
        System.out.println(db2);

    }
}
import com.taosdata.restfuljdbc.RESTfulJDBCDriver;

public class MyTestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.taosdata.restfuljdbc.RESTfulJDBCDriver");
        String jdbcUrl = "restful-jdbc:TAOS://39.107.46.132:6030/rest/login/root/taosdata";
        RESTfulJDBCDriver rjDriver = new RESTfulJDBCDriver();

    }
}

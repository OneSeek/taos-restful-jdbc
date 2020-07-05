import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class TestRestfulJDBC {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello TestJDBC");
        TestHttpclient();
    }
    public static void TestHttpclient() throws IOException {
        //1.获得一个httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();
        //2.生成一个get请求
        HttpGet httpget = new HttpGet("http://oneseek.cn:6020/rest/login/root/taosdata/");
        //3.执行get请求并返回结果
        CloseableHttpResponse response = httpclient.execute(httpget);
        try {
            //4.处理结果
            System.out.println(response);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            response.close();
        }
    }
}

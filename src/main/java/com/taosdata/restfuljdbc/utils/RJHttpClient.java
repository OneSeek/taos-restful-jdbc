package com.taosdata.restfuljdbc.utils;

import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RJHttpClient {
    public RJHttpClient() throws IOException {
        String url = "http://oneseek.cn:6020/rest/login/root/taosdata";
        URL serverUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) serverUrl.openConnection();
        connection.setRequestMethod("GET");
        if (connection.getResponseCode() != 200) {
            throw new RuntimeException(
                    "HTTP GET Request Failed with Error code : "
                            + connection.getResponseCode());
        }
        BufferedReader responseBuffer = new BufferedReader(
                new InputStreamReader((connection.getInputStream())));
        String output;
        System.out.println("Output from Server:  \n");
        while ((output = responseBuffer.readLine()) != null) {
            System.out.println(output);
        }
        connection.disconnect();
    }

}

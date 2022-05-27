package com.mycompany.tarea2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
public class GetClient {
    private HttpClient httpClient;
    private HttpGet get;
    private HttpResponse response;
    private String respuesta;       
    public GetClient(){
        this.httpClient = HttpClients.createDefault();
        this.get = null;
        this.respuesta = null;
    }
    public String GET(String url){                                              //Funcion  que    ejecuta    la    llamada    'get'
        this.get = new HttpGet(url);        
        try{
            this.response = this.httpClient.execute(this.get);
            this.respuesta = EntityUtils.toString(this.response.getEntity());
        }catch (Exception e){
            System.out.println("NO SE PUDO CONECTAR CON EL SERVIDOR");
        }       
        return this.respuesta;
    }
     public datosClient makeRequestPost(String username,String password)        //Funcion  que   ejecuta    la    llamada    'post'
             throws UnsupportedEncodingException, IOException{
        String urlFinal = "https://sjlt81ef5i.execute-api.us-east-1.amazonaws."
                        + "com/login";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(urlFinal);
        request.addHeader("accept", "application/json");                
        String json = "{\"username\": \""+username+"\",\"password\": \""+
                password+"\"}";
        StringEntity entity = new StringEntity(json);
        request.setEntity(entity);
        request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");        
        HttpResponse response = httpClient.execute(request);        
        datosClient myObject = null;        
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.
                getEntity().getContent()));            
        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        String jsonResponse = result.toString();        
        myObject = new ObjectMapper().readValue(jsonResponse,datosClient.class);        
        return myObject;        
    }
}

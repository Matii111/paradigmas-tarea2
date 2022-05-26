package com.mycompany.tarea2;
import java.io.IOException;
public class Main {       
    static int count;
    static String pasarDato=null;
    static String pasarDato2=null;
    static String pasarHumedad=null;
    static String pasarTemp=null;
    static String pasarCo2=null;
    static int refre=3;
    
        public static String invertirString(String invertirString){                    
            invertirString = invertirString.replace("null", "");  //a
            StringBuilder strb = new StringBuilder(invertirString);
            invertirString = strb.reverse().toString();       
            return invertirString;
        }              
    public static void main(String[] arg)throws IOException, InterruptedException{
        new tarea_2Login().setVisible(true); 
        String user=null;
        String pass=null;              
        datosClient a = new GetClient().makeRequestPost(user,pass);  
        while(user==null && pass ==null || a.message!=null){
            user = datosComprobador.username;
            pass = datosComprobador.password;  
            a = new GetClient().makeRequestPost(user,pass);     
            System.out.println(user+pass);
        }
        while(count<3){
            if(refre>=3&&refre<120&&tarea_2Login.tiempoRefres!=null){
            refre = Integer.parseInt(tarea_2Login.tiempoRefres);}
            int ver=0;
            int dato=0;
            String Humedad=null;String humedad = null;
            String Temperatura=null;String temperatura = null;
            String Co2=null;String co2 = null;
            String code_url=null; 
            a = new GetClient().makeRequestPost(user,pass);
            if(a.access_code!=null){            
                pasarDato = a.acceso;
                pasarDato2=a.access_code
            ;}
            code_url = "https://sjlt81ef5i.execute-api.us-east-1.amazonaws.com/"
                    + "sensors?access_code="+a.access_code;        
            GetClient Consulta = new GetClient();
            String consulta = Consulta.GET(code_url);                      
            for(char c: consulta.toCharArray()){
                if(c==34){ver=1;}
                if(c==58){ver=0;dato+=1;}               
                if(ver==0&&c>=48&&c<=57||c==46||c==45){
                    if(dato==1){Humedad= String.valueOf(c)+Humedad;}
                    if(dato==2){Temperatura= String.valueOf(c)+Temperatura;}
                    if(dato==3){Co2= String.valueOf(c)+Co2;}                
                }                                
                if(ver==1&&c!=34){
                    if(dato==0){humedad = String.valueOf(c)+humedad;}
                    if(dato==1){temperatura = String.valueOf(c)+temperatura;}
                    if(dato==2){co2 = String.valueOf(c)+co2;}                    
                }               
            }
            humedad = invertirString(humedad);Humedad = invertirString(Humedad);
            temperatura = invertirString(temperatura);Temperatura = invertirString
            (Temperatura);
            co2 = invertirString(co2);Co2 = invertirString(Co2);   

            pasarHumedad=Humedad;
            pasarTemp=Temperatura;
            pasarCo2=Co2;

            System.out.println("acceso: "+a.acceso);
            System.out.println("access_code: "+a.access_code);        
            System.out.println("\n"+humedad+": "+Float.parseFloat(Humedad));
            System.out.println(temperatura+": "+Float.parseFloat(Temperatura));
            System.out.println(co2+": "+Integer.parseInt(Co2));   
            Thread.sleep(refre*1000);            
        }
    }
}

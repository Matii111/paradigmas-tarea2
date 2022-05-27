package com.mycompany.tarea2;
import java.io.IOException;
import java.util.ArrayList;
public class Main {       
    static int count=0;
    static String pasarDato=null;
    static String pasarDato2=null;
    static String pasarHumedad=null;
    static String pasarTemp=null;
    static String pasarCo2=null;
    static int refre=3;
    static float promHume=0;
    static float humedadMax=0;
    static float humedadMin=0;    
    static float promTemp=0;
    static float tempMax=0;
    static float tempMin=0;    
    static float promCo2=0;
    static float Co2Max=0;
    static float Co2Min=0;   
        public static String obtenerDatos(String consulta,int valor){           //funcion obtenerDatos se encarga de leer el string
                String Humedad=null;String humedad = null;                      //tomando cada  caracter   unificandolos   en   los  
                String Temperatura=null;String temperatura = null;              //distintos             datos            requeridos
                String Co2=null;String co2 = null;String retorno=null;          
                int ver=0;
                int dato=0;   
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
                        if(dato==1){temperatura = String.valueOf(c)+
                                temperatura;}
                        if(dato==2){co2 = String.valueOf(c)+co2;}                    
                    }                    
                }                       
                switch(valor) {
                case 1 -> retorno=Humedad;
                case 2 -> retorno=Temperatura;
                case 3 -> retorno=Co2;
                case 4 -> retorno=humedad;
                case 5 -> retorno=temperatura;
                case 6 -> retorno=co2;
              }                
                return retorno;
            }
        public static String invertirString(String invertirString){             //la funcion invertirString toma un string   y   lo          
            invertirString = invertirString.replace("null", "");                //     retorna                            invertido
            StringBuilder strb = new StringBuilder(invertirString);
            invertirString = strb.reverse().toString();       
            return invertirString;
        }                
    public static void main(String[]arg)throws IOException,InterruptedException{
        new tarea_2Login().setVisible(true);                                    //se      inicializa     la      ventana     "main"
        String user=null;
        String pass=null;              
        datosClient a = new GetClient().makeRequestPost(user,pass);             //mediante   la   funcion    "makeRequestPost"    y  
        while(user==null && pass ==null || a.message!=null){                    //el while  de  la  linea '63' se   comprueba   que   
            user = datosComprobador.username;                                   //el  usuario  y  contrasenia  sean  los  correctos  
            pass = datosComprobador.password;                                   
            a = new GetClient().makeRequestPost(user,pass);                     
            System.out.println(user+pass);
        }
        ArrayList<String> humedadAcumulada = new ArrayList<>();
        ArrayList<String> temperaturaAcumulada = new ArrayList<>();
        ArrayList<String> co2Acumulada = new ArrayList<>();
        while(count==0){                                                        //while que realiza  constantemente   la   consulta
            if(refre>=3&&refre<120&&tarea_2Login.tiempoRefres!=null){           //"post"              al                        url
            refre = Integer.parseInt(tarea_2Login.tiempoRefres);}
            String code_url=null; 
            a = new GetClient().makeRequestPost(user,pass);                     //se         realiza          consulta         post
            if(a.access_code!=null){                                            
                pasarDato=a.acceso;
                pasarDato2=a.access_code;}            
            code_url = "https://sjlt81ef5i.execute-api.us-east-1.amazonaws.com/"
                    + "sensors?access_code="+a.access_code;                    
            GetClient Consulta = new GetClient();            
            String consulta = Consulta.GET(code_url);             
            String Humedad = invertirString(obtenerDatos(consulta,1));
            String Temperatura = invertirString(obtenerDatos(consulta,2));
            String Co2 = invertirString(obtenerDatos(consulta,3));
            String humedad = invertirString(obtenerDatos(consulta,4));
            String temperatura = invertirString(obtenerDatos(consulta,5));
            String co2 = invertirString(obtenerDatos(consulta,6));               
            pasarHumedad=Humedad;
            pasarTemp=Temperatura;
            pasarCo2=Co2;                        
            humedadAcumulada.add(Humedad);            
            for (int x=0; x< humedadAcumulada.size(); x++) {                
              String hume=humedadAcumulada.get(x);                  
              if(humedadMin==0){humedadMin=Float.parseFloat(hume);}              
              promHume=promHume + (Float.parseFloat(hume));                            
              if(Float.parseFloat(hume)>humedadMax){
                humedadMax = Float.parseFloat(hume);}
              if(Float.parseFloat(hume)<humedadMin){
                humedadMin = Float.parseFloat(hume);}
            }
            temperaturaAcumulada.add(Temperatura);
            for (int x=0; x< temperaturaAcumulada.size(); x++) {                
              String tempe=temperaturaAcumulada.get(x);                  
              if(tempMin==0){tempMin=Float.parseFloat(tempe);}              
              promTemp=promTemp + (Float.parseFloat(tempe));                            
              if(Float.parseFloat(tempe)>tempMax){
                tempMax = Float.parseFloat(tempe);}
              if(Float.parseFloat(tempe)<tempMin){
                tempMin = Float.parseFloat(tempe);}
            }
            co2Acumulada.add(Co2);
            for (int x=0; x< co2Acumulada.size(); x++) {                
              String co22=co2Acumulada.get(x);                  
              if(Co2Min==0){Co2Min=Float.parseFloat(co22);}              
              promCo2=promCo2 + (Float.parseFloat(co22));  
              if(Float.parseFloat(co22)>Co2Max){
                Co2Max = Float.parseFloat(co22);}
              if(Float.parseFloat(co22)<Co2Min){
                Co2Min = Float.parseFloat(co22);}
            }
            promHume = promHume/humedadAcumulada.size();
            promTemp = promTemp/temperaturaAcumulada.size();
            promCo2 = promCo2/co2Acumulada.size();      
        }
    }
}

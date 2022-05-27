package com.mycompany.tarea2;
public class datosClient {                                                      //clase que almacena el codigo  de  acceso   y   el
        public String acceso;                                                   //usuario, ademas contiene   el    'message'    que
        public String access_code;                                              //evita       que       el       codigo       falle
        public String message;
        public datosClient(){
        }        
        public datosClient(String nombreDato, String valorDato){
        this.acceso = null;
        this.message=null;
        this.access_code = null;
        }        
}

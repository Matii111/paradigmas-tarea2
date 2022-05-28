# java-tarea2

***El funcionamiento de cada clase esta expresado dentro del mismo codigo.***

## Como trabaja el programa

### Primera ventana - LOGIN
Al ejecutar el codigo se abrira una ventana en la que se solicitara un usuario y contraseña para buscarlos entre los datos de la url indicada en la *tarea2*. Mediante consultas **POST** y **GET** se comprueba si los datos ingresados (usuario y contraseña) son correctos, de no ser asi tras 5 segundos se retornara un mensaje de error en la parte superior de la ventana indicando que alguno de los valores ingresados no estan correctos. En el caso de completar exitosamente el *login* (usuario y contraseña correctos) se cierra la ventana de *login* y se abre una nueva que llamaremos **login exitoso**.
### Segunda ventana - LOGIN EXITOSO
Dentro de la ventana **login exitoso** se mostrara el valor de acceso *true* y el *access code* (valor que cambia continuamente), junto a un mensaje de *login existoso!*. Tambien estara un *radioButton* desmarcado para escoger la unidad de tempertura Fahrenheit, la cual al ser marcada entregara los valores en dicha unidad. Por ultimo hay una casilla para escribir texto en la cual se debera introducir un valor entre 3 y 120 para definir el tiempo de refresco de los valores que seran mostrados en la siguiente ventana, el valor introducido sera mostrado una vez el boton que llamaremos **siguiente** (el cual tiene un signo de play) sea clickeado, dicho boton se encuentra debajo de la casilla de texto. Cabe destacar que si ningun valor es recibido, el valor por defecto sera el numero 3, es decir, el tiempo de refresco sera 3.
Como se menciona anteriormente la ventana **login exitoso** posee un boton llamado **siguiente** que al ser clickeado te envia a la ventana siguiente para mostrar los datos segun los valores ingresados en esta misma instancia (temperatura y tiempo de refresco). Asimismo en la parte izquierda opuesta al boton siguiente hay un boton que llamaremos **cerrar** el cual es la unica manera de cerrar el programa.
### Tercera ventana - DATOS
Por ultimo esta la ventana que definiremos como **datos** la cual mostrara todos los datos extraidos desde la url: Humedad en porcentaje, temperatura en Celsius o Fahrenheit segun se escoja y nivel de co2 en ppm. Junto a sus promedios, minimos y maximos , todos estos valores se estaran actualizando segun el tiempo interiormente en la casilla de texto. Ademas en la parte izquierda hay un boton con un simbolo de "casa" al que llamaremos **volver**, el cual esta encargado de volver a la ventana **login exitoso** sin antes de cerrar la ventana **datos**.
## Sintesis
Entonces la manera correcta de utiliza este programa sera:
- Login en la ventana **login**.
- Seleccionar si quiere o no que se muestren los datos en grados Fahrenheit.
- Ingresar tiempo dentro de la casilla de texto. (De no ingresar uno, seran 3 segundos por defecto).
- Clickear boton **siguiente** y visualizar los datos en la tabla **datos**.
- Repetir
- En el caso de no querer realizar mas consultas, simplemente se clickea el boton **cerrar** para salir del programa.

Con "repetir" se refiere a que puedes perfectamente pedir los datos y volver clickeando el boton **volver** para solictarlos nuevamente cambiando los valores del tiempo o de la unidad de temperatura.

# Implementacion con docker
    1. Abrir el directorio con vscode
    2. Abrir el command palette(Ctrl-shift-p) 
    3. Seleccionar la opcion Rebuild container(requiere del plugin dev-container)
    4. Abrir una terminal en el servicio java y reemplazar la palabra localhost en el archivo Bd.java
        ```console
        sed -i 's/localhost/db/' src/main/java/py/una/bd/Bd.java
        ```
    5. Crear la tabla dentro de la base de datos postgres
        5.1- Abrir una terminal en el docker host y situarse en el directorio del docker compose
        5.2- Ejecutar el comando:
            ```console
            sudo docker compose exec db psql --username=postgres --dbname=sd -c "CREATE TABLE persona (cedula INTEGER PRIMARY KEY, nombre VARCHAR (100), apellido VARCHAR (100));"
            ```
    6. Instalar las dependencias del maven eligiendo el pom de docker:
        ```console
        mvn clean install -U -f pom-docker.xml
        ```
    7. Se modifica la linea que contiene la etiquera mainClass
        Originalmente para el cliente UDP:
            <mainClass>py.una.server.udp.UDPClient</mainClass>
        Para el servidor:
            <mainClass>py.una.server.udp.UDPServer</mainClass>
    8. Volver a compilar
        ```console
        mvn install package -U -f pom-docker.xml
        ```
    9. Ejecutar el compilado(se encuentra en el directorio target)
        ```console
        java -jar nombreArchivo.jar
        ```
        
Se puede abrir multiples instancias del servicio java para simular multiples clientes, para eso se utiliza la terminar, algunos comandos para usar solo con la terminal son:
```console
docker compose up --build --scale java=1
```
* -f es para indicar el archivo docker-compose
* --build es para construir la imagen en el caso de que esta no se haya construido
* --scale client=n indica la cantidad de veces que se repetira el servicio client especificado en el docker-compose-Client-Server.yml, en otras palabras n es la cantidad de clientes que se desea tener en el proyecto
## Crear la imagen
```console
sudo docker compose build --no-cache
```
## Levantar el container
```console
sudo docker compose up
```
## Crear tabla persona
```console
sudo docker compose exec db psql --username=postgres --dbname=sd -c "CREATE TABLE persona (cedula INTEGER PRIMARY KEY, nombre VARCHAR (100), apellido VARCHAR (100));"
```
## Abrir una terminal
```console
docker exec -it lab-socket-java-1 /bin/bash
```
### Dentro de la terminal
- Se puede editar el pom.xml con 'vi' y se coloca el nombre de la clase a compilar
- Para compilar se utiliza el comando 
```console
mvn install package -U -f pom-docker.xml
```
- Para ejecutar el compilado
```console
java -jar nombreArchivo.jar
``` 

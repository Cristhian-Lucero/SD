# Para construir el contenedor
    ```console
    sudo docker build -t sinc:1.0 .
    ```
# Para correr el contenedor
    ```console
    sudo docker run sinc:1.0
    ```
# Para abrir una terminal 
docker exec -it hash-del-container /bin/bash
# Para ejecutar los .java
java Client.java
java Server.java
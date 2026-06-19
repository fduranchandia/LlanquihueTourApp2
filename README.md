Nombre: Felipe Francisco Duran Chandia
Carrera: Analista Programador Computacional
Sede: Virtual

El proyecto lleva por nombre LlanquihueTourApp y es del tipo Java with Maven. Este proyecto busca leer datos asociados a atributos de paquetes turisticos para cargarlos como listas en java para luego disponer de ellos en consola y aplicarles filtros de búsqueda. 

El proyecto utiliza cuatro paquetes con el groupID com.agenciaturismo: paquete app (com.agenciaturismo.app), paquete model (com.agenciaturismo.model), paquete service (com.agenciaturismo.service) y paquete util (com.agenciaturismo.util). En app se encuentra la clase Main, en model la clase Tour, en service la clase TourService y en util la clase LectorArchivo.

La clase principal Main funciona de la siguiente manera: se crea el objeto data de la clase LectorArchivo. A este objeto se le aplica el metodo cargarArchivo, que utiliza al ruta del .csv o .txt, para crear una lista con objetos viajes. Luego se crea el objeto toures mediante la clase TourService aplicada al objeto viajes. Entonces se crea un programa que pregunta según opción lo siguiente: 1. Listar toures, metodo de la clase TourService, que aplica al objeto toures un recorrido con for each imprimiendo en consola la información de cada tour. 2. Listar Tour c/ Almuerzo, metodo de la clase TourService, que aplicar al objeto toures un recorrido con for each imprimiendo en consola la información de los tour con almuerzo incluido. 3. Salir, que sale del programa.

Además de imprimirse en consola el programa corre en un archivo .jar.

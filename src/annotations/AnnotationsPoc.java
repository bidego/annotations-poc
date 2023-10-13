package annotations;

import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import annotations.helper.Helper;

public class AnnotationsPoc {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(AnnotationsPoc.class.getName());

        logger.info("Iniciando POC Annotations");
        Programa programa = new Programa();

        List<Method> methods = Helper.getMethodsAnnotatedWith(Programa.class, Ejecutar.class);
        logger.info("Cantidad de funciones: " + methods.size());

        methods.forEach(method -> {
            logger.info(method.getName());
            try {
                method.invoke(programa);
            } catch(Exception ex) {
                logger.info("Error");
                logger.info(ex.getMessage());
            }
        });
    }
}

package annotations;

import java.lang.reflect.Method;
import java.util.List;

import annotations.helper.Helper;
import annotations.logger.Logger;
import annotations.logger.LoggerFactory;

public class AnnotationsPoc {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(AnnotationsPoc.class);

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

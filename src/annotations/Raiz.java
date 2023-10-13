package annotations;

import java.util.logging.Logger;

public class Raiz {
    Logger logger = Logger.getLogger(Raiz.class.getName());
    @Ejecutar
    public void testRaiz() {
        logger.info("Ejecutando test raiz ");
    }

}

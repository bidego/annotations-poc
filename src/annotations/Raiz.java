package annotations;

import annotations.logger.Logger;
import annotations.logger.LoggerFactory;

public class Raiz {
    Logger logger = LoggerFactory.getLogger(Raiz.class);
    @Ejecutar
    public void testRaiz() {
        logger.info("Ejecutando test raiz ");
    }

}

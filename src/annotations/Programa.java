package annotations;

import annotations.logger.Logger;
import annotations.logger.LoggerFactory;

public class Programa extends Raiz {
    Logger logger = LoggerFactory.getLogger(Programa.class);
    
    @Ejecutar
    public void testCast() {

        int miVariable;
        long miOtraVariable = 3_147_483_647L;

        logger.info("Valor Inicial: " + miOtraVariable);

        miVariable = (int) miOtraVariable;

        logger.info("Valor en int: " + miVariable);

    }

    @Ejecutar
    public void testCast2() {

        int miVariable;
        long miOtraVariable = 3_147_483_647L;

        logger.info("Valor Inicial: " + miOtraVariable);

        miVariable = (int) miOtraVariable;

        logger.info("Valor en int: " + miVariable);

    }

    public void testCast3() {

        int miVariable;
        long miOtraVariable = 3_147_483_647L;

        System.out.println("Valor Inicial: " + miOtraVariable);

        miVariable = (int) miOtraVariable;

        System.out.println("Valor en int: " + miVariable);

    }
}

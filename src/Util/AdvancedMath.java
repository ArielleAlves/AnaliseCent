package Util;

public class AdvancedMath {

    public static Double calcMedia(double[] values) {

        /**
         * Tem como função calcular a Média de um conjunto de numeros
         *
         * @param
         * @return
         */
        
        Double somatoria = 0.d;

        for (int i = 0; i < values.length; i++) {

            somatoria += values[i];

        }

        return somatoria / values.length;

    }

    public static Double calcVariancia(double[] values) {

        /**
         * Tem como função calcular a variancia de um conjunto de numeros
         *
         * @param
         * @return
         */
        
        System.out.println("Variancia de " + values.length + " itens.");

        Double media = calcMedia(values);

        Double somatoria = 0.d;

        for (int i = 0; i < values.length; i++) {

            somatoria += Math.pow(values[i] - media, 2);

        }

        return somatoria / values.length;

    }

    public static Double calcDesvioPadrao(double[] values) {

        /**
         * Tem como função calcular o Desvio Padrão de um conjunto de numeros
         *
         * @param
         * @return
         */
        
        System.out.println("Desvio padrao de " + values.length + " itens.");

        Double variancia = calcVariancia(values);

        return Math.sqrt(variancia);

    }

}

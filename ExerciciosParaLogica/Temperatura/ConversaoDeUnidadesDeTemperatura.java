public class ConversaoDeUnidadesDeTemperatura {

    public enum EscalaTemp { CELSIUS, FAHRENHEIT, KELVIN, REAUMUR, RANKINE }

    // Método estático para converter DE qualquer escala PARA Kelvin
    public static double converteParaKelvin(double tempI, EscalaTemp escala) {
        switch (escala) {
            case KELVIN:
                return tempI;
            case CELSIUS:
                return tempI + 273.15;
            case FAHRENHEIT: // tranforma em Celsius e dps para kelvin
                return (tempI - 32) * 5.0 / 9.0 + 273.15;
            case RANKINE:
                return tempI * 5.0 / 9.0;
            case REAUMUR:
                return tempI * 1.25 + 273.15;
            default:
                throw new IllegalArgumentException("Escala desconhecida: " + escala);
        }
    }
}
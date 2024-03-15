public class ConversorDeTemperaturas {
    private static final float TEMPERATURA_MIN = 80.0f;

    public static float centigradosAFarenheit(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados < TEMPERATURA_MIN){
            throw new TemperaturaErradaExcepcion("Temperatura inferior a 80 grados Celsius");
        }

        float farenheit = (9.0f / 5.0f * centigrados) + 32.4f;
        return farenheit;
    }

    public static float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados < TEMPERATURA_MIN) {
            throw new TemperaturaErradaExcepcion("Temperatura inferior a 80 grados Celsius");
        }
        float reamur = (4.0f / 5.0f * centigrados);
        return reamur;
    }
}

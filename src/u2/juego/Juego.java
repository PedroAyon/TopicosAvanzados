package u2.juego;

import java.util.LinkedList;
import java.util.List;

public class Juego {
    private static final List<Pregunta> preguntas = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Pregunta pregunta = new Pregunta("Pregunta " + i);
            pregunta.addRespuesta(new Respuesta("Respuesta " + i, 60));
            pregunta.addRespuesta(new Respuesta("Respuesta " + i, 50));
            pregunta.addRespuesta(new Respuesta("Respuesta " + i, 20));
            pregunta.addRespuesta(new Respuesta("Respuesta " + i, 10));
            preguntas.add(pregunta);
        }

        preguntas.forEach(pregunta -> {
            System.out.println(pregunta);
            pregunta.getRespuestas().forEach(respuesta -> System.out.println(respuesta + " ..... " + respuesta.getPuntaje()));
            System.out.println();
        });
    }
}

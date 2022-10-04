package u2.juego;

import java.util.ArrayList;

public class Pregunta {
    private String pregunta;
    private ArrayList<Respuesta> respuestas = new ArrayList<>();

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void addRespuesta(Respuesta respuesta) {
        respuestas.add(respuesta);
    }

    @Override
    public String toString() {
        return pregunta;
    }
}

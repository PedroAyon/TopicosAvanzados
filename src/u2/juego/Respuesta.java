package u2.juego;

public class Respuesta {
    private String respuesta;
    private int puntaje;
    private boolean contestada;

    public Respuesta(String respuesta, int puntaje) {
        this.respuesta = respuesta;
        this.puntaje = puntaje;
        contestada = false;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public boolean isContestada() {
        return contestada;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setContestada(boolean contestada) {
        this.contestada = contestada;
    }

    @Override
    public String toString() {
        return respuesta;
    }
}

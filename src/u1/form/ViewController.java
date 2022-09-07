package u1.form;

public class ViewController {
    private boolean pool;
    private boolean piano;
    private boolean basketball;
    private String ageRange = "";

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setPiano(boolean piano) {
        this.piano = piano;
    }

    public void setBasketball(boolean basketball) {
        this.basketball = basketball;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getMessage() {
        String mesage = "";
        if (!ageRange.isEmpty()) mesage += "tienes de " + ageRange + " años, ";
        if (pool) mesage += "te gusta nadar, ";
        if (piano) mesage += "te gusta tocar el piano, ";
        if (basketball) mesage += "te gusta jugar basquetbol, ";
        if (!mesage.isEmpty()) mesage = mesage.substring(0, 1).toUpperCase() + mesage.substring(1, mesage.length() - 2);
        return mesage;
    }
}

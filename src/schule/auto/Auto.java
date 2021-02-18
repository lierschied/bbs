package schule.auto;

import java.awt.*;
import java.util.Date;

public class Auto {
    private Autmarke marke;
    private Autobauart bauart;
    private Getriebe getriebe;
    private Color farbe;
    private int preis;
    private int sitzpleatze;
    private Motor motor;

    public Autmarke getMarke() {
        return marke;
    }

    public void setMarke(Autmarke marke) {
        this.marke = marke;
    }

    public Autobauart getBauart() {
        return bauart;
    }

    public void setBauart(Autobauart bauart) {
        this.bauart = bauart;
    }

    public Getriebe getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(Getriebe getriebe) {
        this.getriebe = getriebe;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getSitzpleatze() {
        return sitzpleatze;
    }

    public void setSitzpleatze(int sitzpleatze) {
        if(sitzpleatze >= 1 && sitzpleatze <= 6) {
            this.sitzpleatze = sitzpleatze;
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Date getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Date baujahr) {
        this.baujahr = baujahr;
    }

    private Date baujahr;

    public void fahren(int geschwindikeit) {

    }
    public void bremsen() {

    }
    public void lenken(int lenkeinschlag) {

    }
    public Date vermieten(Person fahrer) {
        return new Date(System.currentTimeMillis());
    }
    public boolean tanken(int geschwidget) {
        return true;
    }

}

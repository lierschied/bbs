package schule.stift;

import java.awt.*;

public class Stift {
    private Mienenmaterial material;
    private Obermaterial oberMaterial;
    private int gewicht;
    private Color farbe;
    private int preis;
    private boolean entfernbarkeit;

    public Mienenmaterial getMaterial() {
        return material;
    }

    public void setMaterial(Mienenmaterial material) {
        this.material = material;
    }

    public Obermaterial getOberMaterial() {
        return oberMaterial;
    }

    public void setOberMaterial(Obermaterial oberMaterial) {
        this.oberMaterial = oberMaterial;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
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

    public boolean isEntfernbarkeit() {
        return entfernbarkeit;
    }

    public void setEntfernbarkeit(boolean entfernbarkeit) {
        this.entfernbarkeit = entfernbarkeit;
    }

    public double getAbnutzungsgrad() {
        return abnutzungsgrad;
    }

    public void setAbnutzungsgrad(double abnutzungsgrad) {
        this.abnutzungsgrad = abnutzungsgrad;
    }

    private double abnutzungsgrad;

    public void farbwechsel(Color neueFarbe) {

    }
    public boolean verkaufen() {
        return true;
    }
    public void schreiben(String satz) {

    }
    public boolean füllen(int menge) {
        return true;
    }
    public boolean löschen(int geschwidget) {
        return true;
    }

}

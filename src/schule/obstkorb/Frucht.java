package schule.obstkorb;

import schule.obstkorb.frucht.Reifegrad;

import java.awt.*;

/**
 * The type Frucht.
 */
public abstract class Frucht implements Verzehr {
    private Reifegrad reifegrad;
    private boolean essbar;
    private boolean schale;
    private boolean schaleVerzehrbar;
    private boolean giftig;
    private boolean kannGeerntetWerden;

    /**
     * Gets reifegrad.
     *
     * @return the reifegrad
     */
    public Reifegrad getReifegrad() {
        return reifegrad;
    }

    /**
     * Sets reifegrad.
     *
     * @param reifegrad the reifegrad
     */
    public void setReifegrad(Reifegrad reifegrad) {
        this.reifegrad = reifegrad;
    }

    /**
     * Is essbar boolean.
     *
     * @return the boolean
     */
    public boolean isEssbar() {
        return essbar;
    }

    /**
     * Sets essbar.
     *
     * @param essbar the essbar
     */
    public void setEssbar(boolean essbar) {
        this.essbar = essbar;
    }

    /**
     * Is schale boolean.
     *
     * @return the boolean
     */
    public boolean isSchale() {
        return schale;
    }

    /**
     * Sets schale.
     *
     * @param schale the schale
     */
    public void setSchale(boolean schale) {
        this.schale = schale;
    }

    /**
     * Is schale verzehrbar boolean.
     *
     * @return the boolean
     */
    public boolean isSchaleVerzehrbar() {
        return schaleVerzehrbar;
    }

    /**
     * Sets schale verzehrbar.
     *
     * @param schaleVerzehrbar the schale verzehrbar
     */
    public void setSchaleVerzehrbar(boolean schaleVerzehrbar) {
        this.schaleVerzehrbar = schaleVerzehrbar;
    }

    /**
     * Is giftig boolean.
     *
     * @return the boolean
     */
    public boolean isGiftig() {
        return giftig;
    }

    /**
     * Sets giftig.
     *
     * @param giftig the giftig
     */
    public void setGiftig(boolean giftig) {
        this.giftig = giftig;
    }

    /**
     * Is kann geerntet werden boolean.
     *
     * @return the boolean
     */
    public boolean isKannGeerntetWerden() {
        return kannGeerntetWerden;
    }

    /**
     * Sets kann geerntet werden.
     *
     * @param kannGeerntetWerden the kann geerntet werden
     */
    public void setKannGeerntetWerden(boolean kannGeerntetWerden) {
        this.kannGeerntetWerden = kannGeerntetWerden;
    }

    /**
     * Is kruemmung boolean.
     *
     * @return the boolean
     */
    public boolean isKruemmung() {
        return kruemmung;
    }

    /**
     * Sets kruemmung.
     *
     * @param kruemmung the kruemmung
     */
    public void setKruemmung(boolean kruemmung) {
        this.kruemmung = kruemmung;
    }

    /**
     * Gets suesse.
     *
     * @return the suesse
     */
    public int getSuesse() {
        return suesse;
    }

    /**
     * Sets suesse.
     *
     * @param suesse the suesse
     */
    public void setSuesse(int suesse) {
        this.suesse = suesse;
    }

    /**
     * Gets farbe.
     *
     * @return the farbe
     */
    public Color getFarbe() {
        return farbe;
    }

    /**
     * Sets farbe.
     *
     * @param farbe the farbe
     */
    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    private boolean kruemmung;
    private int suesse;
    private Color farbe;

    /**
     * Ernten int.
     *
     * @param menge the menge
     * @return the int
     */
    public int ernten(int menge) {
        return 1;
    }

    /**
     * Verkaufen boolean.
     *
     * @param preis the preis
     * @return the boolean
     */
    public boolean verkaufen(double preis) {
        return true;
    }

    /**
     * Schealen boolean.
     *
     * @return the boolean
     */
    public boolean schealen() {
        return true;
    }

    /**
     * Enstaften double.
     *
     * @return the double
     */
    public double enstaften() {
        return 10.0;
    }
}

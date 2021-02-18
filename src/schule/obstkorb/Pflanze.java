package schule.obstkorb;

import schule.obstkorb.pflanze.Anbau;
import schule.obstkorb.pflanze.Pflanzenart;
import schule.obstkorb.pflanze.Qualiteatsklasse;

/**
 * The type Pflanze.
 */
public class Pflanze {
    private Frucht frucht;
    private String herkunft;
    private Qualiteatsklasse qualiteatsklasse;

    /**
     * Gets frucht.
     *
     * @return the frucht
     */
    public Frucht getFrucht() {
        return frucht;
    }

    /**
     * Sets frucht.
     *
     * @param frucht the frucht
     */
    public void setFrucht(Frucht frucht) {
        this.frucht = frucht;
    }

    /**
     * Gets herkunft.
     *
     * @return the herkunft
     */
    public String getHerkunft() {
        return herkunft;
    }

    /**
     * Sets herkunft.
     *
     * @param herkunft the herkunft
     */
    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    /**
     * Gets qualiteatsklasse.
     *
     * @return the qualiteatsklasse
     */
    public Qualiteatsklasse getQualiteatsklasse() {
        return qualiteatsklasse;
    }

    /**
     * Sets qualiteatsklasse.
     *
     * @param qualiteatsklasse the qualiteatsklasse
     */
    public void setQualiteatsklasse(Qualiteatsklasse qualiteatsklasse) {
        this.qualiteatsklasse = qualiteatsklasse;
    }

    /**
     * Gets anbau.
     *
     * @return the anbau
     */
    public Anbau getAnbau() {
        return anbau;
    }

    /**
     * Sets anbau.
     *
     * @param anbau the anbau
     */
    public void setAnbau(Anbau anbau) {
        this.anbau = anbau;
    }

    /**
     * Gets pflanzenart.
     *
     * @return the pflanzenart
     */
    public Pflanzenart getPflanzenart() {
        return pflanzenart;
    }

    /**
     * Sets pflanzenart.
     *
     * @param pflanzenart the pflanzenart
     */
    public void setPflanzenart(Pflanzenart pflanzenart) {
        this.pflanzenart = pflanzenart;
    }

    private Anbau anbau;
    private Pflanzenart pflanzenart;
}

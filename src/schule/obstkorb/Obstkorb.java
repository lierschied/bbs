package schule.obstkorb;

import schule.obstkorb.frucht.suedfrucht.Ananas;
import schule.obstkorb.frucht.suedfrucht.Banane;
import schule.obstkorb.frucht.suedfrucht.Orange;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Obstkorb.
 */
public class Obstkorb {

    /**
     * Mein obstkorb inhalt list.
     *
     * @return the list
     */
    public List<Frucht> meinObstkorbInhalt() {
        List<Frucht> list = new ArrayList<Frucht>();
        list.add(new Ananas());
        list.add(new Banane());
        list.add(new Orange());
        return list;
    }
}

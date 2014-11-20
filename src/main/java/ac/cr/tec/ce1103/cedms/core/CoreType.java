package ac.cr.tec.ce1103.cedms.core;

/**
 * Created by pablo on 20/11/14.
 * Se encuentran los tipos de core
 */
public enum CoreType {
    CLIENTE("client"),
    HUB("hub"),
    BASESTATION("base");

    private String string;

    /**
     * Se asigna un string para cada tipo
     *
     * @param s nombre
     */
    CoreType(String s) {
        this.string = s;
    }


    /**
     * Returns the name of this enum constant, as contained in the
     * declaration.  This method may be overridden, though it typically
     * isn't necessary or desirable.  An enum type should override this
     * method when a more "programmer-friendly" string form exists.
     *
     * @return the name of this enum constant
     */
    @Override
    public String toString() {
        return string;
    }
}
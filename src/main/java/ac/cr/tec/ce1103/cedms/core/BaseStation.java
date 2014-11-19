package ac.cr.tec.ce1103.cedms.core;

/**
 * Created by pablo on 10/11/14.
 */
public class BaseStation extends Core {


    public BaseStation(long pId, int pPort) {
        super(pId, pPort);
    }


    @Override
    protected void initScanner() {

    }


    /**
     * Recibe la conexion en segunda fase
     *
     * @param updateId
     * @param precio
     */
    @Override
    public void recibirConnectionPhase2(String updateId, int precio) {

    }

    /**
     * Recibe la conexion completa
     *
     * @param updateId
     * @param precio
     * @param id
     * @param adyacente
     */
    @Override
    public void recibirConnection(String updateId, int precio, int id, int adyacente) {

    }

    /**
     * Este metodo recibe el mensaje descifrado y ...
     *
     * @param source
     * @param target
     * @param updateId
     * @param titulo
     * @param msg
     * @param numero
     */
    @Override
    public void recibirMensaje(long source, long target, String updateId, String titulo, String msg, int numero) {

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

/**
 *
 * @author jhecohe
 */
public class MapaRiesgos {
    
    private int idproceso;
    private String descriesgo;
    private int idfuncionario;
    private String desctipo;
    private String descasociado;
    
    public void mapaRiesgoReporte(){
        
    }

    /**
     * @return the idproceso
     */
    public int getIdproceso() {
        return idproceso;
    }

    /**
     * @param idproceso the idriesgo to set
     */
    public void setIdproceso(int idproceso) {
        this.idproceso = idproceso;
    }

    /**
     * @return the idfuncionario
     */
    public int getIdfuncionario() {
        return idfuncionario;
    }

    /**
     * @param idfuncionario the idfuncionario to set
     */
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    /**
     * @return the descasociado
     */
    public String getDescasociado() {
        return descasociado;
    }

    /**
     * @param descasociado the descasociado to set
     */
    public void setDescasociado(String descasociado) {
        this.descasociado = descasociado;
    }

    /**
     * @return the desctipo
     */
    public String getDesctipo() {
        return desctipo;
    }

    /**
     * @param desctipo the desctipo to set
     */
    public void setDesctipo(String desctipo) {
        this.desctipo = desctipo;
    }

    /**
     * @return the descriesgo
     */
    public String getDescriesgo() {
        return descriesgo;
    }

    /**
     * @param descriesgo the descriesgo to set
     */
    public void setDescriesgo(String descriesgo) {
        this.descriesgo = descriesgo;
    }

}

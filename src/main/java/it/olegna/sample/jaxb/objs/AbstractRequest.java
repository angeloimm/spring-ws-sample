//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.08.16 alle 08:24:14 AM CEST 
//


package it.olegna.sample.jaxb.objs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abstractRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abstractRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractRequest", propOrder = {
    "reqName"
})
public class AbstractRequest {

    @XmlElement(required = true)
    protected String reqName;

    /**
     * Recupera il valore della proprietà reqName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqName() {
        return reqName;
    }

    /**
     * Imposta il valore della proprietà reqName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqName(String value) {
        this.reqName = value;
    }

}

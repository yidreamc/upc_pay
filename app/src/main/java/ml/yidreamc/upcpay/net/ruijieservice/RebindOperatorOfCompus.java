
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldOperatorUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newOperatorUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newOperatorUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oldOperatorUserId",
    "compusName",
    "newOperatorUserId",
    "newOperatorUserPassword"
})
@XmlRootElement(name = "rebindOperatorOfCompus")
public class RebindOperatorOfCompus {

    protected String oldOperatorUserId;
    protected String compusName;
    protected String newOperatorUserId;
    protected String newOperatorUserPassword;

    /**
     * 获取oldOperatorUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldOperatorUserId() {
        return oldOperatorUserId;
    }

    /**
     * 设置oldOperatorUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldOperatorUserId(String value) {
        this.oldOperatorUserId = value;
    }

    /**
     * 获取compusName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompusName() {
        return compusName;
    }

    /**
     * 设置compusName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompusName(String value) {
        this.compusName = value;
    }

    /**
     * 获取newOperatorUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOperatorUserId() {
        return newOperatorUserId;
    }

    /**
     * 设置newOperatorUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOperatorUserId(String value) {
        this.newOperatorUserId = value;
    }

    /**
     * 获取newOperatorUserPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOperatorUserPassword() {
        return newOperatorUserPassword;
    }

    /**
     * 设置newOperatorUserPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOperatorUserPassword(String value) {
        this.newOperatorUserPassword = value;
    }

}

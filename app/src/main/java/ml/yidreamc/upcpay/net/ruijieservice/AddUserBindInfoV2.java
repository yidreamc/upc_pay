
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
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spiUserBindInfoV2" type="{http://api.spl.ruijie.com/}spiUserBindInfoV2" minOccurs="0"/>
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
    "userId",
    "spiUserBindInfoV2"
})
@XmlRootElement(name = "addUserBindInfoV2")
public class AddUserBindInfoV2 {

    protected String userId;
    protected SpiUserBindInfoV2 spiUserBindInfoV2;

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取spiUserBindInfoV2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpiUserBindInfoV2 }
     *     
     */
    public SpiUserBindInfoV2 getSpiUserBindInfoV2() {
        return spiUserBindInfoV2;
    }

    /**
     * 设置spiUserBindInfoV2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpiUserBindInfoV2 }
     *     
     */
    public void setSpiUserBindInfoV2(SpiUserBindInfoV2 value) {
        this.spiUserBindInfoV2 = value;
    }

}

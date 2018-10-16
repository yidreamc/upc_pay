
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
 *         &lt;element name="compusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "compusName",
    "actType",
    "port"
})
@XmlRootElement(name = "noticeReceiveFile")
public class NoticeReceiveFile {

    protected String compusName;
    protected String actType;
    protected int port;

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
     * 获取actType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActType() {
        return actType;
    }

    /**
     * 设置actType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActType(String value) {
        this.actType = value;
    }

    /**
     * 获取port属性的值。
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * 设置port属性的值。
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

}

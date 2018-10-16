
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
 *         &lt;element name="blackListFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blackListExpireTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blackListMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "blackListFlag",
    "blackListExpireTime",
    "blackListMessage"
})
@XmlRootElement(name = "kickOnlineUser")
public class KickOnlineUser {

    protected String userId;
    protected int blackListFlag;
    protected int blackListExpireTime;
    protected String blackListMessage;

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
     * 获取blackListFlag属性的值。
     * 
     */
    public int getBlackListFlag() {
        return blackListFlag;
    }

    /**
     * 设置blackListFlag属性的值。
     * 
     */
    public void setBlackListFlag(int value) {
        this.blackListFlag = value;
    }

    /**
     * 获取blackListExpireTime属性的值。
     * 
     */
    public int getBlackListExpireTime() {
        return blackListExpireTime;
    }

    /**
     * 设置blackListExpireTime属性的值。
     * 
     */
    public void setBlackListExpireTime(int value) {
        this.blackListExpireTime = value;
    }

    /**
     * 获取blackListMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackListMessage() {
        return blackListMessage;
    }

    /**
     * 设置blackListMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackListMessage(String value) {
        this.blackListMessage = value;
    }

}

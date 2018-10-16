
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>usedFreeFlow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="usedFreeFlow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="usedFreeFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFreeFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneAndService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedFreeFlow", propOrder = {
    "chargeType",
    "usedFreeFlow",
    "totalFreeFlow",
    "zoneAndService"
})
public class UsedFreeFlow {

    protected Short chargeType;
    protected String usedFreeFlow;
    protected String totalFreeFlow;
    protected String zoneAndService;

    /**
     * 获取chargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getChargeType() {
        return chargeType;
    }

    /**
     * 设置chargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setChargeType(Short value) {
        this.chargeType = value;
    }

    /**
     * 获取usedFreeFlow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedFreeFlow() {
        return usedFreeFlow;
    }

    /**
     * 设置usedFreeFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedFreeFlow(String value) {
        this.usedFreeFlow = value;
    }

    /**
     * 获取totalFreeFlow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFreeFlow() {
        return totalFreeFlow;
    }

    /**
     * 设置totalFreeFlow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFreeFlow(String value) {
        this.totalFreeFlow = value;
    }

    /**
     * 获取zoneAndService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneAndService() {
        return zoneAndService;
    }

    /**
     * 设置zoneAndService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneAndService(String value) {
        this.zoneAndService = value;
    }

}


package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>findPeriodicPaymentAmountForSelfResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="findPeriodicPaymentAmountForSelfResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="accountFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="periodicPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPeriodicPaymentAmountForSelfResult", propOrder = {
    "accountFee",
    "periodicPaymentAmount"
})
public class FindPeriodicPaymentAmountForSelfResult
    extends SamApiBaseResult
{

    @XmlElement(required = true)
    protected BigDecimal accountFee;
    @XmlElement(required = true)
    protected BigDecimal periodicPaymentAmount;

    /**
     * 获取accountFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountFee() {
        return accountFee;
    }

    /**
     * 设置accountFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountFee(BigDecimal value) {
        this.accountFee = value;
    }

    /**
     * 获取periodicPaymentAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodicPaymentAmount() {
        return periodicPaymentAmount;
    }

    /**
     * 设置periodicPaymentAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodicPaymentAmount(BigDecimal value) {
        this.periodicPaymentAmount = value;
    }

}


package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>queryChargeCardResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryChargeCardResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cardValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryChargeCardResult", propOrder = {
    "cardState",
    "cardValue",
    "errorCode",
    "errorMessage"
})
public class QueryChargeCardResult {

    protected int cardState;
    protected BigDecimal cardValue;
    protected int errorCode;
    protected String errorMessage;

    /**
     * 获取cardState属性的值。
     * 
     */
    public int getCardState() {
        return cardState;
    }

    /**
     * 设置cardState属性的值。
     * 
     */
    public void setCardState(int value) {
        this.cardState = value;
    }

    /**
     * 获取cardValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardValue() {
        return cardValue;
    }

    /**
     * 设置cardValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCardValue(BigDecimal value) {
        this.cardValue = value;
    }

    /**
     * 获取errorCode属性的值。
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * 获取errorMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置errorMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}

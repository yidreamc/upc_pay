
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>accountingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="accountingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountState" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="canOverdraft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overdraftFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overdraftFeeLeft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="preAccountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountingInfo", propOrder = {
    "accountFee",
    "accountId",
    "accountState",
    "canOverdraft",
    "overdraftFee",
    "overdraftFeeLeft",
    "preAccountFee"
})
public class AccountingInfo {

    protected BigDecimal accountFee;
    protected String accountId;
    protected Short accountState;
    protected boolean canOverdraft;
    protected BigDecimal overdraftFee;
    protected BigDecimal overdraftFeeLeft;
    protected BigDecimal preAccountFee;

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
     * 获取accountId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置accountId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * 获取accountState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAccountState() {
        return accountState;
    }

    /**
     * 设置accountState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAccountState(Short value) {
        this.accountState = value;
    }

    /**
     * 获取canOverdraft属性的值。
     * 
     */
    public boolean isCanOverdraft() {
        return canOverdraft;
    }

    /**
     * 设置canOverdraft属性的值。
     * 
     */
    public void setCanOverdraft(boolean value) {
        this.canOverdraft = value;
    }

    /**
     * 获取overdraftFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraftFee() {
        return overdraftFee;
    }

    /**
     * 设置overdraftFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraftFee(BigDecimal value) {
        this.overdraftFee = value;
    }

    /**
     * 获取overdraftFeeLeft属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdraftFeeLeft() {
        return overdraftFeeLeft;
    }

    /**
     * 设置overdraftFeeLeft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdraftFeeLeft(BigDecimal value) {
        this.overdraftFeeLeft = value;
    }

    /**
     * 获取preAccountFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreAccountFee() {
        return preAccountFee;
    }

    /**
     * 设置preAccountFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreAccountFee(BigDecimal value) {
        this.preAccountFee = value;
    }

}

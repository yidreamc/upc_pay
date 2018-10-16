
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>userPolicyChangeName complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userPolicyChangeName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="newPolicyInfoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUserTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newUserpackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPolicyInfoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldUserpackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationTimeType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="processTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userPolicyChangeName", propOrder = {
    "cancelTime",
    "createHost",
    "createTime",
    "lastUpdateHost",
    "lastUpdateTime",
    "newPolicyInfoId",
    "newUserTemplateId",
    "newUserpackageId",
    "oldPolicyInfoId",
    "oldUserpackageId",
    "operationTimeType",
    "operatorId",
    "processState",
    "processTime",
    "sourceType",
    "userId"
})
public class UserPolicyChangeName {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelTime;
    protected String createHost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String lastUpdateHost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTime;
    protected String newPolicyInfoId;
    protected String newUserTemplateId;
    protected String newUserpackageId;
    protected String oldPolicyInfoId;
    protected String oldUserpackageId;
    protected Short operationTimeType;
    protected String operatorId;
    protected int processState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processTime;
    protected int sourceType;
    protected String userId;

    /**
     * 获取cancelTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置cancelTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelTime(XMLGregorianCalendar value) {
        this.cancelTime = value;
    }

    /**
     * 获取createHost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateHost() {
        return createHost;
    }

    /**
     * 设置createHost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateHost(String value) {
        this.createHost = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * 获取lastUpdateHost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateHost() {
        return lastUpdateHost;
    }

    /**
     * 设置lastUpdateHost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateHost(String value) {
        this.lastUpdateHost = value;
    }

    /**
     * 获取lastUpdateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置lastUpdateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTime(XMLGregorianCalendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * 获取newPolicyInfoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPolicyInfoId() {
        return newPolicyInfoId;
    }

    /**
     * 设置newPolicyInfoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPolicyInfoId(String value) {
        this.newPolicyInfoId = value;
    }

    /**
     * 获取newUserTemplateId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUserTemplateId() {
        return newUserTemplateId;
    }

    /**
     * 设置newUserTemplateId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUserTemplateId(String value) {
        this.newUserTemplateId = value;
    }

    /**
     * 获取newUserpackageId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUserpackageId() {
        return newUserpackageId;
    }

    /**
     * 设置newUserpackageId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUserpackageId(String value) {
        this.newUserpackageId = value;
    }

    /**
     * 获取oldPolicyInfoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPolicyInfoId() {
        return oldPolicyInfoId;
    }

    /**
     * 设置oldPolicyInfoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPolicyInfoId(String value) {
        this.oldPolicyInfoId = value;
    }

    /**
     * 获取oldUserpackageId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldUserpackageId() {
        return oldUserpackageId;
    }

    /**
     * 设置oldUserpackageId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldUserpackageId(String value) {
        this.oldUserpackageId = value;
    }

    /**
     * 获取operationTimeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOperationTimeType() {
        return operationTimeType;
    }

    /**
     * 设置operationTimeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOperationTimeType(Short value) {
        this.operationTimeType = value;
    }

    /**
     * 获取operatorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 设置operatorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorId(String value) {
        this.operatorId = value;
    }

    /**
     * 获取processState属性的值。
     * 
     */
    public int getProcessState() {
        return processState;
    }

    /**
     * 设置processState属性的值。
     * 
     */
    public void setProcessState(int value) {
        this.processState = value;
    }

    /**
     * 获取processTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessTime() {
        return processTime;
    }

    /**
     * 设置processTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessTime(XMLGregorianCalendar value) {
        this.processTime = value;
    }

    /**
     * 获取sourceType属性的值。
     * 
     */
    public int getSourceType() {
        return sourceType;
    }

    /**
     * 设置sourceType属性的值。
     * 
     */
    public void setSourceType(int value) {
        this.sourceType = value;
    }

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

}

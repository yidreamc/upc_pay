
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>userFieldInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userFieldInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSelfCanModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isShowOnAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isShowOnSelf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userFieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userFieldInfo", propOrder = {
    "defaultValue",
    "fieldDes",
    "fieldName",
    "fieldOrder",
    "fieldType",
    "isRequired",
    "isSelfCanModify",
    "isShowOnAdmin",
    "isShowOnSelf",
    "userFieldType"
})
public class UserFieldInfo {

    protected String defaultValue;
    protected String fieldDes;
    protected String fieldName;
    protected Long fieldOrder;
    protected Short fieldType;
    protected Boolean isRequired;
    protected Boolean isSelfCanModify;
    protected Boolean isShowOnAdmin;
    protected Boolean isShowOnSelf;
    protected String userFieldType;

    /**
     * 获取defaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置defaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * 获取fieldDes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDes() {
        return fieldDes;
    }

    /**
     * 设置fieldDes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDes(String value) {
        this.fieldDes = value;
    }

    /**
     * 获取fieldName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置fieldName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * 获取fieldOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFieldOrder() {
        return fieldOrder;
    }

    /**
     * 设置fieldOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFieldOrder(Long value) {
        this.fieldOrder = value;
    }

    /**
     * 获取fieldType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFieldType() {
        return fieldType;
    }

    /**
     * 设置fieldType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFieldType(Short value) {
        this.fieldType = value;
    }

    /**
     * 获取isRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * 设置isRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * 获取isSelfCanModify属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelfCanModify() {
        return isSelfCanModify;
    }

    /**
     * 设置isSelfCanModify属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelfCanModify(Boolean value) {
        this.isSelfCanModify = value;
    }

    /**
     * 获取isShowOnAdmin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowOnAdmin() {
        return isShowOnAdmin;
    }

    /**
     * 设置isShowOnAdmin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowOnAdmin(Boolean value) {
        this.isShowOnAdmin = value;
    }

    /**
     * 获取isShowOnSelf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowOnSelf() {
        return isShowOnSelf;
    }

    /**
     * 设置isShowOnSelf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowOnSelf(Boolean value) {
        this.isShowOnSelf = value;
    }

    /**
     * 获取userFieldType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFieldType() {
        return userFieldType;
    }

    /**
     * 设置userFieldType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFieldType(String value) {
        this.userFieldType = value;
    }

}

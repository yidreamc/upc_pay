
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>queryUserParams complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryUserParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authoripV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromAccountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fromAutoLogicDestroyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromPreacctFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fromUserIpv4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupinfoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nasipV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasipV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offSet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyInfoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toAccountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="toAutoLogicDestroyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toPreacctFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="toUserIpv4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPrivilege" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userTemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userVlan" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="useripV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wpNasIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wpNasPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="operatorsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorsUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryUserParams", propOrder = {
    "accountState",
    "address",
    "apMac",
    "authoripV4",
    "certificateNo",
    "certificateType",
    "education",
    "email",
    "field1",
    "field10",
    "field11",
    "field12",
    "field13",
    "field14",
    "field15",
    "field16",
    "field17",
    "field18",
    "field19",
    "field2",
    "field20",
    "field3",
    "field4",
    "field5",
    "field6",
    "field7",
    "field8",
    "field9",
    "filterId",
    "fromAccountFee",
    "fromAutoLogicDestroyTime",
    "fromCreateTime",
    "fromPreacctFee",
    "fromUserIpv4",
    "groupinfoId",
    "limit",
    "mobile",
    "nasPort",
    "nasipV4",
    "nasipV6",
    "offSet",
    "personalInfo",
    "policyInfoId",
    "postCode",
    "reserved0",
    "reserved1",
    "reserved2",
    "reserved3",
    "reserved4",
    "reserved5",
    "reserved6",
    "reserved7",
    "reserved8",
    "reserved9",
    "sex",
    "ssid",
    "telephone",
    "toAccountFee",
    "toAutoLogicDestroyTime",
    "toCreateTime",
    "toPreacctFee",
    "toUserIpv4",
    "userId",
    "userMac",
    "userName",
    "userPackageName",
    "userPrivilege",
    "userTemplateName",
    "userVlan",
    "useripV6",
    "wpNasIp",
    "wpNasPort",
    "operatorsName",
    "operatorsUserId"
})
public class QueryUserParams {

    protected Integer accountState;
    protected String address;
    protected String apMac;
    protected String authoripV4;
    protected String certificateNo;
    protected Integer certificateType;
    protected Integer education;
    protected String email;
    protected String field1;
    protected String field10;
    protected String field11;
    protected String field12;
    protected String field13;
    protected String field14;
    protected String field15;
    protected String field16;
    protected String field17;
    protected String field18;
    protected String field19;
    protected String field2;
    protected String field20;
    protected String field3;
    protected String field4;
    protected String field5;
    protected String field6;
    protected String field7;
    protected String field8;
    protected String field9;
    protected String filterId;
    protected BigDecimal fromAccountFee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromAutoLogicDestroyTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromCreateTime;
    protected BigDecimal fromPreacctFee;
    protected String fromUserIpv4;
    protected String groupinfoId;
    protected int limit;
    protected String mobile;
    protected Long nasPort;
    protected String nasipV4;
    protected String nasipV6;
    protected int offSet;
    protected String personalInfo;
    protected String policyInfoId;
    protected String postCode;
    protected String reserved0;
    protected String reserved1;
    protected String reserved2;
    protected String reserved3;
    protected String reserved4;
    protected String reserved5;
    protected String reserved6;
    protected String reserved7;
    protected String reserved8;
    protected String reserved9;
    protected Integer sex;
    protected String ssid;
    protected String telephone;
    protected BigDecimal toAccountFee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toAutoLogicDestroyTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toCreateTime;
    protected BigDecimal toPreacctFee;
    protected String toUserIpv4;
    protected String userId;
    protected String userMac;
    protected String userName;
    protected String userPackageName;
    protected Integer userPrivilege;
    protected String userTemplateName;
    protected Short userVlan;
    protected String useripV6;
    protected String wpNasIp;
    protected Long wpNasPort;
    protected String operatorsName;
    protected String operatorsUserId;

    /**
     * 获取accountState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountState() {
        return accountState;
    }

    /**
     * 设置accountState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountState(Integer value) {
        this.accountState = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取apMac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApMac() {
        return apMac;
    }

    /**
     * 设置apMac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApMac(String value) {
        this.apMac = value;
    }

    /**
     * 获取authoripV4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoripV4() {
        return authoripV4;
    }

    /**
     * 设置authoripV4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoripV4(String value) {
        this.authoripV4 = value;
    }

    /**
     * 获取certificateNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNo() {
        return certificateNo;
    }

    /**
     * 设置certificateNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNo(String value) {
        this.certificateNo = value;
    }

    /**
     * 获取certificateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    /**
     * 设置certificateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificateType(Integer value) {
        this.certificateType = value;
    }

    /**
     * 获取education属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEducation() {
        return education;
    }

    /**
     * 设置education属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEducation(Integer value) {
        this.education = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取field1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField1() {
        return field1;
    }

    /**
     * 设置field1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField1(String value) {
        this.field1 = value;
    }

    /**
     * 获取field10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField10() {
        return field10;
    }

    /**
     * 设置field10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField10(String value) {
        this.field10 = value;
    }

    /**
     * 获取field11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField11() {
        return field11;
    }

    /**
     * 设置field11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField11(String value) {
        this.field11 = value;
    }

    /**
     * 获取field12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField12() {
        return field12;
    }

    /**
     * 设置field12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField12(String value) {
        this.field12 = value;
    }

    /**
     * 获取field13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField13() {
        return field13;
    }

    /**
     * 设置field13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField13(String value) {
        this.field13 = value;
    }

    /**
     * 获取field14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField14() {
        return field14;
    }

    /**
     * 设置field14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField14(String value) {
        this.field14 = value;
    }

    /**
     * 获取field15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField15() {
        return field15;
    }

    /**
     * 设置field15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField15(String value) {
        this.field15 = value;
    }

    /**
     * 获取field16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField16() {
        return field16;
    }

    /**
     * 设置field16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField16(String value) {
        this.field16 = value;
    }

    /**
     * 获取field17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField17() {
        return field17;
    }

    /**
     * 设置field17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField17(String value) {
        this.field17 = value;
    }

    /**
     * 获取field18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField18() {
        return field18;
    }

    /**
     * 设置field18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField18(String value) {
        this.field18 = value;
    }

    /**
     * 获取field19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField19() {
        return field19;
    }

    /**
     * 设置field19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField19(String value) {
        this.field19 = value;
    }

    /**
     * 获取field2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField2() {
        return field2;
    }

    /**
     * 设置field2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField2(String value) {
        this.field2 = value;
    }

    /**
     * 获取field20属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField20() {
        return field20;
    }

    /**
     * 设置field20属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField20(String value) {
        this.field20 = value;
    }

    /**
     * 获取field3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField3() {
        return field3;
    }

    /**
     * 设置field3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField3(String value) {
        this.field3 = value;
    }

    /**
     * 获取field4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField4() {
        return field4;
    }

    /**
     * 设置field4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField4(String value) {
        this.field4 = value;
    }

    /**
     * 获取field5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField5() {
        return field5;
    }

    /**
     * 设置field5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField5(String value) {
        this.field5 = value;
    }

    /**
     * 获取field6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField6() {
        return field6;
    }

    /**
     * 设置field6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField6(String value) {
        this.field6 = value;
    }

    /**
     * 获取field7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField7() {
        return field7;
    }

    /**
     * 设置field7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField7(String value) {
        this.field7 = value;
    }

    /**
     * 获取field8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField8() {
        return field8;
    }

    /**
     * 设置field8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField8(String value) {
        this.field8 = value;
    }

    /**
     * 获取field9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField9() {
        return field9;
    }

    /**
     * 设置field9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField9(String value) {
        this.field9 = value;
    }

    /**
     * 获取filterId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * 设置filterId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * 获取fromAccountFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromAccountFee() {
        return fromAccountFee;
    }

    /**
     * 设置fromAccountFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromAccountFee(BigDecimal value) {
        this.fromAccountFee = value;
    }

    /**
     * 获取fromAutoLogicDestroyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromAutoLogicDestroyTime() {
        return fromAutoLogicDestroyTime;
    }

    /**
     * 设置fromAutoLogicDestroyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromAutoLogicDestroyTime(XMLGregorianCalendar value) {
        this.fromAutoLogicDestroyTime = value;
    }

    /**
     * 获取fromCreateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromCreateTime() {
        return fromCreateTime;
    }

    /**
     * 设置fromCreateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromCreateTime(XMLGregorianCalendar value) {
        this.fromCreateTime = value;
    }

    /**
     * 获取fromPreacctFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromPreacctFee() {
        return fromPreacctFee;
    }

    /**
     * 设置fromPreacctFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromPreacctFee(BigDecimal value) {
        this.fromPreacctFee = value;
    }

    /**
     * 获取fromUserIpv4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromUserIpv4() {
        return fromUserIpv4;
    }

    /**
     * 设置fromUserIpv4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromUserIpv4(String value) {
        this.fromUserIpv4 = value;
    }

    /**
     * 获取groupinfoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupinfoId() {
        return groupinfoId;
    }

    /**
     * 设置groupinfoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupinfoId(String value) {
        this.groupinfoId = value;
    }

    /**
     * 获取limit属性的值。
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取nasPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNasPort() {
        return nasPort;
    }

    /**
     * 设置nasPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNasPort(Long value) {
        this.nasPort = value;
    }

    /**
     * 获取nasipV4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNasipV4() {
        return nasipV4;
    }

    /**
     * 设置nasipV4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNasipV4(String value) {
        this.nasipV4 = value;
    }

    /**
     * 获取nasipV6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNasipV6() {
        return nasipV6;
    }

    /**
     * 设置nasipV6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNasipV6(String value) {
        this.nasipV6 = value;
    }

    /**
     * 获取offSet属性的值。
     * 
     */
    public int getOffSet() {
        return offSet;
    }

    /**
     * 设置offSet属性的值。
     * 
     */
    public void setOffSet(int value) {
        this.offSet = value;
    }

    /**
     * 获取personalInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalInfo() {
        return personalInfo;
    }

    /**
     * 设置personalInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalInfo(String value) {
        this.personalInfo = value;
    }

    /**
     * 获取policyInfoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyInfoId() {
        return policyInfoId;
    }

    /**
     * 设置policyInfoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyInfoId(String value) {
        this.policyInfoId = value;
    }

    /**
     * 获取postCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置postCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * 获取reserved0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved0() {
        return reserved0;
    }

    /**
     * 设置reserved0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved0(String value) {
        this.reserved0 = value;
    }

    /**
     * 获取reserved1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 设置reserved1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved1(String value) {
        this.reserved1 = value;
    }

    /**
     * 获取reserved2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 设置reserved2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved2(String value) {
        this.reserved2 = value;
    }

    /**
     * 获取reserved3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 设置reserved3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved3(String value) {
        this.reserved3 = value;
    }

    /**
     * 获取reserved4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved4() {
        return reserved4;
    }

    /**
     * 设置reserved4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved4(String value) {
        this.reserved4 = value;
    }

    /**
     * 获取reserved5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved5() {
        return reserved5;
    }

    /**
     * 设置reserved5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved5(String value) {
        this.reserved5 = value;
    }

    /**
     * 获取reserved6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved6() {
        return reserved6;
    }

    /**
     * 设置reserved6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved6(String value) {
        this.reserved6 = value;
    }

    /**
     * 获取reserved7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved7() {
        return reserved7;
    }

    /**
     * 设置reserved7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved7(String value) {
        this.reserved7 = value;
    }

    /**
     * 获取reserved8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved8() {
        return reserved8;
    }

    /**
     * 设置reserved8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved8(String value) {
        this.reserved8 = value;
    }

    /**
     * 获取reserved9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved9() {
        return reserved9;
    }

    /**
     * 设置reserved9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved9(String value) {
        this.reserved9 = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSex(Integer value) {
        this.sex = value;
    }

    /**
     * 获取ssid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * 设置ssid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsid(String value) {
        this.ssid = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取toAccountFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToAccountFee() {
        return toAccountFee;
    }

    /**
     * 设置toAccountFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToAccountFee(BigDecimal value) {
        this.toAccountFee = value;
    }

    /**
     * 获取toAutoLogicDestroyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToAutoLogicDestroyTime() {
        return toAutoLogicDestroyTime;
    }

    /**
     * 设置toAutoLogicDestroyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToAutoLogicDestroyTime(XMLGregorianCalendar value) {
        this.toAutoLogicDestroyTime = value;
    }

    /**
     * 获取toCreateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToCreateTime() {
        return toCreateTime;
    }

    /**
     * 设置toCreateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToCreateTime(XMLGregorianCalendar value) {
        this.toCreateTime = value;
    }

    /**
     * 获取toPreacctFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToPreacctFee() {
        return toPreacctFee;
    }

    /**
     * 设置toPreacctFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToPreacctFee(BigDecimal value) {
        this.toPreacctFee = value;
    }

    /**
     * 获取toUserIpv4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUserIpv4() {
        return toUserIpv4;
    }

    /**
     * 设置toUserIpv4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUserIpv4(String value) {
        this.toUserIpv4 = value;
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

    /**
     * 获取userMac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMac() {
        return userMac;
    }

    /**
     * 设置userMac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMac(String value) {
        this.userMac = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取userPackageName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPackageName() {
        return userPackageName;
    }

    /**
     * 设置userPackageName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPackageName(String value) {
        this.userPackageName = value;
    }

    /**
     * 获取userPrivilege属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserPrivilege() {
        return userPrivilege;
    }

    /**
     * 设置userPrivilege属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserPrivilege(Integer value) {
        this.userPrivilege = value;
    }

    /**
     * 获取userTemplateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTemplateName() {
        return userTemplateName;
    }

    /**
     * 设置userTemplateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTemplateName(String value) {
        this.userTemplateName = value;
    }

    /**
     * 获取userVlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUserVlan() {
        return userVlan;
    }

    /**
     * 设置userVlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserVlan(Short value) {
        this.userVlan = value;
    }

    /**
     * 获取useripV6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseripV6() {
        return useripV6;
    }

    /**
     * 设置useripV6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseripV6(String value) {
        this.useripV6 = value;
    }

    /**
     * 获取wpNasIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWpNasIp() {
        return wpNasIp;
    }

    /**
     * 设置wpNasIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWpNasIp(String value) {
        this.wpNasIp = value;
    }

    /**
     * 获取wpNasPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWpNasPort() {
        return wpNasPort;
    }

    /**
     * 设置wpNasPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWpNasPort(Long value) {
        this.wpNasPort = value;
    }

    /**
     * 获取operatorsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorsName() {
        return operatorsName;
    }

    /**
     * 设置operatorsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorsName(String value) {
        this.operatorsName = value;
    }

    /**
     * 获取operatorsUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorsUserId() {
        return operatorsUserId;
    }

    /**
     * 设置operatorsUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorsUserId(String value) {
        this.operatorsUserId = value;
    }

}

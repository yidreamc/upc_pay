
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>regUserParams complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="regUserParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edu" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="loginInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIpV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regUserParams", propOrder = {
    "address",
    "certNo",
    "certType",
    "edu",
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
    "loginInfo",
    "memo",
    "mobile",
    "password",
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
    "tel",
    "userId",
    "userIp",
    "userIpV6",
    "userMac",
    "userName"
})
public class RegUserParams {

    protected String address;
    protected String certNo;
    protected int certType;
    protected int edu;
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
    protected String loginInfo;
    protected String memo;
    protected String mobile;
    protected String password;
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
    protected int sex;
    protected String tel;
    protected String userId;
    protected String userIp;
    protected String userIpV6;
    protected String userMac;
    protected String userName;

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
     * 获取certNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置certNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertNo(String value) {
        this.certNo = value;
    }

    /**
     * 获取certType属性的值。
     * 
     */
    public int getCertType() {
        return certType;
    }

    /**
     * 设置certType属性的值。
     * 
     */
    public void setCertType(int value) {
        this.certType = value;
    }

    /**
     * 获取edu属性的值。
     * 
     */
    public int getEdu() {
        return edu;
    }

    /**
     * 设置edu属性的值。
     * 
     */
    public void setEdu(int value) {
        this.edu = value;
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
     * 获取loginInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginInfo() {
        return loginInfo;
    }

    /**
     * 设置loginInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginInfo(String value) {
        this.loginInfo = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     */
    public int getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

    /**
     * 获取tel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置tel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
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
     * 获取userIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 设置userIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIp(String value) {
        this.userIp = value;
    }

    /**
     * 获取userIpV6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIpV6() {
        return userIpV6;
    }

    /**
     * 设置userIpV6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIpV6(String value) {
        this.userIpV6 = value;
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

}

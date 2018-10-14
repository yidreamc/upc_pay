
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>accountFlowInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="accountFlowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accountPreFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accounttingRule" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="badBillFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="campusDownFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="campusUpFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dayComps" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="destroyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destroyType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="flowSumComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="foreDownComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="foreUpComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="foreignDownFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="foreignUpFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inlandDownComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inlandDownFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inlandUpComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inlandUpFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthComps" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ntdFlowCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oddFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overRaraftFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overRaraftFeeLeft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sesstionTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeComps" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalBillFlowByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalTrafficByte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trafficComps" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webOpType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="writeOff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountFlowInfo", propOrder = {
    "accessType",
    "accountFee",
    "accountPreFee",
    "accounttingRule",
    "areaName",
    "badBillFee",
    "beginTime",
    "billOut",
    "campusDownFlowByte",
    "campusUpFlowByte",
    "chargeType",
    "createTime",
    "dayComps",
    "destroyTime",
    "destroyType",
    "fee",
    "flowSumComps",
    "foreDownComps",
    "foreUpComps",
    "foreignDownFlowByte",
    "foreignUpFlowByte",
    "groupId",
    "inlandDownComps",
    "inlandDownFlowByte",
    "inlandUpComps",
    "inlandUpFlowByte",
    "managerId",
    "managerIp",
    "monthComps",
    "ntdFlowCause",
    "oddFee",
    "overRaraftFee",
    "overRaraftFeeLeft",
    "packageName",
    "policyId",
    "serviceId",
    "serviceSuffix",
    "sesstionTime",
    "timeComps",
    "totalBillFlowByte",
    "totalTrafficByte",
    "trafficComps",
    "userId",
    "webOpType",
    "writeOff",
    "reserved0",
    "reserved1",
    "reserved2",
    "reserved3",
    "reserved4",
    "reserved5",
    "reserved6",
    "reserved7",
    "reserved8",
    "reserved9"
})
public class AccountFlowInfo {

    protected int accessType;
    protected BigDecimal accountFee;
    protected BigDecimal accountPreFee;
    protected int accounttingRule;
    protected String areaName;
    protected BigDecimal badBillFee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    protected boolean billOut;
    protected BigDecimal campusDownFlowByte;
    protected BigDecimal campusUpFlowByte;
    protected int chargeType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected long dayComps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar destroyTime;
    protected int destroyType;
    protected BigDecimal fee;
    protected BigDecimal flowSumComps;
    protected BigDecimal foreDownComps;
    protected BigDecimal foreUpComps;
    protected BigDecimal foreignDownFlowByte;
    protected BigDecimal foreignUpFlowByte;
    protected String groupId;
    protected BigDecimal inlandDownComps;
    protected BigDecimal inlandDownFlowByte;
    protected BigDecimal inlandUpComps;
    protected BigDecimal inlandUpFlowByte;
    protected String managerId;
    protected String managerIp;
    protected long monthComps;
    protected String ntdFlowCause;
    protected BigDecimal oddFee;
    protected BigDecimal overRaraftFee;
    protected BigDecimal overRaraftFeeLeft;
    protected String packageName;
    protected String policyId;
    protected String serviceId;
    protected String serviceSuffix;
    protected long sesstionTime;
    protected long timeComps;
    protected BigDecimal totalBillFlowByte;
    protected BigDecimal totalTrafficByte;
    protected BigDecimal trafficComps;
    protected String userId;
    protected int webOpType;
    protected boolean writeOff;
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

    /**
     * 获取accessType属性的值。
     * 
     */
    public int getAccessType() {
        return accessType;
    }

    /**
     * 设置accessType属性的值。
     * 
     */
    public void setAccessType(int value) {
        this.accessType = value;
    }

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
     * 获取accountPreFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountPreFee() {
        return accountPreFee;
    }

    /**
     * 设置accountPreFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountPreFee(BigDecimal value) {
        this.accountPreFee = value;
    }

    /**
     * 获取accounttingRule属性的值。
     * 
     */
    public int getAccounttingRule() {
        return accounttingRule;
    }

    /**
     * 设置accounttingRule属性的值。
     * 
     */
    public void setAccounttingRule(int value) {
        this.accounttingRule = value;
    }

    /**
     * 获取areaName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置areaName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * 获取badBillFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBadBillFee() {
        return badBillFee;
    }

    /**
     * 设置badBillFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBadBillFee(BigDecimal value) {
        this.badBillFee = value;
    }

    /**
     * 获取beginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * 获取billOut属性的值。
     * 
     */
    public boolean isBillOut() {
        return billOut;
    }

    /**
     * 设置billOut属性的值。
     * 
     */
    public void setBillOut(boolean value) {
        this.billOut = value;
    }

    /**
     * 获取campusDownFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCampusDownFlowByte() {
        return campusDownFlowByte;
    }

    /**
     * 设置campusDownFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCampusDownFlowByte(BigDecimal value) {
        this.campusDownFlowByte = value;
    }

    /**
     * 获取campusUpFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCampusUpFlowByte() {
        return campusUpFlowByte;
    }

    /**
     * 设置campusUpFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCampusUpFlowByte(BigDecimal value) {
        this.campusUpFlowByte = value;
    }

    /**
     * 获取chargeType属性的值。
     * 
     */
    public int getChargeType() {
        return chargeType;
    }

    /**
     * 设置chargeType属性的值。
     * 
     */
    public void setChargeType(int value) {
        this.chargeType = value;
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
     * 获取dayComps属性的值。
     * 
     */
    public long getDayComps() {
        return dayComps;
    }

    /**
     * 设置dayComps属性的值。
     * 
     */
    public void setDayComps(long value) {
        this.dayComps = value;
    }

    /**
     * 获取destroyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDestroyTime() {
        return destroyTime;
    }

    /**
     * 设置destroyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDestroyTime(XMLGregorianCalendar value) {
        this.destroyTime = value;
    }

    /**
     * 获取destroyType属性的值。
     * 
     */
    public int getDestroyType() {
        return destroyType;
    }

    /**
     * 设置destroyType属性的值。
     * 
     */
    public void setDestroyType(int value) {
        this.destroyType = value;
    }

    /**
     * 获取fee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置fee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * 获取flowSumComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlowSumComps() {
        return flowSumComps;
    }

    /**
     * 设置flowSumComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlowSumComps(BigDecimal value) {
        this.flowSumComps = value;
    }

    /**
     * 获取foreDownComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeDownComps() {
        return foreDownComps;
    }

    /**
     * 设置foreDownComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeDownComps(BigDecimal value) {
        this.foreDownComps = value;
    }

    /**
     * 获取foreUpComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeUpComps() {
        return foreUpComps;
    }

    /**
     * 设置foreUpComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeUpComps(BigDecimal value) {
        this.foreUpComps = value;
    }

    /**
     * 获取foreignDownFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignDownFlowByte() {
        return foreignDownFlowByte;
    }

    /**
     * 设置foreignDownFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignDownFlowByte(BigDecimal value) {
        this.foreignDownFlowByte = value;
    }

    /**
     * 获取foreignUpFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForeignUpFlowByte() {
        return foreignUpFlowByte;
    }

    /**
     * 设置foreignUpFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForeignUpFlowByte(BigDecimal value) {
        this.foreignUpFlowByte = value;
    }

    /**
     * 获取groupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置groupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * 获取inlandDownComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInlandDownComps() {
        return inlandDownComps;
    }

    /**
     * 设置inlandDownComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInlandDownComps(BigDecimal value) {
        this.inlandDownComps = value;
    }

    /**
     * 获取inlandDownFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInlandDownFlowByte() {
        return inlandDownFlowByte;
    }

    /**
     * 设置inlandDownFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInlandDownFlowByte(BigDecimal value) {
        this.inlandDownFlowByte = value;
    }

    /**
     * 获取inlandUpComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInlandUpComps() {
        return inlandUpComps;
    }

    /**
     * 设置inlandUpComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInlandUpComps(BigDecimal value) {
        this.inlandUpComps = value;
    }

    /**
     * 获取inlandUpFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInlandUpFlowByte() {
        return inlandUpFlowByte;
    }

    /**
     * 设置inlandUpFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInlandUpFlowByte(BigDecimal value) {
        this.inlandUpFlowByte = value;
    }

    /**
     * 获取managerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * 设置managerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * 获取managerIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerIp() {
        return managerIp;
    }

    /**
     * 设置managerIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerIp(String value) {
        this.managerIp = value;
    }

    /**
     * 获取monthComps属性的值。
     * 
     */
    public long getMonthComps() {
        return monthComps;
    }

    /**
     * 设置monthComps属性的值。
     * 
     */
    public void setMonthComps(long value) {
        this.monthComps = value;
    }

    /**
     * 获取ntdFlowCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtdFlowCause() {
        return ntdFlowCause;
    }

    /**
     * 设置ntdFlowCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtdFlowCause(String value) {
        this.ntdFlowCause = value;
    }

    /**
     * 获取oddFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOddFee() {
        return oddFee;
    }

    /**
     * 设置oddFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOddFee(BigDecimal value) {
        this.oddFee = value;
    }

    /**
     * 获取overRaraftFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverRaraftFee() {
        return overRaraftFee;
    }

    /**
     * 设置overRaraftFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverRaraftFee(BigDecimal value) {
        this.overRaraftFee = value;
    }

    /**
     * 获取overRaraftFeeLeft属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverRaraftFeeLeft() {
        return overRaraftFeeLeft;
    }

    /**
     * 设置overRaraftFeeLeft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverRaraftFeeLeft(BigDecimal value) {
        this.overRaraftFeeLeft = value;
    }

    /**
     * 获取packageName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置packageName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * 获取policyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * 设置policyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * 获取serviceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 设置serviceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * 获取serviceSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSuffix() {
        return serviceSuffix;
    }

    /**
     * 设置serviceSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSuffix(String value) {
        this.serviceSuffix = value;
    }

    /**
     * 获取sesstionTime属性的值。
     * 
     */
    public long getSesstionTime() {
        return sesstionTime;
    }

    /**
     * 设置sesstionTime属性的值。
     * 
     */
    public void setSesstionTime(long value) {
        this.sesstionTime = value;
    }

    /**
     * 获取timeComps属性的值。
     * 
     */
    public long getTimeComps() {
        return timeComps;
    }

    /**
     * 设置timeComps属性的值。
     * 
     */
    public void setTimeComps(long value) {
        this.timeComps = value;
    }

    /**
     * 获取totalBillFlowByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBillFlowByte() {
        return totalBillFlowByte;
    }

    /**
     * 设置totalBillFlowByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBillFlowByte(BigDecimal value) {
        this.totalBillFlowByte = value;
    }

    /**
     * 获取totalTrafficByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTrafficByte() {
        return totalTrafficByte;
    }

    /**
     * 设置totalTrafficByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTrafficByte(BigDecimal value) {
        this.totalTrafficByte = value;
    }

    /**
     * 获取trafficComps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrafficComps() {
        return trafficComps;
    }

    /**
     * 设置trafficComps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrafficComps(BigDecimal value) {
        this.trafficComps = value;
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
     * 获取webOpType属性的值。
     * 
     */
    public int getWebOpType() {
        return webOpType;
    }

    /**
     * 设置webOpType属性的值。
     * 
     */
    public void setWebOpType(int value) {
        this.webOpType = value;
    }

    /**
     * 获取writeOff属性的值。
     * 
     */
    public boolean isWriteOff() {
        return writeOff;
    }

    /**
     * 设置writeOff属性的值。
     * 
     */
    public void setWriteOff(boolean value) {
        this.writeOff = value;
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

}

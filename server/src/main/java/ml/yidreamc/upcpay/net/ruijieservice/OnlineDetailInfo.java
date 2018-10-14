
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>onlineDetailInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="onlineDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountingRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internetAccessFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRoaming" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="logoutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nasIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasIpv6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlineSec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminateCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timesegmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTraffic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tunnelClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tunnelServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIpv4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIpv6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usergroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wpNasIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wpNasPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onlineDetailInfo", propOrder = {
    "accountId",
    "accountingRule",
    "apMac",
    "areaName",
    "internetAccessFee",
    "isRoaming",
    "loginTime",
    "logoutTime",
    "nasIp",
    "nasIpv6",
    "onlineSec",
    "packageName",
    "policyId",
    "proxyName",
    "serviceId",
    "serviceSuffix",
    "ssid",
    "suVersion",
    "terminateCause",
    "timesegmentId",
    "totalTraffic",
    "tunnelClient",
    "tunnelServer",
    "userId",
    "userIpv4",
    "userIpv6",
    "userMac",
    "userTemplateId",
    "usergroupId",
    "wpNasIp",
    "wpNasPort"
})
public class OnlineDetailInfo {

    protected String accountId;
    protected String accountingRule;
    protected String apMac;
    protected String areaName;
    protected String internetAccessFee;
    protected Boolean isRoaming;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loginTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logoutTime;
    protected String nasIp;
    protected String nasIpv6;
    protected Long onlineSec;
    protected String packageName;
    protected String policyId;
    protected String proxyName;
    protected String serviceId;
    protected String serviceSuffix;
    protected String ssid;
    protected String suVersion;
    protected String terminateCause;
    protected String timesegmentId;
    protected BigDecimal totalTraffic;
    protected String tunnelClient;
    protected String tunnelServer;
    protected String userId;
    protected String userIpv4;
    protected String userIpv6;
    protected String userMac;
    protected String userTemplateId;
    protected String usergroupId;
    protected String wpNasIp;
    protected Long wpNasPort;

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
     * 获取accountingRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingRule() {
        return accountingRule;
    }

    /**
     * 设置accountingRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingRule(String value) {
        this.accountingRule = value;
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
     * 获取internetAccessFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAccessFee() {
        return internetAccessFee;
    }

    /**
     * 设置internetAccessFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAccessFee(String value) {
        this.internetAccessFee = value;
    }

    /**
     * 获取isRoaming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoaming() {
        return isRoaming;
    }

    /**
     * 设置isRoaming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoaming(Boolean value) {
        this.isRoaming = value;
    }

    /**
     * 获取loginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoginTime() {
        return loginTime;
    }

    /**
     * 设置loginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoginTime(XMLGregorianCalendar value) {
        this.loginTime = value;
    }

    /**
     * 获取logoutTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogoutTime() {
        return logoutTime;
    }

    /**
     * 设置logoutTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogoutTime(XMLGregorianCalendar value) {
        this.logoutTime = value;
    }

    /**
     * 获取nasIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNasIp() {
        return nasIp;
    }

    /**
     * 设置nasIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNasIp(String value) {
        this.nasIp = value;
    }

    /**
     * 获取nasIpv6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNasIpv6() {
        return nasIpv6;
    }

    /**
     * 设置nasIpv6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNasIpv6(String value) {
        this.nasIpv6 = value;
    }

    /**
     * 获取onlineSec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnlineSec() {
        return onlineSec;
    }

    /**
     * 设置onlineSec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnlineSec(Long value) {
        this.onlineSec = value;
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
     * 获取proxyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyName() {
        return proxyName;
    }

    /**
     * 设置proxyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyName(String value) {
        this.proxyName = value;
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
     * 获取suVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuVersion() {
        return suVersion;
    }

    /**
     * 设置suVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuVersion(String value) {
        this.suVersion = value;
    }

    /**
     * 获取terminateCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateCause() {
        return terminateCause;
    }

    /**
     * 设置terminateCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateCause(String value) {
        this.terminateCause = value;
    }

    /**
     * 获取timesegmentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesegmentId() {
        return timesegmentId;
    }

    /**
     * 设置timesegmentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesegmentId(String value) {
        this.timesegmentId = value;
    }

    /**
     * 获取totalTraffic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTraffic() {
        return totalTraffic;
    }

    /**
     * 设置totalTraffic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTraffic(BigDecimal value) {
        this.totalTraffic = value;
    }

    /**
     * 获取tunnelClient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelClient() {
        return tunnelClient;
    }

    /**
     * 设置tunnelClient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelClient(String value) {
        this.tunnelClient = value;
    }

    /**
     * 获取tunnelServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelServer() {
        return tunnelServer;
    }

    /**
     * 设置tunnelServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelServer(String value) {
        this.tunnelServer = value;
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
     * 获取userIpv4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIpv4() {
        return userIpv4;
    }

    /**
     * 设置userIpv4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIpv4(String value) {
        this.userIpv4 = value;
    }

    /**
     * 获取userIpv6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIpv6() {
        return userIpv6;
    }

    /**
     * 设置userIpv6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIpv6(String value) {
        this.userIpv6 = value;
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
     * 获取userTemplateId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTemplateId() {
        return userTemplateId;
    }

    /**
     * 设置userTemplateId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTemplateId(String value) {
        this.userTemplateId = value;
    }

    /**
     * 获取usergroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsergroupId() {
        return usergroupId;
    }

    /**
     * 设置usergroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsergroupId(String value) {
        this.usergroupId = value;
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

}


package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>findFtpExportResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="findFtpExportResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exportTables" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ftpBakPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftpServerIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftpServerPort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ftpUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFtpExportResult", propOrder = {
    "errorCode",
    "errorMessage",
    "exportTables",
    "ftpBakPath",
    "ftpServerIp",
    "ftpServerPort",
    "ftpUser"
})
public class FindFtpExportResult {

    protected int errorCode;
    protected String errorMessage;
    @XmlElement(nillable = true)
    protected List<String> exportTables;
    protected String ftpBakPath;
    protected String ftpServerIp;
    protected Long ftpServerPort;
    protected String ftpUser;

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

    /**
     * Gets the value of the exportTables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportTables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportTables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExportTables() {
        if (exportTables == null) {
            exportTables = new ArrayList<String>();
        }
        return this.exportTables;
    }

    /**
     * 获取ftpBakPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpBakPath() {
        return ftpBakPath;
    }

    /**
     * 设置ftpBakPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpBakPath(String value) {
        this.ftpBakPath = value;
    }

    /**
     * 获取ftpServerIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpServerIp() {
        return ftpServerIp;
    }

    /**
     * 设置ftpServerIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpServerIp(String value) {
        this.ftpServerIp = value;
    }

    /**
     * 获取ftpServerPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFtpServerPort() {
        return ftpServerPort;
    }

    /**
     * 设置ftpServerPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFtpServerPort(Long value) {
        this.ftpServerPort = value;
    }

    /**
     * 获取ftpUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUser() {
        return ftpUser;
    }

    /**
     * 设置ftpUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUser(String value) {
        this.ftpUser = value;
    }

}


package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceIps" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noticeContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noticeExpireTtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceIps",
    "noticeContent",
    "noticeExpireTtime"
})
@XmlRootElement(name = "sendMessageByDevice")
public class SendMessageByDevice {

    protected List<String> deviceIps;
    protected String noticeContent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar noticeExpireTtime;

    /**
     * Gets the value of the deviceIps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceIps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceIps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeviceIps() {
        if (deviceIps == null) {
            deviceIps = new ArrayList<String>();
        }
        return this.deviceIps;
    }

    /**
     * 获取noticeContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 设置noticeContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeContent(String value) {
        this.noticeContent = value;
    }

    /**
     * 获取noticeExpireTtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNoticeExpireTtime() {
        return noticeExpireTtime;
    }

    /**
     * 设置noticeExpireTtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNoticeExpireTtime(XMLGregorianCalendar value) {
        this.noticeExpireTtime = value;
    }

}

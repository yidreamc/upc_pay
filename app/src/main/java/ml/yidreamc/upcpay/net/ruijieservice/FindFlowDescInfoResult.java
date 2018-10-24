
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>findFlowDescInfoResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="findFlowDescInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowDescInfo" type="{http://api.spl.ruijie.com/}flowDescInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFlowDescInfoResult", propOrder = {
    "errorCode",
    "errorMessage",
    "flowDescInfo"
})
public class FindFlowDescInfoResult {

    protected int errorCode;
    protected String errorMessage;
    protected FlowDescInfo flowDescInfo;

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
     * 获取flowDescInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlowDescInfo }
     *     
     */
    public FlowDescInfo getFlowDescInfo() {
        return flowDescInfo;
    }

    /**
     * 设置flowDescInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDescInfo }
     *     
     */
    public void setFlowDescInfo(FlowDescInfo value) {
        this.flowDescInfo = value;
    }

}

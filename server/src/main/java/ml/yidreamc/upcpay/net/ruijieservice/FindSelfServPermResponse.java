
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="findSelfServPermResult" type="{http://api.spl.ruijie.com/}findSelfServPermResult" minOccurs="0"/>
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
    "findSelfServPermResult"
})
@XmlRootElement(name = "findSelfServPermResponse")
public class FindSelfServPermResponse {

    protected FindSelfServPermResult findSelfServPermResult;

    /**
     * 获取findSelfServPermResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FindSelfServPermResult }
     *     
     */
    public FindSelfServPermResult getFindSelfServPermResult() {
        return findSelfServPermResult;
    }

    /**
     * 设置findSelfServPermResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FindSelfServPermResult }
     *     
     */
    public void setFindSelfServPermResult(FindSelfServPermResult value) {
        this.findSelfServPermResult = value;
    }

}

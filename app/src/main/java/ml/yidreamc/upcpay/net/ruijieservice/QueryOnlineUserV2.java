
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
 *         &lt;element name="param" type="{http://api.spl.ruijie.com/}queryOnlineUserParam" minOccurs="0"/>
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
    "param"
})
@XmlRootElement(name = "queryOnlineUserV2")
public class QueryOnlineUserV2 {

    protected QueryOnlineUserParam param;

    /**
     * 获取param属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryOnlineUserParam }
     *     
     */
    public QueryOnlineUserParam getParam() {
        return param;
    }

    /**
     * 设置param属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOnlineUserParam }
     *     
     */
    public void setParam(QueryOnlineUserParam value) {
        this.param = value;
    }

}

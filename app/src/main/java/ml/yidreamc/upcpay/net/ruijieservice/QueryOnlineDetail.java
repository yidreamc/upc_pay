
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
 *         &lt;element name="queryOnlineDetailParams" type="{http://api.spl.ruijie.com/}queryOnlineDetailParams" minOccurs="0"/>
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
    "queryOnlineDetailParams"
})
@XmlRootElement(name = "queryOnlineDetail")
public class QueryOnlineDetail {

    protected QueryOnlineDetailParams queryOnlineDetailParams;

    /**
     * 获取queryOnlineDetailParams属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryOnlineDetailParams }
     *     
     */
    public QueryOnlineDetailParams getQueryOnlineDetailParams() {
        return queryOnlineDetailParams;
    }

    /**
     * 设置queryOnlineDetailParams属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOnlineDetailParams }
     *     
     */
    public void setQueryOnlineDetailParams(QueryOnlineDetailParams value) {
        this.queryOnlineDetailParams = value;
    }

}

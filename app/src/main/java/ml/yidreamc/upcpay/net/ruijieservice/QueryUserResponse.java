
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
 *         &lt;element name="queryUserResult" type="{http://api.spl.ruijie.com/}queryUserResult" minOccurs="0"/>
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
    "queryUserResult"
})
@XmlRootElement(name = "queryUserResponse")
public class QueryUserResponse {

    protected QueryUserResult queryUserResult;

    /**
     * 获取queryUserResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryUserResult }
     *     
     */
    public QueryUserResult getQueryUserResult() {
        return queryUserResult;
    }

    /**
     * 设置queryUserResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryUserResult }
     *     
     */
    public void setQueryUserResult(QueryUserResult value) {
        this.queryUserResult = value;
    }

}

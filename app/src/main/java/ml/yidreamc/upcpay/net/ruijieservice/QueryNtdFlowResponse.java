
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
 *         &lt;element name="queryNtdFlowResult" type="{http://api.spl.ruijie.com/}queryNtdFlowResult" minOccurs="0"/>
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
    "queryNtdFlowResult"
})
@XmlRootElement(name = "queryNtdFlowResponse")
public class QueryNtdFlowResponse {

    protected QueryNtdFlowResult queryNtdFlowResult;

    /**
     * 获取queryNtdFlowResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryNtdFlowResult }
     *     
     */
    public QueryNtdFlowResult getQueryNtdFlowResult() {
        return queryNtdFlowResult;
    }

    /**
     * 设置queryNtdFlowResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryNtdFlowResult }
     *     
     */
    public void setQueryNtdFlowResult(QueryNtdFlowResult value) {
        this.queryNtdFlowResult = value;
    }

}

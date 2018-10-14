
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>findFlowRefuelPackageListByUserIdResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="findFlowRefuelPackageListByUserIdResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="flowRefuelPackages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFlowRefuelPackageListByUserIdResult", propOrder = {
    "flowRefuelPackages"
})
public class FindFlowRefuelPackageListByUserIdResult
    extends SamApiBaseResult
{

    @XmlElement(required = true)
    protected String flowRefuelPackages;

    /**
     * 获取flowRefuelPackages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowRefuelPackages() {
        return flowRefuelPackages;
    }

    /**
     * 设置flowRefuelPackages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowRefuelPackages(String value) {
        this.flowRefuelPackages = value;
    }

}

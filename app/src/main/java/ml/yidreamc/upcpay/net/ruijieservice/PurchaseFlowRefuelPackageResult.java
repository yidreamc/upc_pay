
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>purchaseFlowRefuelPackageResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="purchaseFlowRefuelPackageResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="isSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseFlowRefuelPackageResult", propOrder = {
    "isSuccess"
})
public class PurchaseFlowRefuelPackageResult
    extends SamApiBaseResult
{

    protected boolean isSuccess;

    /**
     * 获取isSuccess属性的值。
     * 
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * 设置isSuccess属性的值。
     * 
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

}

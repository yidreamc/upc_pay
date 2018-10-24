
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>verifyPeriodStrategyUserResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="verifyPeriodStrategyUserResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="periodUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyPeriodStrategyUserResult", propOrder = {
    "periodUser"
})
public class VerifyPeriodStrategyUserResult
    extends SamApiBaseResult
{

    protected boolean periodUser;

    /**
     * 获取periodUser属性的值。
     * 
     */
    public boolean isPeriodUser() {
        return periodUser;
    }

    /**
     * 设置periodUser属性的值。
     * 
     */
    public void setPeriodUser(boolean value) {
        this.periodUser = value;
    }

}

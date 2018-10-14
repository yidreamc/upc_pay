
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>verifyManagerPasswordResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="verifyManagerPasswordResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="passwordCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyManagerPasswordResult", propOrder = {
    "passwordCorrect"
})
public class VerifyManagerPasswordResult
    extends SamApiBaseResult
{

    protected boolean passwordCorrect;

    /**
     * 获取passwordCorrect属性的值。
     * 
     */
    public boolean isPasswordCorrect() {
        return passwordCorrect;
    }

    /**
     * 设置passwordCorrect属性的值。
     * 
     */
    public void setPasswordCorrect(boolean value) {
        this.passwordCorrect = value;
    }

}

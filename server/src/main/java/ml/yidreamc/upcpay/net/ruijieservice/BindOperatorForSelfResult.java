
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bindOperatorForSelfResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bindOperatorForSelfResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="bindTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindOperatorForSelfResult", propOrder = {
    "bindTimes"
})
public class BindOperatorForSelfResult
    extends SamApiBaseResult
{

    protected int bindTimes;

    /**
     * 获取bindTimes属性的值。
     * 
     */
    public int getBindTimes() {
        return bindTimes;
    }

    /**
     * 设置bindTimes属性的值。
     * 
     */
    public void setBindTimes(int value) {
        this.bindTimes = value;
    }

}

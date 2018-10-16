
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sendMessageResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="sendMessageResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="messageSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageResult", propOrder = {
    "messageSent"
})
public class SendMessageResult
    extends SamApiBaseResult
{

    protected boolean messageSent;

    /**
     * 获取messageSent属性的值。
     * 
     */
    public boolean isMessageSent() {
        return messageSent;
    }

    /**
     * 设置messageSent属性的值。
     * 
     */
    public void setMessageSent(boolean value) {
        this.messageSent = value;
    }

}

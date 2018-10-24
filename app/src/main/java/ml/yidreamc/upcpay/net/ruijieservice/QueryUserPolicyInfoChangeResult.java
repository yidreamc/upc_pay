
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>queryUserPolicyInfoChangeResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryUserPolicyInfoChangeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.spl.ruijie.com/}samApiBaseResult">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userPolicyChange" type="{http://api.spl.ruijie.com/}userPolicyChangeName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryUserPolicyInfoChangeResult", propOrder = {
    "total",
    "userPolicyChange"
})
public class QueryUserPolicyInfoChangeResult
    extends SamApiBaseResult
{

    protected int total;
    @XmlElement(nillable = true)
    protected List<UserPolicyChangeName> userPolicyChange;

    /**
     * 获取total属性的值。
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the userPolicyChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPolicyChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPolicyChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserPolicyChangeName }
     * 
     * 
     */
    public List<UserPolicyChangeName> getUserPolicyChange() {
        if (userPolicyChange == null) {
            userPolicyChange = new ArrayList<UserPolicyChangeName>();
        }
        return this.userPolicyChange;
    }

}

package com.example.payment.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * cacher utils
 */
public class XMLUtils {

    /**
     * 将 model javaBean 转为 xml 数据
     *
     * @param object 要转为 xml 的 Model 对象
     * @param <T>    对象的类
     * @return xml 数据
     */
    public static <T> String javaBean2xml(T object) {
        String result = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());

            Marshaller marshaller = jaxbContext.createMarshaller();

            StringWriter stringWriter = new StringWriter();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            marshaller.marshal(object, stringWriter);
            result = stringWriter.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 将 xml 转为 model javaBean
     *
     * @param data xml 数据
     * @param <T>  javaBean 类型
     * @return 相应的 javaBean 对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T xml2javaBean(String data) {
        try {
            JAXBContext context = JAXBContext.newInstance(PayResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(data);
            return (T) unmarshaller.unmarshal(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

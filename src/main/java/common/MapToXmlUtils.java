package common;

import java.util.Map;

public class MapToXmlUtils {

    public static String getXmlRequestData(Map requestDataMap){
        if(requestDataMap == null || requestDataMap.isEmpty())
            return null;

        StringBuilder requestData = new StringBuilder();

        requestDataMap.forEach(
                (key, value)-> requestData
                                .append("<").append(key).append(">")
                                .append(value)
                                .append("</").append(key).append(">")
                );

        return requestData.toString();
    }
}

package ml.yidreamc.upcpay.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * DateDto class.
 * @author Yidreamc
 */
@Data
@AllArgsConstructor
public class DateDto implements Serializable {

    int startHour;
    int startMin;
    int endHour;
    int endMin;
    String msg;
}

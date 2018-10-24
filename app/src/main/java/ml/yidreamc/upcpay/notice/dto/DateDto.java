package ml.yidreamc.upcpay.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DateDto {

    int startHour;
    int startMin;
    int endHour;
    int endMin;
}

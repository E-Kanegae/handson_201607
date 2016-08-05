/**
 * @(#)MeetingOutputBean.java
 * 
 */
package jp.co.handson.domain.model.meeting;

import java.io.Serializable;
import lombok.Data;

/**
 * [このクラスの説明を書きましょう]
 * @version $Revision$
 */
@Data
public class MeetingOutputBean implements Serializable {


    private static final long serialVersionUID = 1L;
    
    private String meetingNm;
    private String reservationNm;
    private String date;
    private String time;   

}

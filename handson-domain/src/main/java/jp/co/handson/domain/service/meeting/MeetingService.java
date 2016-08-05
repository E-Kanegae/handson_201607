/**
 * @(#)MeetingService.java
 * 
 */
package jp.co.handson.domain.service.meeting;

import jp.co.handson.domain.model.meeting.MeetingInputBean;
import jp.co.handson.domain.model.meeting.MeetingOutputBean;

/**
 * [このクラスの説明を書きましょう]
 * @version $Revision$
 */
public interface MeetingService {
    
    MeetingOutputBean display(MeetingInputBean input);

}

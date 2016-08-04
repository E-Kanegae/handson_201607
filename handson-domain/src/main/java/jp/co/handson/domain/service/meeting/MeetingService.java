/**
 * @(#)MeetingService.java
 * 
 * Copyright (c) 2017 GABA CORPORATION.
 */
package jp.co.handson.domain.service.meeting;

import jp.co.handson.domain.model.meeting.MeetingInputBean;
import jp.co.handson.domain.model.meeting.MeetingOutputBean;

/**
 * [このクラスの説明を書きましょう]
 * @author NTT DATA
 * @version $Revision$
 */
public interface MeetingService {
    
    MeetingOutputBean display(MeetingInputBean input);

}

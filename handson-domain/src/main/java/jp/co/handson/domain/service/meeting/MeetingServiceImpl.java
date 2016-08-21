/**
 * @(#)MeetingServiceImpl.java
 * 
 */
package jp.co.handson.domain.service.meeting;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.handson.domain.model.meeting.MeetingInputBean;
import jp.co.handson.domain.model.meeting.MeetingOutputBean;

/**
 * [このクラスの説明を書きましょう]
 * @version $Revision$
 */
@Service
@Transactional
public class MeetingServiceImpl implements MeetingService {

    /**
     * [どのようにオーバーライド、実装したか書きましょう]
     * @see jp.co.handson.domain.service.meeting.MeetingService#display(jp.co.handson.domain.model.meeting.MeetingInputBean)
     */
    @Override
    @Transactional(readOnly=true)
    public MeetingOutputBean display(MeetingInputBean input) {
        
        MeetingOutputBean output = new MeetingOutputBean();
        output.setMeetingId(input.getMeetingId());
        output.setMeetingNm("Aスタジオ");
        output.setReservationNm("E-Kanegae");
        output.setDate("2016/8/4");
        output.setTime("10:00-11:00");
        
        return output;
    }

}

/**
 * @(#)MeetingServiceImpl.java
 * 
 * Copyright (c) 2017 GABA CORPORATION.
 */
package jp.co.handson.domain.service.meeting;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.handson.domain.model.meeting.MeetingInputBean;
import jp.co.handson.domain.model.meeting.MeetingOutputBean;

/**
 * [このクラスの説明を書きましょう]
 * @author NTT DATA
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
        output.setMeetingNm("Aスタジオ");
        output.setReservationNm("鐘ヶ江 越");
        output.setDate("2016/8/4");
        output.setTime("10:00-11:00");
        
        return output;
    }

}
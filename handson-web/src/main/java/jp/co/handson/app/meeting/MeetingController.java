/**
 * @(#)MeetingController.java
 * 
 */
package jp.co.handson.app.meeting;

import javax.inject.Inject;

import jp.co.handson.domain.model.meeting.MeetingInputBean;
import jp.co.handson.domain.model.meeting.MeetingOutputBean;
import jp.co.handson.domain.service.meeting.MeetingService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <pre>
 * 会議室予約機能の以下の処理を記述するコントローラクラス<br>
 * <br>
 * 詳細画面表示処理<br>
 * 印刷画面表示処理<br>
 * </pre>
 * @version $Revision$
 */
@Controller
@RequestMapping("meeting")
public class MeetingController {
    
    @Inject
    MeetingService meetingService;
    
    @ModelAttribute
    private MeetingForm setupForm(){
        return new MeetingForm();
    }
    
    @RequestMapping(value="detail", method = RequestMethod.GET)
    public String display(@Validated MeetingForm meetingForm, BindingResult result, Model model){
        
        if(result.hasErrors()){
            return  "top/top";
        }
        //Form→IputBeanへのマッピング
        MeetingInputBean input = new MeetingInputBean();
        input.setMeetingId(meetingForm.getMeetingId());
        //サービスの呼び出し
        MeetingOutputBean output = meetingService.display(input);
        
        model.addAttribute("output", output);
        
        return "meeting/meetingDetail";
        
    }
    
    @RequestMapping(value="print", method = RequestMethod.GET)
    public String print(@Validated MeetingForm meetingForm, BindingResult result, Model model){
        
        if(result.hasErrors()){
            return  "meeting/meetingDetail";
        }
        
        //Form→IputBeanへのマッピング
        MeetingInputBean input = new MeetingInputBean();
        input.setMeetingId(meetingForm.getMeetingId());
        //サービスの呼び出し
        MeetingOutputBean output = meetingService.display(input);
        
        model.addAttribute("output", output);
        
        return "meetingDetailPdfView"; 
        
    }
    

}

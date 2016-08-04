/**
 * @(#)MeetingForm.java
 * 
 * Copyright (c) 2017 GABA CORPORATION.
 */
package jp.co.handson.app.meeting;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * [このクラスの説明を書きましょう]
 * @author NTT DATA
 * @version $Revision$
 */
@Data
public class MeetingForm implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @NotNull
    private String meetingId;
  
}

package jp.co.handson.app.view;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.handson.domain.model.meeting.MeetingOutputBean;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;


/**
 * <pre>
 * 会議室予約の詳細画面のPDF画面用view
 * </pre>
 * @author E-Kanegae
 *
 */
@Component
public class MeetingDetailPdfView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        MeetingOutputBean output = (MeetingOutputBean) model.get("output");
        
        //印刷画面用表示
        Table table = new Table(3);
        table.setBorderWidth(1);
        table.setBorderColor(new Color(0, 0, 255));
        table.setPadding(5);
        table.setSpacing(5);
        Cell cell = new Cell("header");
        cell.setHeader(true);
        cell.setColspan(3);
        table.addCell(cell);
        table.endHeaders();
        cell = new Cell("example cell with colspan 1 and rowspan 2");
        cell.setRowspan(2);
        cell.setBorderColor(new Color(255, 0, 0));
        table.addCell(cell);
        table.addCell("1.1");
        table.addCell("2.1");
        table.addCell("1.2");
        table.addCell("2.2");
        table.addCell("cell test1");
        cell = new Cell("big cell");
        cell.setRowspan(2);
        cell.setColspan(2);
        table.addCell(cell);
        table.addCell("cell test2");
        
        document.add(table);
    }

}

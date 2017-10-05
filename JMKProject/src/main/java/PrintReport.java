
import java.awt.Color;
import java.awt.Component;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PrintReport
{

    synchronized public void print(InputStream stream, HashMap hashMap, String sqlQuery, Component component, boolean show_print_dialog) throws SQLException
    {
        Connection con = null;
        try
        {
            
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sqlQuery);
            JasperDesign jasperDesign = JRXmlLoader.load(stream);
            jasperDesign.setQuery(query);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrintManager = JasperFillManager.fillReport(jasperReport, hashMap, con);
            if (!show_print_dialog)
            {
                PrintService service = PrintServiceLookup.lookupDefaultPrintService();
                JRPrintServiceExporter exporter = new JRPrintServiceExporter();
                exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE, service);
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrintManager);
                exporter.exportReport();
            }
            else
            {
                JasperViewer jasperViewer=new JasperViewer(jasperPrintManager, show_print_dialog);
                jasperViewer.setTitle("Container Report");
                jasperViewer.setBackground(Color.yellow);
                jasperViewer.setExtendedState(6);
//                jasperViewer.setAlwaysOnTop(true);
                jasperViewer.setLocationRelativeTo(component);
                jasperViewer.setVisible(true);
                
            }

            con.close();
        }
        catch (JRException exception)
        {
            JOptionPane.showMessageDialog(component, "Problem in generating report:\n" + exception, "Error", JOptionPane.ERROR_MESSAGE);
            try
            {
                if (con != null)
                {
                    con.close();
                }
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(component, e);
            }
        }
    }
}

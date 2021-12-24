package kata3_v1;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay_v1 extends ApplicationFrame {
    
    /**
     * Constructor de la subclase HistogramDisplay que invoca al constructor
     * de la superclase Histograma. 
     */
    public HistogramDisplay_v1() {
        super("HISTOGRAMA");
        setContentPane(createPanel()); //Contenedor para insertar componente Swing
        pack(); //La ventana tomará el tamaño más pequeño posible
    }
    
    public void execute() {
        setVisible(true); //Hacemos visible la ventana
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                "Dominios email", "Nº de emails", dataSet, 
                PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(2, "", "ulpgc.es");
        dataSet.addValue(2.5, "", "hotmail.com");
        dataSet.addValue(3, "", "gmail.com");
        dataSet.addValue(3.5, "", "outlook.com");
        dataSet.addValue(4, "", "yahoo.es");        
        
        return dataSet;
    }    
}
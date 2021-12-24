package kata3_v2;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay_v2 extends ApplicationFrame {
    
    private final Histogram_v2<String> histogram;
    
    /**
     * Constructor de la subclase HistogramDisplay que invoca al constructor
     * de la superclase Histograma. 
     * 
     * @param histogram
     */
    public HistogramDisplay_v2(Histogram_v2<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());        
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
        for(String key: histogram.keySet()) {
            dataSet.addValue(histogram.get(key),"",key);
        }       
        
        return dataSet;
    }    
}
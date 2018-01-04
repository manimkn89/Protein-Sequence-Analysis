import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class PieChart_AWT extends ApplicationFrame {

   public PieChart_AWT( String title ) {
      super( title );
      setContentPane(createDemoPanel( ));
   }

   private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Beta Sheet" , Percentage.el );
      dataset.setValue( "Coil" , Percentage.cl );
      dataset.setValue( "Alpha Helix" , Percentage.hl );
      dataset.setValue( "Turn" , Percentage.tl );
      dataset.setValue( "X" , Percentage.xl );
      return dataset;
   }

   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(
         "Prediction score",   // chart title
         dataset,          // data
         true,             // include legend
         true,
         false);

      return chart;
   }

   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );
      return new ChartPanel( chart );
   }

   public static void main( String[ ] args ) {
      PieChart_AWT demo = new PieChart_AWT( "Total Prediction" );
      demo.setSize( 560 , 367 );
      RefineryUtilities.centerFrameOnScreen( demo );
      demo.setVisible( true );
   }
}
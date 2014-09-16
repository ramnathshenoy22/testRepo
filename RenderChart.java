package analytics;

import static com.googlecode.charts4j.Color.*;
import static com.googlecode.charts4j.UrlUtil.normalize;
import java.util.*;

import org.apache.commons.lang3.time.*;
import com.googlecode.charts4j.*;

//start year start month, end year end month, product id

public class RenderChart {

	public RenderChart(){
	}
	
	static String gencode()  
    {  
        String[] letters = new String[15];  
        letters = "0123456789ABCDEF".split("");  
        String code ="";  
        for(int i=0;i<6;i++)  
        {  
            double ind = Math.random() * 15;  
            int index = (int)Math.round(ind);  
            code += letters[index];   
        }  
        return code;  
    }  
	
	static List<String> DatesBetween(Date startDate, Date endDate){
		ArrayList<String> dateList = new ArrayList<String>();
		Date sDate = startDate;
		while(sDate.before(endDate)){
			dateList.add(sDate.toString());
			Date tempDate = DateUtils.addMonths(sDate, 1);
			sDate = tempDate;
		}
		return dateList;
	}
	
	//public String RenderPieChart(String contract_id, Date monthYear){
	public String RenderPieChart(Map<String, Integer> productUsage){
		Date inputDate = null;
		//productUsage = InvokeMethod("product_id", inputDate.getMonth(), inputDate.getYear());
		String url = "";
		Integer total = 0;
		for(Integer val : productUsage.values()){
			total += val;
		}
		ArrayList<Slice> sliceArray= new ArrayList<Slice>();
		for(String key: productUsage.keySet()){
			Integer percent = (productUsage.get(key)/total)*100;
			Slice tempSlice = Slice.newSlice(percent,Color.newColor(gencode()), key, key);
			sliceArray.add(tempSlice);
		}
		
		PieChart chart = GCharts.newPieChart(sliceArray);
        chart.setTitle("PIE CHART", BLACK, 16);
        chart.setSize(500, 200);
        chart.setThreeD(true);
        url = chart.toURLString();

		return url;
	}
	
	public String RenderBarChart(ArrayList<String> products, Date startDate, Date endDate){
		Map<String, double[]> productUsageData = null;
		double[] vals = {100, 500, 1000, 1200, 400, 700};
		productUsageData.put("ABCDE", vals);
		double[] vals1 = {900, 700, 1500, 1300, 200, 600};
		productUsageData.put("TEFGD", vals1);
		double[] vals2 = {200, 900, 400, 1100, 1400, 800};
		productUsageData.put("NEPTD", vals2);
		double max_val = 0;
		
		ArrayList<BarChartPlot> barplots = new ArrayList<BarChartPlot>();
		for(String key: productUsageData.keySet()){
			BarChartPlot tempBar = Plots.newBarChartPlot(Data.newData(productUsageData.get(key)), Color.newColor(gencode()), key);
			barplots.add(tempBar);
			double[] values = productUsageData.get(key);
			for(int i = 0; i < values.length; i++) {
				if(values[i] > max_val){
					max_val = values[i];
				}
			}
		}
		BarChart chart = GCharts.newBarChart(barplots);
		
		AxisStyle axisStyle = AxisStyle.newAxisStyle(BLACK, 13, AxisTextAlignment.CENTER);
        AxisLabels usage = AxisLabelsFactory.newAxisLabels("Usage", 50.0);
        usage.setAxisStyle(axisStyle);
        AxisLabels monthYear = AxisLabelsFactory.newAxisLabels("Month/Year", 50.0);
        monthYear.setAxisStyle(axisStyle);
        
        chart.addXAxisLabels(AxisLabelsFactory.newAxisLabels(DatesBetween(startDate, endDate)));
        chart.addYAxisLabels(AxisLabelsFactory.newNumericRangeAxisLabels(0, max_val, 100));
        chart.addYAxisLabels(usage);
        chart.addXAxisLabels(monthYear);
        
        chart.setSize(600, 450);
        chart.setBarWidth(50);
        chart.setSpaceWithinGroupsOfBars(10);
        chart.setDataStacked(true);
        chart.setTitle("Product usage", BLACK, 16);
        chart.setGrid(100, 10, 3, 2);
        chart.setBackgroundFill(Fills.newSolidFill(ALICEBLUE));
        LinearGradientFill fill = Fills.newLinearGradientFill(0, LAVENDER, 100);
        fill.addColorAndOffset(WHITE, 0);
        chart.setAreaFill(fill);

		String url = chart.toURLString();
		return url;
	}
	
	public String RenderLineChart(){
		String url = "";
		
		return url;
	}
}

package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {
	T aggregator;
	String file;
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}
	
	
	
	public double runAggregator(int colIdx) throws IOException {
		StockFileReader filereader=new StockFileReader(file);
		List<String> lines=filereader.readFileData();
		colIdx--;
		for(String line:lines) {
			String[] value=line.split(",");
			double val=Double.parseDouble(value[colIdx]);
			aggregator.add(val);
			
		}
		return aggregator.calculate();
		
	}
	
	
	
}

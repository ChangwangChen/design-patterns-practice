import java.util.ArrayList;

public class WeatherData implements Subject
{
	private ArrayList observers;
	private float temp;
	private float pressure;
	private float humidity;
	
	public WeatherData()
	{
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o)
	{
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers()
	{
		int len = observers.size();
		for(int i = 0; i < len; i ++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged()
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure)
	{
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
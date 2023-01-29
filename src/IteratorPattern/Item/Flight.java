package IteratorPattern.Item;

public class Flight {

	public Flight(String source, String destination, double duration, String status) {
		this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.status = status;
	}

	String source;
	String destination;
	double duration;
	String status;

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getDuration() {
		return duration;
	}

	public String getStatus() {
		return status;
	}
}

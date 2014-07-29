package ca.vahidhoss.sensors;

import android.hardware.Sensor;

public class SensorItem {
	SensorItem(Sensor sensor) {
		this.sensor = sensor;
	}

	public String toString() {
		return sensor.getName();
	}

	Sensor getSensor() {
		return sensor;
	}

	private Sensor sensor;
}

package org.atakan.entity;

public class Weather {

	private String main;
	private String description;
	private String icon;
	
	public Weather() {}

	public Weather(String main, String description, String icon) {
		super();
		this.main = main;
		this.description = description;
		this.icon = icon;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	
}

package com.sigmataxi.sdrive.model;

public class MenuIcon {

	int IconName;
	public MenuIcon(int myTrips,int iconRes) {
		this.IconName=myTrips;
		this.IconResource=iconRes;
	}

	public int getIconName() {
		return IconName;
	}

	public void setIconName(int iconName) {
		IconName = iconName;
	}

	public int getIconResource() {
		return IconResource;
	}

	public void setIconResource(int iconResource) {
		IconResource = iconResource;
	}

	int IconResource;
}

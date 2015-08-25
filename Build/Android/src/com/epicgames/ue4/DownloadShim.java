package com.epicgames.ue4;

import com.YourCompany.CarProject.OBBDownloaderService;
import com.YourCompany.CarProject.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}


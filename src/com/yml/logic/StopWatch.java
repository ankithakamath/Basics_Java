package com.yml.logic;

import java.util.Scanner;

public class StopWatch 
{  
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	
	public static void run(String[]argz) throws Exception
	{
		StopWatch sw=new StopWatch();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Press '1' to Start Time: ");
		
		sw.start();
		Scanner in1 = new Scanner(System.in);
		int n1 = in1.nextInt();
		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}


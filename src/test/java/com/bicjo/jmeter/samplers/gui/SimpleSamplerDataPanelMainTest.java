package com.bicjo.jmeter.samplers.gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class SimpleSamplerDataPanelMainTest {

	public static void main(String[] args) {
		SimpleSampleDataPanel dataPanel = new SimpleSampleDataPanel();
		
		JFrame frame = new JFrame("Main Test");
		frame.setSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane((Container) dataPanel.createDataPanel());
		
//		frame.pack();
		frame.setVisible(true);
	}
	
}

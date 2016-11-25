package com.bicjo.jmeter.samplers.gui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.bicjo.jmeter.samplers.SimpleSampler;

public class SimpleSampleDataPanel {

	private JTextArea dataText = new JTextArea();
	
	public Component createDataPanel() {

		JLabel label = new JLabel("Data: "); //$NON-NLS-1$

		dataText.setName(SimpleSampler.DATA);
		label.setLabelFor(dataText);

		JPanel dataPanel = new JPanel(new BorderLayout(5, 0));
		dataPanel.add(label, BorderLayout.WEST);
		dataPanel.add(dataText, BorderLayout.CENTER);

		return dataPanel;
	
	}

	public void setDataTextValue(String t) {
		dataText.setText(t);
	}

	public String getDataTextValue() {
		return dataText.getText();
	}
	
	
	
}

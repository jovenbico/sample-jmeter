package com.bicjo.jmeter.samplers.gui;

import java.awt.BorderLayout;

import org.apache.jmeter.samplers.gui.AbstractSamplerGui;
import org.apache.jmeter.testelement.TestElement;

import com.bicjo.jmeter.samplers.SimpleSampler;

/**
 * @author joven
 * 
 * @This is the base class for GUI components which manage samplers.
 */
public class SimpleSamplerGui extends AbstractSamplerGui {

	private static final long serialVersionUID = 7692201636100496557L;

//	private JTextArea data;
	
	private SimpleSampleDataPanel dataPanel = new SimpleSampleDataPanel();

	public SimpleSamplerGui() {
		init();
	}

	@Override
	public String getStaticLabel() {
		return "simple-sample-sampler";
	}

	@Override
	public String getLabelResource() {
		// will do it with overriding getStaticLabel() and my own properties
		// file
		return null;
	}

	@Override
	public void configure(TestElement element) {
		dataPanel.setDataTextValue(element.getPropertyAsString(SimpleSampler.DATA));
		super.configure(element);
	}

	/**
	 * This method should create a new instance of your TestElement class.
	 * 
	 * and then pass it to the modifyTestElement (TestElement)
	 */
	@Override
	public TestElement createTestElement() {
		SimpleSampler sampler = new SimpleSampler();
		modifyTestElement(sampler);
		return sampler;
	}

	/**
	 * This is where you move the data from your gui elements to the TestElement
	 */
	@Override
	public void modifyTestElement(TestElement testElement) {
		testElement.clear();
		configureTestElement(testElement);
		testElement.setProperty(SimpleSampler.DATA, dataPanel.getDataTextValue());
	}

	private void init() {
		setLayout(new BorderLayout(0, 5));
		setBorder(makeBorder());
		add(makeTitlePanel(), BorderLayout.NORTH);

		// Specific setup
		add(dataPanel.createDataPanel(), BorderLayout.CENTER);
	}

//	private Component createDataPanel() {
//		JLabel label = new JLabel(JMeterUtils.getResString("example_data")); //$NON-NLS-1$
//
//		data = new JTextArea();
//		data.setName(SimpleSampler.DATA);
//		label.setLabelFor(data);
//
//		JPanel dataPanel = new JPanel(new BorderLayout(5, 0));
//		dataPanel.add(label, BorderLayout.WEST);
//		dataPanel.add(data, BorderLayout.CENTER);
//
//		return dataPanel;
//	}

}

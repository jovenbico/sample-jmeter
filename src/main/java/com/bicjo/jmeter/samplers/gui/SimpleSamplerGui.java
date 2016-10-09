package com.bicjo.jmeter.samplers.gui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.Box;

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

	public SimpleSamplerGui() {
		init();
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

	@Override
	public String getLabelResource() {
		// TODO
		return null;
	}

	/**
	 * This is where you move the data from your gui elements to the TestElement
	 */
	@Override
	public void modifyTestElement(TestElement te) {
		super.configureTestElement(te);
		// TODO
	}

	private void init() {
		setLayout(new BorderLayout());
		setBorder(makeBorder());
		Box box = Box.createVerticalBox();
		box.add(makeTitlePanel());
		box.add(makeSourcePanel());
		add(box, BorderLayout.NORTH);
		add(makeParameterPanel(), BorderLayout.CENTER);
	}

	@Override
	public void configure(TestElement element) {
		super.configure(element);
	}

	private Component makeParameterPanel() {
		// TODO
		return null;
	}

	private Component makeSourcePanel() {
		// TODO
		return null;
	}

}

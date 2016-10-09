package com.bicjo.jmeter.samplers;

import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;

public class SimpleSampler extends AbstractSampler {

	private static final long serialVersionUID = 7190918227654846185L;

	private int number1;
	private int number2;

	@Override
	public SampleResult sample(Entry entry) {

		SampleResult sampleResult = new SampleResult();
		sampleResult.setSampleLabel("simple-sampler");
		sampleResult.sampleStart();

		try {

			System.out.println("simple-sampler: " + number1 + number2);

			sampleResult.setSuccessful(Boolean.TRUE);
		} catch (Exception e) {
			sampleResult.setSuccessful(Boolean.FALSE);
		}

		sampleResult.sampleEnd();

		return sampleResult;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

}

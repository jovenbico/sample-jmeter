package com.bicjo.jmeter.samplers;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

public class SimpleSampler extends AbstractSampler {

	private static final long serialVersionUID = 7190918227654846185L;

	private static final Logger LOG = LoggingManager.getLoggerForClass();

	private static AtomicInteger classCount = new AtomicInteger(0);

	// The name of the property used to hold our data
	public static final String DATA = "ExampleSampler.data";

	public SimpleSampler() {
		trace("ExampleSampler()");
	}

	@Override
	public SampleResult sample(Entry entry) {

		SampleResult sampleResult = new SampleResult();
		sampleResult.setSampleLabel(getLabel());
		sampleResult.sampleStart();

		try {

			trace("sample()");

			sampleResult.setSamplerData(getPropertyAsString(DATA));

			sampleResult.setResponseCodeOK();
			sampleResult.setResponseMessage("OK");

		} catch (Exception e) {
			sampleResult.setResponseCode("500");
			sampleResult.setResponseMessage(e.toString());
			sampleResult.setSuccessful(Boolean.FALSE);
		}

		sampleResult.sampleEnd();
		sampleResult.setSuccessful(Boolean.TRUE);

		return sampleResult;
	}

	private String getLabel() {
		return this.getName();
	}

	private void trace(String s) {
		String tl = getLabel();
		String tn = Thread.currentThread().getName();
		String th = this.toString();
		LOG.info(tn + " (" + classCount.get() + ") " + tl + " " + s + " " + th);
	}

}

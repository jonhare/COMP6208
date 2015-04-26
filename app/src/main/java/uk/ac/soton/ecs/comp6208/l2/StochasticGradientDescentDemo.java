package uk.ac.soton.ecs.comp6208.l2;

import java.io.IOException;

import org.openimaj.content.slideshow.SlideshowApplication;

import uk.ac.soton.ecs.comp6208.utils.Utils;

public class StochasticGradientDescentDemo extends BatchGradientDescentDemo {
	int i = 0;

	@Override
	protected void performIteration() {
		final double error = error(new double[] { X[0][i], X[1][i] }, params);

		final double[] delta = new double[2];
		delta[0] += X[0][i] * error;
		delta[1] += error;

		params[0] = params[0] - alpha * delta[0];
		params[1] = params[1] - alpha * delta[1];

		i++;

		if (i >= X[0].length)
			i = 0;
	}

	public static void main(String[] args) throws IOException {
		new SlideshowApplication(new StochasticGradientDescentDemo(), 1024, 768, Utils.BACKGROUND_IMAGE);
	}
}

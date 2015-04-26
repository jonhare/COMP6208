package uk.ac.soton.ecs.comp6208.l2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openimaj.content.slideshow.PictureSlide;
import org.openimaj.content.slideshow.Slide;
import org.openimaj.content.slideshow.SlideshowApplication;

import uk.ac.soton.ecs.comp6208.utils.Utils;
import uk.ac.soton.ecs.comp6208.utils.annotations.JvmArgs;
import uk.ac.soton.ecs.comp6208.utils.annotations.Lecture;

@Lecture(title = "L2: Machine Learning with Big Data",
		handoutsURL = "https://github.com/jonhare/COMP6208/raw/master/handouts/pdf/L2-ml-with-big-data.pdf",
		slidesURL = "https://github.com/jonhare/COMP6208/raw/master/lectures/pdf/L2-ml-with-big-data.pdf")
@JvmArgs(vmArguments = "-Xmx1G")
public class Lecture2 {
	public static void main(String[] args) throws IOException {
		final List<Slide> slides = new ArrayList<Slide>();

		for (int i = 0; i <= 10; i++)
			slides.add(new PictureSlide(Lecture2.class.getResource(String.format("l2.%03d.jpg", i))));

		slides.add(new KMeansDemo());

		for (int i = 0; i <= 10; i++)
			slides.add(new PictureSlide(Lecture2.class.getResource(String.format("l2.%03d.jpg", i))));

		new SlideshowApplication(slides, 1024, 768, Utils.BACKGROUND_IMAGE);
	}
}

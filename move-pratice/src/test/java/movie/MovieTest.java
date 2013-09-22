package movie;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {
	private Movie movie;

	@Test
	public void should_return_0_without_rate() throws Exception {
		assertThat(movie.getAverage(), is(0));
	}

	@Before
	public void setup() {
		movie = new Movie();
	}
	
	@Test
	public void should_return_1_when_1_was_rated() throws Exception {
		movie.rate(1);
		assertThat(movie.getAverage(), is(1));
	}
	
	@Test
	public void should_return_4_when_rated_4_3_5() throws Exception {
		movie.rate(4);
		movie.rate(3);
		movie.rate(5);
		assertThat(movie.getAverage(), is(4));
	}
}

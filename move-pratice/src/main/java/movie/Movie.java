package movie;

public class Movie {

	private int sumOfRate = 0;
	private int countOfRate;

	public Integer getAverage() {
		return countOfRate == 0 ? 0 : sumOfRate / countOfRate;
	}

	public void rate(int rate) {
		sumOfRate += rate;
		countOfRate++;
	}

}

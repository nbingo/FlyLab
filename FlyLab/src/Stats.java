
public class Stats {
	
	/**
	 * Performs the chi^2 test on a list of values. Will return the % chance that the deviation was due to random chance in the future.
	 * @param observed a list of observed values
	 * @param expected a list of expected values corresponding to the observed values
	 * @return the chi^2 test of the given observed and expected values
	 */
	public static double chiSquared(double[] observed, double[] expected)
	{
		int sum = 0;
		for (int i = 0; i < observed.length; i++)
			sum += singleChiSquared(observed[i], expected[i]);
		return sum;
	}
	
	/**
	 * Calculates the chi^2 of a single observed and expected value using: (o-e)^2 / e.
	 * @param observed the observed value
	 * @param expected the expected value
	 * @return the single value for the chi^2 of the given observed and expected values
	 */
	private static double singleChiSquared(double observed, double expected)
	{
		if (expected == 0)
			return 0;
		return Math.pow((observed-expected), 2)/expected;
	}
}

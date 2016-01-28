
public class Stats {
	public static double chiSquared(double[] observed, double[] expected)
	{
		int sum = 0;
		for (int i = 0; i < observed.length; i++)
			sum += singleChiSquared(observed[i], expected[i]);
		return sum;
	}
	
	private static double singleChiSquared(double observed, double expected)
	{
		if (expected == 0)
			return 0;
		return Math.pow((observed-expected), 2)/expected;
	}
}

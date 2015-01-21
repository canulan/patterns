package builder;

public class NutritionFact {
	// Parameters initialized to default values (if any)
	private final int servingSize; // Required; no default value
	private final int servings; // "     " "      "
	private final int calories = 0;
	private final int fat = 0;
	private final int sodium = 0;
	private final int carbohydrate = 0;

	public NutritionFact(Builder builder) {
		this.servings = builder.servings;
		this.servingSize = builder.servingSize;
		//
	}

	private static class Builder {

		private final int servingSize;
		private final int servings;
		private int calories;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		//

		public NutritionFact build() {
			return new NutritionFact(this);
		}

	}


}

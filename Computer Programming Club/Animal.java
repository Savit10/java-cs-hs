public class Animal {
	// attributes
	String name;
	double water;
	int food; 
	int id;
	int weight;
	// constructor
	public Animal (String animalName, double waterPerDay, int foodPerDay, int cageID, int animalWeight)
	{
		name = animalName;
		water = waterPerDay;
		food = foodPerDay;
		id = cageID;
		weight = animalWeight;
	}
	// methods, note that these methods are void because we print the values out in the methods 
	// to avoid doing them repeatedly in the main method
	public static void outputAnimal(Animal animal)
	{
		System.out.println();
		System.out.println("The animal's name is " + animal.name + ", they drink " + animal.water + 
		" gallons of water per day and eat " + animal.food + " pounds of food per day, their cage ID is " + animal.id + 
		" and their weight is " + animal.weight + "\n");
	}
	public static void totalWater(Animal[] array )
	{
		double sum = 0.0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i].water;
		}
		System.out.println("Total water drank in a day by the animals is " + sum + " gallons\n");
	}
	public static void averageFood(Animal [] array)
	{
		double sum = 0.0;
		double average = 0.0;
		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i].food;
		}
		average = sum/array.length; 
		System.out.println("Average Food Eaten Per Day by an animal is " + average + " pounds \n");
	}
	public void cageID()
	{
		System.out.println("The animal " + this.name + " is in the cage " + this.id + ". \n");
	}
	public static void greaterWeight(Animal a, Animal b)
	{
		if (a.weight > b.weight)
		{
			System.out.println("The heavier animal is " + a.name + " with the weight of " + a.weight + "\n");
		}
		else
		{
			System.out.println("The heavier animal is " + b.name + " with the weight of " + b.weight + "\n");
		}
	}
	// Extension Problems
	public static void mostFood(Animal [] array)
	{
		int maxFood = array[0].food;
		int maxAnimal = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (maxFood < array[i].food)
			{
				maxFood = array[i].food;
				maxAnimal = i;
			}
		}
		System.out.println("The animal that eats the most food per day is " + array[maxAnimal].name + "\n");
	}
	public static void mostFoodPerWeight(Animal [] array)
	{
		int maxAverage = (array[0].food)/(array[0].weight);
		int maxAnimal = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (maxAverage < (array[i].food)/(array[i].weight))
			{
				maxAverage = (array[i].food)/(array[i].weight);
				maxAnimal = i;
			}
		}
		System.out.println("The animal that eats the most food per day per unit weight is " + array[maxAnimal].name + "\n");
	}
	// main method: instantiates/initializes the objects(Animals) and calls the methods
	// no processing done in the main method to get clean code
	public static void main (String[] args) {
		Animal tiger = new Animal("Tiger", 20.0, 25, 122, 220);
		Animal zebra = new Animal("Zebra", 3.6, 20, 97, 400);
		Animal giraffe = new Animal("Giraffe", 10.0, 75, 765, 1930);
		Animal rhino = new Animal("Rhino", 0.5, 120, 3, 2300);
		Animal [] array = {tiger, zebra, giraffe, rhino};
		outputAnimal(tiger);
		totalWater(array);
		averageFood(array);
		giraffe.cageID();
		greaterWeight(zebra, giraffe);
		mostFood(array);
		mostFoodPerWeight(array);
	}
}

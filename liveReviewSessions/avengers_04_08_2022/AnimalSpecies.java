package avengers_04_08_2022;

public class AnimalSpecies {
    /*
          Create a class AnimalSpecies
			- Create these variables in the class:
			 	- name (String),
				- population (int - for practice we can consider 1  unit as 1 million. Ex: population = 20 would represent 20 million ),
				- growth rate (int - percent number)

		- Create these methods :
			- setInfo()
				- parameters: name, population, and growth rate
				- returns: void
				- action: assigns the name, population, and growth rate of the object given from the parameters.

		- getName()
			 no parameters, returns the name variable

		- getPopulation ()
			 no parameters, returns the population variable

		- getGrowthRate()
			 no parameters, returns the growth rate variable

		- toString()   generate the toString method as shown in class.

		- Create a class Earth

		- Create AnimalSpecies objects, call  get methods of the objects
     */
private String name;  // instance variables and they belong to each object
private int population;
private int growthrate;

private static String ecoSystem;
static {
    ecoSystem="Earth";
}


public void setInfo(String name,int population, int growthrate){
    this.name=name;
    this.growthrate=growthrate;
    this.population= population;
}

    public AnimalSpecies(String name, int population, int growthrate) {
        this.name = name;
        this.population = population;
        this.growthrate = growthrate;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGrowthrate() {
        return growthrate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthrate=" + growthrate +
                '}';
    }
}

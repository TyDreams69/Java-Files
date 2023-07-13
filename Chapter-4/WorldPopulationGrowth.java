public class WorldPopulationGrowth {
    public static void main(String[] args) {
        int year = 2023;
        long currentPopulation = 8045311447L;
        int count = 1;
        double growthRate = 0.0088;

        System.out.println("Year  Anticipated world population  Numerical increase");

        while (count <= 75){
            long populationIncrease = (long) (growthRate * currentPopulation);
            long anticipatedPopulation = currentPopulation + populationIncrease;
            System.out.println(year + "    " + anticipatedPopulation + "                    " + populationIncrease );
            currentPopulation = anticipatedPopulation;
            ++year;
            ++count;
        }
    }
}

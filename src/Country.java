public class Country {
    private String name;
    private  int people;
    private  int arae;

    private String languages;


    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getArae() {
        return arae;
    }

    public void setArae(int arae) {
        this.arae = arae;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public static int getBiggestCountry(int[]countries) {
        int max = countries[0];
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] > max){
                max = countries[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", people=" + people +
                ", arae=" + arae +
                ", languages='" + languages + '\'' +
                '}';
    }


}

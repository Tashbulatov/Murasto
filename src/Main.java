public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        country.setName("Rassia");
        country.setPeople(500000);
        country.setArae(4000);
        country.setLanguages("rassia");

        Country country1 = new Country();
        country1.setName("Kazakstan");
        country1.setPeople(2000000);
        country1.setArae(405);
        country1.setLanguages("kazak");

        Country country2 = new Country();
        country2.setName("Kyrgystan");
        country2.setPeople(500);
        country2.setArae(10000);
        country2.setLanguages("Kyrgyz");


        int[] countries={country.getArae(),country1.getArae(), country2.getArae()};
        System.out.println(Country.getBiggestCountry(countries));
    }

}

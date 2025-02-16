public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double earthRadiusKm = 6371;
        double earthVolumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);
        double conversionFactor = 0.621371;
        double earthRadiusMiles = earthRadiusKm * conversionFactor;
        double earthVolumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);
        System.out.println("Volume of Earth in km^3: " + earthVolumeKm3);
        System.out.println("Volume of Earth in miles^3: " + earthVolumeMiles3);
    }
}

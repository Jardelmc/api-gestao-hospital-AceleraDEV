package gestao.utils.geolocalizacao;

class DistanciaEntreCoordenadas {
    public static int EARTH_RADIUS_KM = 6371;
    public static Double distancia(Coordenadas origem, Coordenadas destino) {

        double firstLatToRad = Math.toRadians(origem.getLatitude());
        double secondLatToRad = Math.toRadians(destino.getLatitude());

        double deltaLongitudeInRad = Math.toRadians(destino.getLongitude()
                - origem.getLatitude());

       return Math.acos(Math.cos(firstLatToRad) * Math.cos(secondLatToRad)
                * Math.cos(deltaLongitudeInRad) + Math.sin(firstLatToRad)
                * Math.sin(secondLatToRad))
                * EARTH_RADIUS_KM;

    }

}

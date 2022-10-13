public class Main {

    public static void main(String[] args) {

        Endereco enderecoRestauranteCyberLamen = new Endereco();

        Endereco enderecoRestauranteCyberLamen2 = new Endereco("12.345.678","Endereco Restaurante Cyber Lamen");
        Endereco enderecoRestauranteSteamBarbecue = new Endereco("23.456.789","Endereco Restaurante Steam Barbecue");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante Cyber Lamen");
        restaurante.setCnpj("00.000.000/0001-00");
        restaurante.setEndereco(enderecoRestauranteCyberLamen2);
        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante Steam Barbecue");
        restaurante2.setCnpj("00.000.000/0001-02");
        restaurante2.setEndereco(enderecoRestauranteSteamBarbecue);
        System.out.println(restaurante2);

    }
}
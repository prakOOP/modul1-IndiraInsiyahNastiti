class Main {
    public static void main(String[] args){

        // membuat objek Kendaraan
        Kendaraan mobil = new Kendaraan("Rush", 80);

        System.out.println(mobil.getName());
        System.out.println(mobil.getKecepatan());
        mobil.setName("Pajero");
        mobil.setKecepatan(100);
        System.out.println(mobil.getName());
        System.out.println(mobil.getKecepatan());

    }
}
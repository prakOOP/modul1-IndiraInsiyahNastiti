class Kendaraan {

    // definisi atribut
    String name;
    int kecepatan;

    //constructor dengan parameter
    Kendaraan(String name, int kecepatan){
        this.name=name;
        this.kecepatan=kecepatan;
    }

    //Accessor
    public String getName(){
        return name;
    }

    //Accesor
    public int getKecepatan(){
        return kecepatan;
    }

    //Mutator
    public void setName(String name){
        this.name=name;
    }

    //Mutator
    public void setKecepatan(int kecepatan){
        this.kecepatan=kecepatan;
    }

    // definisi method run
    void jalan(){
        System.out.println(name +" is running...");
        System.out.println("Kecepatan: "+ kecepatan);
    }

    // definisi method pelambatan untuk mengecek penurunan kecepatan
    boolean pelambatan(){
        if(kecepatan <= 20) return true;
        return false;
    }

}

void main() {

    // soal 1
    System.out.println("Soal 1");
    int StukturBaris;
    // System.out.println(StukturBaris);

    // soal 2
    System.out.println("Soal 2");
    String KataBaru = "Deklarasi tipe data String";
    System.out.println(KataBaru);

    // soal 3
    System.out.println("Soal 3");
    int[] empatAngka = { 7, 10, 20, 23};
    for (int i : empatAngka){
        System.out.println(i);
    }

    // soal 4
    System.out.println("Soal 4");
    String[][] Angka = {
            {
                "1", "3", "5",
            },
            {
                "14", "19", "20",
            },
            {
                "22", "27", "29",
            }
    };
    for(int i = 0; i < Angka.length; i++) {
        for(int j = 0; j < Angka[i].length; j++){
            System.out.println(Angka[i][j]);
        }
    }

    // soal 5
    System.out.println("Soal 5");
    LinkedList<Integer> listAngka = new LinkedList<>();
    listAngka.add(22);
    listAngka.add(19);
    listAngka.add(44);
    listAngka.add(60);
    listAngka.add(72);
    for(int i :  listAngka){
        System.out.println(i);
    }

}

import java.util.Random;
class Main {

  public static void main(String[] args)
  {
    Random rand = new Random();
    String nazwy[] = {"Spider-Man", "Batman", "Iron-Man", "Thor", "Ant-Man"};
    String daty[] = {"12.12.2022", "13.12.2022", "14.12.2022", "15.12.2022"};
    String godziny[] = {"11:00", "14:00", "18:00", "21:00"};
    int maxrzad = 15;
    int maxmiejsce = 10;

    Bilet b1 = new Bilet(nazwy[rand.nextInt(nazwy.length)], daty[rand.nextInt(daty.length)], godziny[rand.nextInt(godziny.length)], rand.nextInt(maxrzad), rand.nextInt(maxmiejsce), Math.round(rand.nextDouble(50-20)+20));
    b1.Drukuj();
    b1.ZmienMiejsce(20,30);
    b1.ZmienMiejsce(3,5);
    b1.Drukuj();
    
    
  }
}
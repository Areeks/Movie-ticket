public class Bilet
{
  private String nazwa_filmu;
  private String data;
  private String godzina;
  private int rzad;
  private int miejsce;
  private double cena;

  private boolean checkMiejsce(int rzad, int miejsce)
  {
    if((rzad>0 && rzad<=15) && (miejsce>0 && miejsce<=10))
      return true;
    else
      return false;
  }
  public Bilet(String nazwa_filmu, String data, String godzina, int rzad, int miejsce, double cena)
  {
    if(checkMiejsce(rzad,miejsce))
    {
      this.nazwa_filmu = nazwa_filmu;
      this.data = data;
      this.godzina = godzina;
      this.rzad = rzad;
      this.miejsce = miejsce;
      this.cena = cena;
    }
    else
      System.out.println("Błąd zmiany miejsca - Maksymalnie 15 rzad i maksymalnie 10 miejse");
  }

  public void Drukuj()
  {
    System.out.println("Informacja o bilecie");
    System.out.println("--------------------");
    System.out.println("Film: " + nazwa_filmu);
    System.out.println("Data: " + data);
    System.out.println("Godzina: " + godzina);
    System.out.println("Rzad: " + rzad);
    System.out.println("Miejsce: " + miejsce);
    System.out.printf("Cena: %.2f zł\n", cena);
  }

  public void ZmienMiejsce(int rzad, int miejsce)
  {
    if(checkMiejsce(rzad,miejsce))
    {
      this.rzad = rzad;
      this.miejsce = miejsce;
    }
     else
      System.out.println("Błąd zmiany miejsca - Maksymalnie 15 rzad i maksymalnie 10 miejse");
  }

  
}
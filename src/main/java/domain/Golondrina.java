package domain;

public class Golondrina {
  public Golondrina(int energia) {
    this.energia = energia;
  }

  private int energia;

  public int getEnergia() {
    return this.energia;
  }
  public void volar() {
    this.energia = this.energia - 10;
  }

  public void comer(int comida) {
    this.energia = this.energia + (3 * comida);
  }

}
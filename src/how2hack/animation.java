/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how2hack;

/**
 *
 * @author pangilinan#1
 */
public class animation extends Thread {

  @Override
  public void run() {
    try {

      for (int i = 0; i <= 9; ++i) {

        System.out.println();

        for (int k = 0; k <= 9 - i; ++k) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i; ++j) {
          Thread.sleep(20);

          if (j == 0 || j == i) {
            System.out.print(" *");
          } else {
            System.out.print("  ");
          }
        }

      }

      for (int w = 0; w <= 3; ++w) {
        System.out.println();
        int ant = 10;
        for (int s = 0; s <= w; ++s) {
          System.out.print(" ");
        }

        for (int q = 0; q <= ant; ++q) {

          if (q == 0 || q == 9 - w) {
            System.out.print(" *");
            Thread.sleep(80);
          } else {
            System.out.print("  ");

          }

        }

      }

    } catch (Exception e) {
      System.out.println(e);

    }
  }

}
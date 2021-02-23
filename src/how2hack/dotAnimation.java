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
public class dotAnimation extends Thread {

  public void loading(int num) {
    for (int i = 0; i <= num; ++i) {
      run();
    }
  }

  @Override
  public void run() {
    try {

      Thread.sleep(200);
      System.out.print(".");

    } catch (Exception wew) {
      System.out.print(wew);
    }
  }

}

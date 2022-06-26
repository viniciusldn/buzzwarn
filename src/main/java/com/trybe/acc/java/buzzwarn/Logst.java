package com.trybe.acc.java.buzzwarn;

import org.apache.logging.log4j.Logger;

public class Logst {

  private Logger logging;

  public Logst(Logger log) {
    this.logging = log;
  }

  /**
   * CountLogger. Insira sua lógica aqui.
   */
  public void countLogger() {
    int i = 1;
    while (i <= 30) {
      this.buzzWarn(i);
      i++;
    }
  }

  private void buzzWarn(int number) {
    if (number % 5 == 0 & number % 3 == 0) {
      logging.warn(number);
    } else if (number % 5 == 0) {
      logging.debug(number);
    } else if (number % 3 == 0) {
      logging.trace(number);
    }
    logging.info(number);
  }
}

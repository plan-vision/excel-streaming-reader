package com.thundermoose.xlsx.exceptions;

/**
 * Created by tayjones on 4/20/14.
 */
public class ReadException extends RuntimeException {

  public ReadException() {
    super();
  }

  public ReadException(String msg) {
    super(msg);
  }

  public ReadException(Exception e) {
    super(e);
  }

  public ReadException(String msg, Exception e) {
    super(msg, e);
  }
}
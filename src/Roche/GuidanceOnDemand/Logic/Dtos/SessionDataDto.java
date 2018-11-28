package Roche.GuidanceOnDemand.Logic.Dtos;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Roche.GuidanceOnDemand.Logic.Dtos.*;
import jio.System.*;

public class SessionDataDto {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setToken(java.lang.String value) {
    try {
      javonetHandle.set("Token", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getToken() {
    try {
      java.lang.String res = javonetHandle.get("Token");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSecret(java.lang.String value) {
    try {
      javonetHandle.set("Secret", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSecret() {
    try {
      java.lang.String res = javonetHandle.get("Secret");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAlias(java.lang.String value) {
    try {
      javonetHandle.set("Alias", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAlias() {
    try {
      java.lang.String res = javonetHandle.get("Alias");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setExpiresOn(DateTime value) {
    try {
      javonetHandle.set("ExpiresOn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DateTime getExpiresOn() {
    try {
      Object res = javonetHandle.<NObject>get("ExpiresOn");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SessionDataDto() {
    try {
      javonetHandle = Javonet.New("Roche.GuidanceOnDemand.Logic.Dtos.SessionDataDto");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SessionDataDto(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

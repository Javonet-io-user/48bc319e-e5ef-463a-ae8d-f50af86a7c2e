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

public class UserDto {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setUserId(java.lang.String value) {
    try {
      javonetHandle.set("UserId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUserId() {
    try {
      java.lang.String res = javonetHandle.get("UserId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUserName(java.lang.String value) {
    try {
      javonetHandle.set("UserName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUserName() {
    try {
      java.lang.String res = javonetHandle.get("UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFirstname(java.lang.String value) {
    try {
      javonetHandle.set("Firstname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFirstname() {
    try {
      java.lang.String res = javonetHandle.get("Firstname");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLastname(java.lang.String value) {
    try {
      javonetHandle.set("Lastname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLastname() {
    try {
      java.lang.String res = javonetHandle.get("Lastname");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPrimaryEmail(java.lang.String value) {
    try {
      javonetHandle.set("PrimaryEmail", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPrimaryEmail() {
    try {
      java.lang.String res = javonetHandle.get("PrimaryEmail");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIsManager(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsManager", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsManager() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsManager");
      if (res == null) return false;
      return javonetHandle.get("IsManager");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public UserDto() {
    try {
      javonetHandle = Javonet.New("Roche.GuidanceOnDemand.Logic.Dtos.UserDto");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UserDto(NObject handle) {
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

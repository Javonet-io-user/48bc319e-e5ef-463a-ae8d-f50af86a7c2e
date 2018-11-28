package Roche.GuidanceOnDemand.Logic.Services;

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
import Roche.GuidanceOnDemand.Logic.Services.*;
import Roche.GuidanceOnDemand.Logic.Dtos.*;
import jio.System.Collections.Generic.*;
import Roche.GuidanceOnDemand.Logic.Interfaces.*;

public class CornerstoneService implements ICornerstoneService {
  protected NObject javonetHandle;

  public CornerstoneService(
      java.lang.String token, java.lang.String tokenSecret, java.lang.String serviceUrl) {
    try {
      javonetHandle =
          Javonet.New(
              "Roche.GuidanceOnDemand.Logic.Services.CornerstoneService",
              token,
              tokenSecret,
              serviceUrl);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CornerstoneService(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public UserDto GetUser(java.lang.String userId) {
    try {
      Object res = javonetHandle.explicitInterface("ICornerstoneService").invoke("GetUser", userId);
      if (res == null) return null;
      return new UserDto((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IList<TranscriptDto> GetUserTranscript(
      java.lang.String userId, IList<java.lang.String> trainingIds) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("ICornerstoneService")
              .invoke("GetUserTranscript", userId, trainingIds);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

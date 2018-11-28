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
import jio.System.Net.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class CornerstoneMultiResponseDto<TDto> {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStatus(HttpStatusCode value) {
    try {
      javonetHandle.set("Status", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HttpStatusCode getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return HttpStatusCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setData(IList<TDto> value) {
    try {
      javonetHandle.set("Data", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IList<TDto> getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTimeStamp(Nullable<DateTime> value) {
    try {
      javonetHandle.set("TimeStamp", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<DateTime> getTimeStamp() {
    try {
      Object res = javonetHandle.<NObject>get("TimeStamp");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public CornerstoneMultiResponseDto(Class<?> TDto) {
    try {
      javonetHandle =
          Javonet.getType(
                  "Roche.GuidanceOnDemand.Logic.Dtos.CornerstoneMultiResponseDto`1",
                  getReturnObjectName(TDto))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CornerstoneMultiResponseDto(NObject handle) {
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

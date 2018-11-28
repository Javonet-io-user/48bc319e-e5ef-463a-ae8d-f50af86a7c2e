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

public class CornerstoneSingleResponseDto<TDto> extends CornerstoneMultiResponseDto<TDto> {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStatusAsCornerstoneSingleResponseDto(java.lang.String value) {
    try {
      javonetHandle.set("Status", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getStatusAsCornerstoneSingleResponseDto() {
    try {
      java.lang.String res = javonetHandle.get("Status");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void DataAsCornerstoneSingleResponseDto(TDto value) {
    try {
      javonetHandle.invoke("set_Data", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TDto DataAsCornerstoneSingleResponseDto(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Data");
      if (res == null) return null;
      return (TDto) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public CornerstoneSingleResponseDto(Class<?> TDto) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "Roche.GuidanceOnDemand.Logic.Dtos.CornerstoneSingleResponseDto`1",
                  getReturnObjectName(TDto))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CornerstoneSingleResponseDto(NObject handle) {
    super(handle);
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

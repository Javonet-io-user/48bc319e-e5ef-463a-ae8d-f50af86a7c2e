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
import jio.System.Collections.Generic.*;

public class TranscriptDataDto {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTranscripts(IList<TranscriptDto> value) {
    try {
      javonetHandle.set("Transcripts", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IList<TranscriptDto> getTranscripts() {
    try {
      Object res = javonetHandle.<NObject>get("Transcripts");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TranscriptDataDto() {
    try {
      javonetHandle = Javonet.New("Roche.GuidanceOnDemand.Logic.Dtos.TranscriptDataDto");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TranscriptDataDto(NObject handle) {
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

package Roche.GuidanceOnDemand.Logic.Interfaces;

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
import Roche.GuidanceOnDemand.Logic.Interfaces.*;
import Roche.GuidanceOnDemand.Logic.Dtos.*;
import jio.System.Collections.Generic.*;

public interface ICornerstoneService {
  public UserDto GetUser(java.lang.String userId);

  public IList<TranscriptDto> GetUserTranscript(
      java.lang.String userId, IList<java.lang.String> trainingIds);
}

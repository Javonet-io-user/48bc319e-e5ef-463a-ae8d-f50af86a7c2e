package jio.System.Net;

public enum HttpStatusCode {
  Continue(100L),
  SwitchingProtocols(101L),
  OK(200L),
  Created(201L),
  Accepted(202L),
  NonAuthoritativeInformation(203L),
  NoContent(204L),
  ResetContent(205L),
  PartialContent(206L),
  MultipleChoices(300L),
  MovedPermanently(301L),
  Redirect(302L),
  SeeOther(303L),
  NotModified(304L),
  UseProxy(305L),
  Unused(306L),
  TemporaryRedirect(307L),
  BadRequest(400L),
  Unauthorized(401L),
  PaymentRequired(402L),
  Forbidden(403L),
  NotFound(404L),
  MethodNotAllowed(405L),
  NotAcceptable(406L),
  ProxyAuthenticationRequired(407L),
  RequestTimeout(408L),
  Conflict(409L),
  Gone(410L),
  LengthRequired(411L),
  PreconditionFailed(412L),
  RequestEntityTooLarge(413L),
  RequestUriTooLong(414L),
  UnsupportedMediaType(415L),
  RequestedRangeNotSatisfiable(416L),
  ExpectationFailed(417L),
  UpgradeRequired(426L),
  InternalServerError(500L),
  NotImplemented(501L),
  BadGateway(502L),
  ServiceUnavailable(503L),
  GatewayTimeout(504L),
  HttpVersionNotSupported(505L),
  ;
  private long numVal;

  HttpStatusCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

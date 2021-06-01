package com.wutsi.tracking

import com.wutsi.tracking.dto.PushTrackRequest
import com.wutsi.tracking.dto.PushTrackResponse
import feign.Headers
import feign.RequestLine

public interface TrackingApi {
  @RequestLine("POST /v1/tracks")
  @Headers("Content-Type: application/json")
  public fun push(request: PushTrackRequest): PushTrackResponse
}

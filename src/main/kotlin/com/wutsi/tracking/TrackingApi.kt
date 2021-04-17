package com.wutsi.tracking

import com.wutsi.tracking.dto.PushTrackRequest
import com.wutsi.tracking.dto.PushTrackResponse
import feign.RequestLine

public interface TrackingApi {
  @RequestLine("POST /v1/tracks")
  public fun push(request: PushTrackRequest): PushTrackResponse
}

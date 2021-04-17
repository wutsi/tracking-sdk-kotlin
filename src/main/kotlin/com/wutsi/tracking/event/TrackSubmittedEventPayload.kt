package com.wutsi.tracking.event

import com.wutsi.tracking.dto.PushTrackRequest

data class TrackSubmittedEventPayload(
  val request: PushTrackRequest = PushTrackRequest()
)
